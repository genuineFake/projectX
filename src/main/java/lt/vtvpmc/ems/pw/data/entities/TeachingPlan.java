package lt.vtvpmc.ems.pw.data.entities;

import javax.persistence.*;

/**
 * Created by fnord on 17.4.6.
 */
@Entity
@Table(name = "TEACHING_PLAN")
public class TeachingPlan {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "MANDATORY_ID")
    public TeachingPlanMandatory mandatory;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OPTIONAL_ID")
    public SubjectsToChoose optional;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TEACHING_PLAN_ID")
    private String id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TeachingPlanMandatory getMandatory() {
        return mandatory;
    }

    public void setMandatory(TeachingPlanMandatory mandatory) {
        this.mandatory = mandatory;
    }

    public SubjectsToChoose getOptional() {
        return optional;
    }

    public void setOptional(SubjectsToChoose optional) {
        this.optional = optional;
    }
}
