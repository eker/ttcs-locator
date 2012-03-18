package org.taoist.locator;

import org.hibernate.Session;
import org.taoist.locator.model.Location;
import org.taoist.locator.util.HibernateUtil;

/**
 * Hello world!
 */
public class App
{
	// TODO : move this to unit test
	public static void main(String[] args)
	{
		System.out.println("start test Hibernate");

		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Location location = new Location();
		location.setLocationId(1);
		location.setCity("Amsterdam");
		location.setXpos(52.37306D);
		location.setYpos(4.89222D);

		session.save(location);
		session.getTransaction().commit();

		System.out.println("complete test Hibernate");
	}
}
