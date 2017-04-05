import junit.framework.TestCase;
import lt.vtvpmc.ems.pw.data.entities.ApplicationForm;
import lt.vtvpmc.ems.pw.data.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;


public class ApplicationFormTest extends TestCase {
    private SessionFactory sessionFactory;

    @Override
    protected void setUp() throws Exception {

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        try {
            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {

            StandardServiceRegistryBuilder.destroy( registry );
        }
    }

    @Override
    protected void tearDown() throws Exception {
        if ( sessionFactory != null ) {
            sessionFactory.close();
        }
    }

    @SuppressWarnings({ "unchecked" })
    public void testBasicUsage() {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Student student1 = new Student();
        student1.setFirstName("Mary Jane");
        ApplicationForm form1 = new ApplicationForm();

        form1.setAcquiredSpecialisation("History");
        form1.setApplicationFee(true);
        form1.setConscriptDocument(false);
        form1.setCopyOfId(true);
        form1.setDateOfApplication("2000");
        form1.setDateOfGraduation("1000");
        form1.setDorm("dorm");
        form1.setEducationDocument(true);
        form1.setFather("father");
        form1.setFathersAddress("fAddress");
        form1.setFathersPhone("111111");
        form1.setGotInfoAboutUs("friends");
        form1.setSchoolGroup("gg");
        form1.setGuardian("");
        form1.setGuardiansAddress("");
        form1.setGuardiansPhone("");
        form1.setSchoolLevel("level");
        form1.setMedicalCertificate(true);
        form1.setMother("mother");
        form1.setMothersAddress("mAdress");
        form1.setMothersPhone("22222");
        form1.setNameOfInstitution("Vilnius University");
        form1.setPhotos(true);
        form1.setStudent(student1);
        form1.setTypeOfInstitution("type");
        form1.setWithdrawnApplication(false);
        session.save(form1);

        Student student2 = new Student("John Doe", "test", "test", "test", "test", "test", "test", "test", "test", 2002, "test");
        session.save( new ApplicationForm(student2, "Math", "MIT", "University", "2000", "2005", "test6", "test7", true, true, true, true, true, true, "test3", "test4", "test5", "test6", "test7", "test8", "test9", "some address", "test11", "test1", "test2", false));
        session.getTransaction().commit();
        session.close();


        session = sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery( "from ApplicationForm" ).list();
        for ( ApplicationForm f : (List<ApplicationForm>) result ) {
            System.out.println( "Test (" + f.getAcquiredSpecialisation() + ") : " + f.getNameOfInstitution() );
            System.out.println(f.getStudent().getFirstName());
        }

        session.getTransaction().commit();
        session.close();
    }
}
