package lt.vtvpmc.ems.pw.controllers;

import java.io.Serializable;

import javax.validation.Valid;

import lt.vtvpmc.ems.pw.data.dao.AbstractDao;
import lt.vtvpmc.ems.pw.data.entities.ApplicationForm;
import lt.vtvpmc.ems.pw.data.entities.Student;
import lt.vtvpmc.ems.pw.data.entities.TeachingPlan;

public class StudentPageBean {
	
	public static class StudentData {
		
		@Valid
		private Student newStudent;
		
		@Valid
		private Student currentStudent;
		
		@Valid
		private ApplicationForm newApplicationForm;
		
		@Valid
		private ApplicationForm currentApplicationForm;
		
		@Valid
		private TeachingPlan newTeachingPlan;
		
		@Valid
		private TeachingPlan currentTeachingPlan;
		
		public void init(){
			newStudent = new Student();
			newApplicationForm = new ApplicationForm();
			newTeachingPlan = new TeachingPlan();
		}

		public Student getNewStudent() {
			return newStudent;
		}

		public void setNewStudent(Student newStudent) {
			this.newStudent = newStudent;
		}

		public Student getCurrentStudent() {
			return currentStudent;
		}

		public void setCurrentStudent(Student currentStudent) {
			this.currentStudent = currentStudent;
		}

		public ApplicationForm getNewApplicationForm() {
			return newApplicationForm;
		}

		public void setNewApplicationForm(ApplicationForm newApplicationForm) {
			this.newApplicationForm = newApplicationForm;
		}

		public ApplicationForm getCurrentApplicationForm() {
			return currentApplicationForm;
		}

		public void setCurrentApplicationForm(ApplicationForm currentApplicationForm) {
			this.currentApplicationForm = currentApplicationForm;
		}

		public TeachingPlan getNewTeachingPlan() {
			return newTeachingPlan;
		}

		public void setNewTeachingPlan(TeachingPlan newTeachingPlan) {
			this.newTeachingPlan = newTeachingPlan;
		}

		public TeachingPlan getCurrentTeachingPlan() {
			return currentTeachingPlan;
		}

		public void setCurrentTeachingPlan(TeachingPlan currentTeachingPlan) {
			this.currentTeachingPlan = currentTeachingPlan;
		}
		
	}
	
		private StudentData data;
		private AbstractDao<Student, Serializable> dao;
		
		public String addNewStudent(){
			data.newStudent.setApplicationForm(data.newApplicationForm);
			dao.save(data.newStudent);
			data.newStudent = new Student();
			data.newApplicationForm = new ApplicationForm();
			return null;
		}

		public StudentData getData() {
			return data;
		}

		public void setData(StudentData data) {
			this.data = data;
		}

		public AbstractDao<Student, Serializable> getDao() {
			return dao;
		}

		public void setDao(AbstractDao<Student, Serializable> dao) {
			this.dao = dao;
		}
		
}
