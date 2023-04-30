package com.hibEmployeeMngmt;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
        employee e1=new employee();
         
         e1.setEmpId(7);
         e1.setEmpName("Preethi");
         e1.setEmpProject("Java Project");
         e1.setEmpLocation("Hyd");
        
         
       Configuration con=new Configuration().configure().addAnnotatedClass(employee.class);
       SessionFactory sf=con.buildSessionFactory();
       
       Session ses=sf.openSession();
       Transaction tr=ses.beginTransaction();
       ses.save(e1);
       tr.commit();
       
       System.out.println(e1);
       
    }
}
 