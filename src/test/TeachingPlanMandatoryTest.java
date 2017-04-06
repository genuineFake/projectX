/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2010, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */


import junit.framework.TestCase;
import lt.vtvpmc.ems.pw.data.entities.TeachingPlanMandatory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;


public class TeachingPlanMandatoryTest extends TestCase {
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
        session.save( new TeachingPlanMandatory(2, 1, 0, 1, 3, 0, 0, 0, 1, 2, 6, 4, 2, 2, 0, 0, 0, 2, 3 , 2, 0 ));
        session.save( new TeachingPlanMandatory(4, 2, 3, 1, 3, 0, 0, 0, 1, 2, 6, 4, 2, 2, 0, 0, 0, 2, 3 , 2, 0 ));
        session.getTransaction().commit();
        session.close();


        session = sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery( "from TeachingPlanMandatory" ).list();
        for ( TeachingPlanMandatory m : (List<TeachingPlanMandatory>) result ) {
            System.out.println( "Test (" + m.getId() + ") : " + m.getTikyba() );
        }
        session.getTransaction().commit();
        session.close();
    }
}
