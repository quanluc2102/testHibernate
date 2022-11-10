/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.main;

import com.mycompany.domainmodel.Employee;
import com.mycompany.untilities.Connect;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author quanl
 */
public class SinhVien {

    /**
     * @param args the command line arguments
     */
    public Integer addEmployee(String fname, String lname, int salary) {
        Session session = Connect.getFACTORY().openSession();
        Transaction tx = null;
        Integer employeeID = null;
        try {
            tx = session.beginTransaction();
            Employee employee = new Employee(fname, lname, salary);
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }

    public static void main(String[] args) {
        Session session = Connect.getFACTORY().openSession();
        Employee manageEmployee = new Employee();
//        List<Employee> list = session.createCriteria(Employee.class).list();
//        Query query = session.createQuery("FROM EMPLOYEE");
//        List<Employee> list = query.getResultList();
//        for (Employee sinhVien : list) {
//            System.out.println(sinhVien.toString());
//        }
        manageEmployee.setId(1);
        manageEmployee.setFirstName("Meo");
        manageEmployee.setLastName("Cho");

        manageEmployee.setSalary(9999);
//        manageEmployee.setId(4);
//        session.delete(manageEmployee);
        session.update("1", manageEmployee);

        session.close();
    }

}
