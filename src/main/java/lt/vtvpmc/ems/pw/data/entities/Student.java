package lt.vtvpmc.ems.pw.data.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "STUDENT")
public class Student implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STUDENT_ID")
    private Long id;

    @OneToOne(mappedBy="student")
    public ApplicationForm form;

    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "DATE_OF_BIRTH")
    private String dateOfBirth;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "MUNICIPALITY")
    private String municipality;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "EDUCATION")
    private String education;
    @Column(name = "NAME_OF_SCHOOL_GRADUATED")
    private String schoolGraduated;
    @Column(name = "YEAR_OF_GRADUATION")
    private int schoolGraduationYear;
    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;
    @Column(name="GROUP")
    private String group;


    public Student() {
    }

    public Student(String firstName, String lastName, String dateOfBirth, String address, String municipality, String phoneNumber, String email, String education, String schoolGraduated, int schoolGraduationYear, String maritalStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.municipality = municipality;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.education = education;
        this.schoolGraduated = schoolGraduated;
        this.schoolGraduationYear = schoolGraduationYear;
        this.maritalStatus = maritalStatus;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public ApplicationForm getForm() {
        return form;
    }  

    public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void setForm(ApplicationForm form) {
        this.form = form;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSchoolGraduated() {
        return schoolGraduated;
    }

    public void setSchoolGraduated(String schoolGraduated) {
        this.schoolGraduated = schoolGraduated;
    }

    public int getSchoolGraduationYear() {
        return schoolGraduationYear;
    }

    public void setSchoolGraduationYear(int schoolGraduationYear) {
        this.schoolGraduationYear = schoolGraduationYear;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}