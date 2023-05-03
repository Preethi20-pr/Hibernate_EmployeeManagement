package com.hibEmployeeMngmt;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
        //employee e1=new employee();
         
//      e1.setEmpId(9);
//      e1.setEmpName("Bindu");
//      e1.setEmpProject("Java Project");
//      e1.setEmpLocation("hyd");       
         
       Configuration con=new Configuration().configure().addAnnotatedClass(employee.class);
       SessionFactory sf=con.buildSessionFactory();
       
       Session ses=sf.openSession();
       Transaction tr=ses.beginTransaction();
//       employee e2=new employee();
      //ses.save(e1);
       

//     to fetch  employee  data based on primary key
      // e2=ses.get(employee.class,8);
       

       
       // to fetch the employee data based on non primary key
//      String city="vskps";
//      e2=(employee)ses.createQuery("from employee where empLocation=:city").setParameter("city", city).uniqueResult();
  

       
     // to fetch  all employee names and their Id
     Query qu=ses.createQuery("from employee");
     List<employee> li=qu.list();
     for(employee e:li)
     System.out.println(e.getEmpId()+":"+e.getEmpName());
    
 
       
       //to update employee location based on id
//       Query q=ses.createQuery("update employee set empLocation=:location where empId=:id").setParameter("location","Pune").setParameter("id",9);
//       int status =q.executeUpdate();
//       System.out.println(status);
   
       
     //to delete employee based on employee id
//       Query qu=ses.createQuery("delete from employee where empId=:id").setParameter("id",0);
//       System.out.println(qu.executeUpdate());	
       
       
       tr.commit();  
     //System.out.println("employee name is "+e2.getEmpName());
   	
   	//System.out.println(e2);
   
      
       
    }
}
 