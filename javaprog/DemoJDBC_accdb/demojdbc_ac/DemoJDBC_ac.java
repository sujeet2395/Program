package demojdbc_ac;

import java.sql.*;

public class DemoJDBC_ac {

    public static void main(String[] args) {
        try {
            String database = "MyDatabase.accdb";
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://E:\\sujeet\\netbeans_project\\DemoJDBC_ac\\" + database, "sujeet", "12345");
            System.out.println(con);
            int i;
            PreparedStatement stmt=null;
            String query="";
//            query="INSERT INTO EmpDetails (Emp_ID,Name,Address,Designation,Salary) VALUES (?,?,?,?,?)";
//            stmt = con.prepareStatement(query);
//            stmt.setInt(1, 105); // Employee ID
//            stmt.setString(2, "Raman"); // Name
//            stmt.setString(3, "T-683 Baljeet Nagar"); // Address
//            stmt.setString(4, "manager"); // Designation
//            stmt.setInt(5, 50000); // Salary
//            i = stmt.executeUpdate();
//            System.out.println(i + " records inserted");


//            query = "Update EmpDetails set Address=? where Emp_ID=?";
//            stmt = con.prepareStatement(query);
//            stmt.setString(1, "Gurgaon");
//            stmt.setInt(2, 1);
//            i = stmt.executeUpdate();
//            System.out.println(i + " records updated");

              query="Select * from EmpDetails";
              stmt=con.prepareStatement(query);
              ResultSet rs=stmt.executeQuery();
              ResultSetMetaData ms=rs.getMetaData();
              String s="";
              int count=ms.getColumnCount();
              while(rs.next())
              {
                  for(i=1; i<=count;i++)
                  {
                      s+=rs.getString(i);
                      if(i!=count)
                          s+=" ";
                  }
                  System.out.println(s);
                  s="";
              }

            con.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

}
