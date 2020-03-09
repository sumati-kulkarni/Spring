package org.test.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.test.hibernate.entity.User;

public class App {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			// Create object of entity type "User"
			User user = new User("username", "password", "firstName", "lastName");
			
			// Start the transaction using session
			session.beginTransaction();
			
			// Perform CRUD operation
			session.save(user);
			
			// Commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Row added successfully!");
			
			
			
			// session.beginTransaction();
			// User insertUser = new User();
			// insertUser = session.get(User.class, 1);
			
			// To update
			// insertUser.setFirstName("Sumi");
			
			// To delete
			// session.delete(insertUser);
			// session.getTransaction().commit();
			// System.out.println(insertUser);
			
			
			// To list records
			// session.beginTransaction();
			// List<User> users = session.createQuery("from users").getResultList();
			// List<User> users = session.createQuery("from users where first_name = 'sumati'").getResultList();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
