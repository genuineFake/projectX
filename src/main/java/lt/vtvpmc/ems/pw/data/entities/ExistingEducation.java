package lt.vtvpmc.ems.pw.data.entities;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table (name = "EXISTING_EDUCATION")
public class ExistingEducation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String existingEducation;
	private String institutionName;
	private String institutionType;
	
	@Temporal(TemporalType.DATE)
	private Date graduationYear;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExistingEducation() {
		return existingEducation;
	}

	public void setExistingEducation(String existingEducation) {
		this.existingEducation = existingEducation;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getInstitutionType() {
		return institutionType;
	}

	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}

	public Date getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(Date graduationYear) {
		this.graduationYear = graduationYear;
	}
	
	
}
