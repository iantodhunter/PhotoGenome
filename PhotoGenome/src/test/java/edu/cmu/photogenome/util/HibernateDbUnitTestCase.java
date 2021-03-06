package edu.cmu.photogenome.util;

import org.dbunit.DBTestCase;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract class for testing Hibernate dependent data access classes
 */
public abstract class HibernateDbUnitTestCase extends DBTestCase {

	final Logger log = LoggerFactory.getLogger(HibernateDbUnitTestCase.class);
	
	private static SessionFactory sessionFactory;  
    protected Session session;  
    
    public HibernateDbUnitTestCase() {
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS, "com.mysql.jdbc.Driver");  
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL, "jdbc:mysql://pg-db.c41slebym6tm.us-east-1.rds.amazonaws.com:3306/pg_db_test");  
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME, "root");
        System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD, "msit2013");
    }
    
	@Before
	public void setUp() throws Exception {
        log.info("Loading hibernate...");  
        if (sessionFactory == null) {  
            sessionFactory = HibernateUtil.getSessionFactory("hibernate-test.cfg.xml");  
        }  
  
        //session = sessionFactory.openSession();
        //session.setFlushMode(FlushMode.MANUAL);
        //ManagedSessionContext.bind((org.hibernate.classic.Session) session);
        //session.beginTransaction();
        session = sessionFactory.openSession();
        HibernateUtil.beginTransaction(session);
        super.setUp(); 
	}

	@After
	public void tearDown() throws Exception {
		//ManagedSessionContext.unbind(sessionFactory);
		//session.flush();
		//session.getTransaction().commit();
		//session.close();
		HibernateUtil.commitTransaction(session);
		super.tearDown();
	}
    
	/** {@inheritDoc} */  
    protected IDataSet getDataSet() throws Exception {
        return new FlatXmlDataSet(this.getClass().getClassLoader().getResourceAsStream("PG_Test_Data.xml"));  
    } 
}
