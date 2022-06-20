package com;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JDBCDemo1 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
	     //get the connection
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");

        //CREATE THE STATEMENT

        Statement stmt=con.createStatement();

        //execute query
       
        int i=stmt.executeUpdate("insert into student3 values('dia',103,5000)");
     System.out.println("data inserted  "+i);
        
        boolean b=stmt.
                execute("create table student3(sname varchar(20),sid int,fees int)");
                 System.out.println("table created");


       int j=stmt.executeUpdate("insert into student3 values(102,'harshi',44000)");
       System.out.println("data inserted  "+j);
       
         ResultSet rs1=stmt.executeQuery("select * from student3");
         
        while(rs1.next()) {
         
         System.out.println(rs1.getInt(1)+"  "+rs1.getString(2)+" "+rs1.getInt(3));
         
        }
         
        // int j=stmt.executeUpdate("update student set sname='Tina' where sid=102");
       //  System.out.println("record updated "+j);
         
      //  boolean rs3=stmt.execute("delete from student where sid=102");
     //   System.out.println("record deleted "+rs3);
         

                  //  boolean b=stmt.
              // execute("create table student(sname varchar(20),sid int,fees int)");
              //      System.out.println("table created");



      //   boolean b1=stmt.execute("drop table student3");
      //   System.out.println("Table dropped");


        con.close();
    }
 
}





