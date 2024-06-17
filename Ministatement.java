
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;

public class Ministatement extends JFrame {
 String pno;
    Ministatement(String pno){
        this.pno=pno;
       setTitle("Mini Statement");
       setLayout(null);
       
        JLabel l = new JLabel();
        l.setBounds(20,140,400,200);
        add(l);
        
        JLabel l1 = new JLabel("BOI Bank");
           l1.setBounds(150,20,100,20);
            add(l1); 
            
             JLabel l3 = new JLabel();
           l3.setBounds(20,80,300,20);
            add(l3);
            
              JLabel l4 = new JLabel();
           l4.setBounds(20,400,300,20);
            add(l4);
            
            try{
               Conn con = new Conn();
              
             ResultSet rs = con.s.executeQuery("select * from login where pin = '"+pno+"'");   
               while(rs.next()){
                    l3.setText("Card Number: " + rs.getString("cardNumber").substring(0,4)+"XXXXXXXX"+rs.getString("cardNumber").substring(12));  
               }  
            
            }catch(Exception e)
                  {
                  System.out.println(e);
                  }
            
       try{
               Conn con = new Conn();
                int ba=0;
             ResultSet rs = con.s.executeQuery("select * from bank where pin = '"+pno+"'");   
               while(rs.next()){
                   l.setText(l.getText()+"<html>" +rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
                
               if(rs.getString("type").equals("Deposit")){
                     ba+=Integer.parseInt(rs.getString("amount"));
                 } else {
                     ba-=Integer.parseInt(rs.getString("amount"));
                 }     
               } 
                l4.setText("Your current account balance is Rs " + ba);
            }catch(Exception e)
                  {
                  System.out.println(e);
                  }     
            
        setSize(400,600);
         setLocation(20,20);
          getContentPane().setBackground(Color.WHITE);
          setVisible(true);
    }
   
    public static void main(String args[]) {
     new Ministatement("");
    }
}
