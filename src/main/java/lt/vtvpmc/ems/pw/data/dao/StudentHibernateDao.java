package lt.vtvpmc.ems.pw.data.dao;


import lt.vtvpmc.ems.pw.data.HibernateUtil;
import lt.vtvpmc.ems.pw.data.dao.interfaces.StudentDao;
import lt.vtvpmc.ems.pw.data.entities.Student;
import org.hibernate.Session;

import java.util.List;

public class StudentHibernateDao extends AbstractDao<Student,Long> implements StudentDao {

	@Override
	public List<Student> findByLastName(String lastName) {
		//add implementation here...
		return null;
	}

}
