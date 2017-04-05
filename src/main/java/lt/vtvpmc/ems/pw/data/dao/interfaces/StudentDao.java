package lt.vtvpmc.ems.pw.data.dao.interfaces;



import lt.vtvpmc.ems.pw.data.entities.Student;

import java.util.List;

public interface StudentDao extends Dao<Student,Long> {

	public List<Student> findByLastName(String lastName);
}
