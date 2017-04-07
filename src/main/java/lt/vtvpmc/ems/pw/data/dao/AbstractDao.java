package lt.vtvpmc.ems.pw.data.dao;


import lt.vtvpmc.ems.pw.data.HibernateUtil;
import lt.vtvpmc.ems.pw.data.dao.interfaces.Dao;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.Query;

public class AbstractDao<T,ID extends Serializable> implements Dao<T,ID> {

	private Class<T> persistentClass;
	private Session session;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void setSession(Session session){
		this.session = session;
	}
	
	protected Session getSession(){
		if(this.session == null){
			this.session = HibernateUtil.getSessionFactory().getCurrentSession();
		}
		return this.session;
	}
	
	public Class<T> getPersistentClass(){
		return persistentClass;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T findById(ID id) {
		return (T) getSession().load(this.getPersistentClass(), id);
	}
	
	@Override
	public T findBySurname (String surname){
		return (T) getSession().load(this.getPersistentClass(), surname);
	}
	
	@Override
	public int totalHoursMandatoryById (Long id){
		SQLQuery query = session.createSQLQuery("SELECT TIKYBA + ETIKA + lIETUVIU_IR_LIETRATURA_4 + LIETUVIU_IR_LITARATURA_6 + GIMTOJI_RUSU + GIMTOJI_LENKU + UZSIENIO_ANGLU + UZSIENIO_VOKIECIU + UZSIENIO_PRANCUZU + UZSIENIO_RUSU + ISTORIJA + GEOGRAFIJA + INTEGRUOTAS_SOC_MOKSLU_KURSAS + MATEMATIKA + BENDROJI_KUNO_KULTURA + FUTBOLAS + KREPSINIS + BIOLOGIJA + FIZIKA + CHEMIJA + INT_GAMTOS_MOKSLAI FROM TEACHING_PLAN_MANDATORY WHERE STUDENT_ID=" + id);
		return (int) query.uniqueResult();
	}
	
	@Override
	public int totalHoursChoosenById (Long id){
		SQLQuery query = session.createSQLQuery("SELECT RUSU_II + ANGLU_II + VOKIECIU_II + DIZAINAS + DAILE + TEATRAS + MUZIKA + INFORMACINES_TECHNOLOGIJOS + LIETUVIU_GIMT_ISPL + LIETUVIU_VALST_ISPL + UZSIENIO_KALBA_iSPL + ISTORIJA_ISPL + MATEMATIKA_ISPL + BIOLOGIJA_ISPL + FIZIKA_ISPL + CHEMIJA_ISPL + BIOLOGIJA_MOD_I + BIOLOGIJA_MOD_II + CHEMIJA_MOD + FIZIKA_MOD_I + FIZIKA_MOD_II + FIZIKA_MOD_III + MATEMATIKA_MOD_I + MATEMATIKA_MOD_II + MATEMATIKA_MOD_III FROM SUBJECTS_TO_CHOOSE WHERE STUDENT_ID=" + id);
		return (int) query.uniqueResult();
	}

	@Override
	public List<T> findAll() {
		return this.findByCriteria();
	}

	@SuppressWarnings("unchecked")
	protected List<T> findByCriteria(Criterion... criterion){
		Criteria crit = this.getSession().createCriteria(this.getPersistentClass());
		
		for(Criterion c: criterion){
			crit.add(c);
		}
		return (List<T>) crit.list();
		
	}
	@Override
	public T save(T entity) {
		this.getSession().saveOrUpdate(entity);
		return entity;
	}

	@Override
	public void delete(T entity) {
		this.getSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getSession().flush();
	}

	@Override
	public void clear() {
		this.getSession().clear();
	}

}
