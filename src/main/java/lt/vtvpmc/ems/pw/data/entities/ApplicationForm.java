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
    private Boolean CopyOfId;
    @Column(name = "CONSCRIPT_DOCUMENT")
    private Boolean conscriptDocument;
    @Column(name = "APPLICATION_FEE")
    private Boolean ApplicationFee;
    @Column(name = "FATHER")
    private String father;
    @Column(name = "FATHERS_ADDRESS")
    private String fathersAddress;
    @Column(name = "FATHERS_PHONE")
    private String fathersPhone;
    @Column(name = "MOTHER")
    private String mother;
    @Column(name = "MOTHERS_ADDRESS")
    private String mothersAddress;
    @Column(name = "MOTHERS_PHONE")
    private String mothersPhone;
    @Column(name = "GUARDIAN")
    private String guardian;
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

    public ApplicationForm(Student student, String acquiredSpecialisation, String nameOfInstitution, String typeOfInstitution, String dateOfGraduation, String dateOfApplication, String schoolGroup, String schoolLevel, Boolean educationDocument, Boolean medicalCertificate, Boolean photos, Boolean copyOfId, Boolean conscriptDocument, Boolean applicationFee, String father, String fathersAddress, String fathersPhone, String mother, String mothersAddress, String mothersPhone, String guardian, String guardiansAddress, String guardiansPhone, String dorm, String gotInfoAboutUs, Boolean withdrawnApplication) {
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
        CopyOfId = copyOfId;
        this.conscriptDocument = conscriptDocument;
        ApplicationFee = applicationFee;
        this.father = father;
        this.fathersAddress = fathersAddress;
        this.fathersPhone = fathersPhone;
        this.mother = mother;
        this.mothersAddress = mothersAddress;
        this.mothersPhone = mothersPhone;
        this.guardian = guardian;
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
        return CopyOfId;
    }

    public void setCopyOfId(Boolean copyOfId) {
        CopyOfId = copyOfId;
    }

    public Boolean getConscriptDocument() {
        return conscriptDocument;
    }

    public void setConscriptDocument(Boolean conscriptDocument) {
        this.conscriptDocument = conscriptDocument;
    }

    public Boolean getApplicationFee() {
        return ApplicationFee;
    }

    public void setApplicationFee(Boolean applicationFee) {
        ApplicationFee = applicationFee;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
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

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
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

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
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
