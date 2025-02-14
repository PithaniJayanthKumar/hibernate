package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import entities.Student;
import utilities.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        // Open session
        Session session = HibernateUtil.getSessionFactory().openSession();

        // Begin transaction
        Transaction transaction = session.beginTransaction();

        // Create a new Student object
        Student student = new Student("Jayanth");

        // Save the Student object
        session.save(student);

        // Commit transaction
        transaction.commit();

        // Print student details
        System.out.println("Student inserted successfully: " + student);

        // Close session
        session.close();
    }
}
