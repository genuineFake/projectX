package lt.vtvpmc.ems.pw.data.dao.interfaces;

import org.hibernate.Session;

import java.util.List;

public interface Dao<T,ID> {

	public T findById(ID id);
	
	public List<T> findAll();
	
	public T save(T entity);
	
	public void delete(T entity);
	
	public void flush();
	
	public void clear();

	public void setSession(Session session);

	public T findBySurname(String surname);

	int totalHoursMandatoryById(Long id);

	int totalHoursChoosenById(Long id);
}
