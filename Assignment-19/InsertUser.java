//Task - 3

import java.sql.Connection;
import java.sql.CallableStatement;


public class InsertUser {

  public static void main(String[] args) {

    try  { 

      CallableStatement stmt  ("{call insert_user(?, ?, ?, ?)}");

      stmt.setInt(1, 1);
      stmt.setString(2, "Vicky_Boy_23");
      stmt.setString(3, "0987vickyboy@gmail.com");
      stmt.setString(4, "password");

      stmt.execute();

      System.out.println("User inserted successfully!");
      

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
