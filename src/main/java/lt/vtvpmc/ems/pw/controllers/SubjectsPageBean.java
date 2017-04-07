package lt.vtvpmc.ems.pw.controllers;

import java.io.Serializable;

import javax.validation.Valid;

import lt.vtvpmc.ems.pw.data.dao.AbstractDao;
import lt.vtvpmc.ems.pw.data.entities.Student;
import lt.vtvpmc.ems.pw.data.entities.TeachingPlan;

public class SubjectsPageBean {
	
	public static class TeachingPlanData implements Serializable {
		
		private static final long serialVersionUID = -605086702036666014L;

		@Valid
		private Student newStudent;
		
		@Valid
		private TeachingPlan newTeachingPlan;
		
		private int totalHoursMandatory;
		private int totalHoursChoosen;
		private int totalHoursAll;
		
		public void init(){
			newStudent = new Student();
			newTeachingPlan = new TeachingPlan();
		}

		public Student getNewStudent() {
			return newStudent;
		}

		public void setNewStudent(Student newStudent) {
			this.newStudent = newStudent;
		}

		public TeachingPlan getNewTeachingPlan() {
			return newTeachingPlan;
		}

		public void setNewTeachingPlan(TeachingPlan newTeachingPlan) {
			this.newTeachingPlan = newTeachingPlan;
		}

		public int getTotalHoursMandatory() {
			return totalHoursMandatory;
		}

		public void setTotalHoursMandatory(int totalHoursMandatory) {
			this.totalHoursMandatory = totalHoursMandatory;
		}

		public int getTotalHoursChoosen() {
			return totalHoursChoosen;
		}

		public void setTotalHoursChoosen(int totalHoursChoosen) {
			this.totalHoursChoosen = totalHoursChoosen;
		}

		public int getTotalHoursAll() {
			return totalHoursAll;
		}

		public void setTotalHoursAllById(int totalHoursAll) {
			this.totalHoursAll = totalHoursAll;
		}
	}
	
		private TeachingPlanData data;
		private AbstractDao<TeachingPlan, ?> dao;
		
		public String addNewPlan(){
			dao.save(data.newTeachingPlan);
			data.newTeachingPlan = new TeachingPlan();
			return "main";
		}
		
		public String loadTeachingPlan(){
			dao.findAll();
			data.newTeachingPlan = new TeachingPlan();
			return "report";
		}
		
		public void totalHoursMandatory(){
			data.totalHoursMandatory = dao.totalHoursMandatoryById(data.newStudent.getId());
		}
		
		public void totalHoursChoosen(){
			data.totalHoursChoosen = dao.totalHoursChoosenById(data.newStudent.getId());
		}
		
		public void totalHoursAllById(){
			data.totalHoursAll = dao.totalHoursMandatoryById(data.newStudent.getId()) + dao.totalHoursChoosenById(data.newStudent.getId());
		}

		public TeachingPlanData getData() {
			return data;
		}

		public void setData(TeachingPlanData data) {
			this.data = data;
		}

		public AbstractDao<TeachingPlan, ?> getDao() {
			return dao;
		}

		public void setDao(AbstractDao<TeachingPlan, ?> dao) {
			this.dao = dao;
		}
		
}
