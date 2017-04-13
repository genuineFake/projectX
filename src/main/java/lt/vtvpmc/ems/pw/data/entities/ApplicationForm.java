package lt.vtvpmc.ems.pw.data.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by fnord on 17.3.25.
 */
@Entity
@Table(name = "APPLICATION_FORM")
public class ApplicationForm implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "APPLICATION_ID")
    @GeneratedValue
    private long applicationId;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="STUDENT_ID")
    private Student student;
    
    @Column(name = "ACQUIRED_SPECIALISATION")
    private String acquiredSpecialisation;
    @Column(name = "NAME_OF_INSTITUTION")
    private String nameOfInstitution;
    @Column(name = "TYPE_OF_INSTITUTION")
    private String typeOfInstitution;
    @Column(name = "DATE_OF_GRADUATION")
    private String dateOfGraduation;
    @Column(name = "DATE_OF_APPLICATION")
    private String dateOfApplication;
    @Column(name = "SCHOOL_GROUP")
    private String schoolGroup;
    @Column(name = "SCHOOL_LEVEL")
    private String schoolLevel;
    @Column(name = "EDUCATION_DOCUMENT")
    private Boolean educationDocument;
    @Column(name = "MEDICAL_CERTIFICATE")
    private Boolean medicalCertificate;
    @Column(name = "PHOTOS")
    private Boolean photos;
    @Column(name = "COPY_OF_ID")
    private Boolean copyOfId;
    @Column(name = "CONSCRIPT_DOCUMENT")
    private Boolean conscriptDocument;
    @Column(name = "APPLICATION_FEE")
    private Boolean applicationFee;
    @Column(name = "FATHER_NAME")
    private String fathersName;
    @Column(name = "FATHER_SURNAME")
    private String fathersSurname;
    @Column(name = "FATHERS_ADDRESS")
    private String fathersAddress;
    @Column(name = "FATHERS_PHONE")
    private String fathersPhone;
    @Column(name = "MOTHER_NAME")
    private String mothersName;
    @Column(name = "MOTHER_SURNAME")
    private String mothersSurname;
    @Column(name = "MOTHERS_ADDRESS")
    private String mothersAddress;
    @Column(name = "MOTHERS_PHONE")
    private String mothersPhone;
    @Column(name = "GUARDIANS_NAME")
    private String guardiansName;
    @Column(name = "GUARDIANS_SURNAME")
    private String guardiansSurname;
    @Column(name = "GUARDIANS_ADDRESS")
    private String guardiansAddress;
    @Column(name = "GUARDIANS_PHONE")
    private String guardiansPhone;
    @Column(name = "DORM")
    private String dorm;
    @Column(name = "GOT_INFO_ABOUT_US")
    private String gotInfoAboutUs;
    @Column(name = "APPLICATION_WITHDRAWN")
    private Boolean withdrawnApplication;

    public ApplicationForm(Student student, String acquiredSpecialisation, String nameOfInstitution, String typeOfInstitution, String dateOfGraduation, String dateOfApplication, String schoolGroup, String schoolLevel, Boolean educationDocument, Boolean medicalCertificate, Boolean photos, Boolean copyOfId, Boolean conscriptDocument, Boolean applicationFee, String fathersName, String fathersSurname, String fathersAddress, String fathersPhone, String mothersName, String mothersSurname, String mothersAddress, String mothersPhone, String guardiansName, String guardiansSurname, String guardiansAddress, String guardiansPhone, String dorm, String gotInfoAboutUs, Boolean withdrawnApplication) {
        this.student = student;
        this.acquiredSpecialisation = acquiredSpecialisation;
        this.nameOfInstitution = nameOfInstitution;
        this.typeOfInstitution = typeOfInstitution;
        this.dateOfGraduation = dateOfGraduation;
        this.dateOfApplication = dateOfApplication;
        this.schoolGroup = schoolGroup;
        this.schoolLevel = schoolLevel;
        this.educationDocument = educationDocument;
        this.medicalCertificate = medicalCertificate;
        this.photos = photos;
        this.copyOfId = copyOfId;
        this.conscriptDocument = conscriptDocument;
        this.applicationFee = applicationFee;
        this.fathersName = fathersName;
        this.fathersSurname = fathersSurname;
        this.fathersAddress = fathersAddress;
        this.fathersPhone = fathersPhone;
        this.mothersName = mothersName;
        this.mothersSurname = mothersSurname;
        this.mothersAddress = mothersAddress;
        this.mothersPhone = mothersPhone;
        this.guardiansName = guardiansName;
        this.guardiansSurname = guardiansSurname;
        this.guardiansAddress = guardiansAddress;
        this.guardiansPhone = guardiansPhone;
        this.dorm = dorm;
        this.gotInfoAboutUs = gotInfoAboutUs;
        this.withdrawnApplication = withdrawnApplication;
    }

    public ApplicationForm() {
    }

    public long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(long id) {
        this.applicationId = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getAcquiredSpecialisation() {
        return acquiredSpecialisation;
    }

    public void setAcquiredSpecialisation(String acquiredSpecialisation) {
        this.acquiredSpecialisation = acquiredSpecialisation;
    }

    public String getNameOfInstitution() {
        return nameOfInstitution;
    }

    public void setNameOfInstitution(String nameOfInstitution) {
        this.nameOfInstitution = nameOfInstitution;
    }

    public String getTypeOfInstitution() {
        return typeOfInstitution;
    }

    public void setTypeOfInstitution(String typeOfInstitution) {
        this.typeOfInstitution = typeOfInstitution;
    }

    public String getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(String dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    public String getDateOfApplication() {
        return dateOfApplication;
    }

    public void setDateOfApplication(String dateOfApplication) {
        this.dateOfApplication = dateOfApplication;
    }

    public String getSchoolGroup() {
        return schoolGroup;
    }

    public void setSchoolGroup(String group) {
        this.schoolGroup = group;
    }

    public String getSchoolLevel() {
        return schoolLevel;
    }

    public void setSchoolLevel(String level) {
        this.schoolLevel = level;
    }

    public Boolean getEducationDocument() {
        return educationDocument;
    }

    public void setEducationDocument(Boolean educationDocument) {
        this.educationDocument = educationDocument;
    }

    public Boolean getMedicalCertificate() {
        return medicalCertificate;
    }

    public void setMedicalCertificate(Boolean medicalCertificate) {
        this.medicalCertificate = medicalCertificate;
    }

    public Boolean getPhotos() {
        return photos;
    }

    public void setPhotos(Boolean photos) {
        this.photos = photos;
    }

    public Boolean getCopyOfId() {
        return copyOfId;
    }

    public void setCopyOfId(Boolean copyOfId) {
        this.copyOfId = copyOfId;
    }

    public Boolean getConscriptDocument() {
        return conscriptDocument;
    }

    public void setConscriptDocument(Boolean conscriptDocument) {
        this.conscriptDocument = conscriptDocument;
    }

    public Boolean getApplicationFee() {
        return applicationFee;
    }

    public void setApplicationFee(Boolean applicationFee) {
        this.applicationFee = applicationFee;
    }

    public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getFathersSurname() {
		return fathersSurname;
	}

	public void setFathersSurname(String fathersSurname) {
		this.fathersSurname = fathersSurname;
	}

	public String getFathersAddress() {
		return fathersAddress;
	}

	public void setFathersAddress(String fathersAddress) {
		this.fathersAddress = fathersAddress;
	}

	public String getFathersPhone() {
		return fathersPhone;
	}

	public void setFathersPhone(String fathersPhone) {
		this.fathersPhone = fathersPhone;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public String getMothersSurname() {
		return mothersSurname;
	}

	public void setMothersSurname(String mothersSurname) {
		this.mothersSurname = mothersSurname;
	}

	public String getMothersAddress() {
		return mothersAddress;
	}

	public void setMothersAddress(String mothersAddress) {
		this.mothersAddress = mothersAddress;
	}

	public String getMothersPhone() {
		return mothersPhone;
	}

	public void setMothersPhone(String mothersPhone) {
		this.mothersPhone = mothersPhone;
	}

	public String getGuardiansName() {
		return guardiansName;
	}

	public void setGuardiansName(String guardiansName) {
		this.guardiansName = guardiansName;
	}

	public String getGuardiansSurname() {
		return guardiansSurname;
	}

	public void setGuardiansSurname(String guardiansSurname) {
		this.guardiansSurname = guardiansSurname;
	}

	public String getGuardiansAddress() {
		return guardiansAddress;
	}

	public void setGuardiansAddress(String guardiansAddress) {
		this.guardiansAddress = guardiansAddress;
	}

	public String getGuardiansPhone() {
		return guardiansPhone;
	}

	public void setGuardiansPhone(String guardiansPhone) {
		this.guardiansPhone = guardiansPhone;
	}

	public String getDorm() {
        return dorm;
    }

    public void setDorm(String dorm) {
        this.dorm = dorm;
    }

    public String getGotInfoAboutUs() {
        return gotInfoAboutUs;
    }

    public void setGotInfoAboutUs(String gotInfoAboutUs) {
        this.gotInfoAboutUs = gotInfoAboutUs;
    }

    public Boolean getWithdrawnApplication() {
        return withdrawnApplication;
    }

    public void setWithdrawnApplication(Boolean withdrawnApplication) {
        this.withdrawnApplication = withdrawnApplication;
    }
}
