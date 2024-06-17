
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;

public class Balanceenquiry extends JFrame implements ActionListener{
String pno;
 JButton d1;
 Balanceenquiry(String pc)
 {     this.pno=pno;
      setLayout(null);
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
         JLabel l = new JLabel(i3);
         l.setBounds(0,0,900,900);
         add(l);
         
          
          d1= new JButton("Back");
          d1.setBounds(355,520,150,30);
           d1.addActionListener(this);
           l.add(d1);
            
      Conn con = new Conn();
         int b = 0;
         try{
             ResultSet rs = con.s.executeQuery("select * from bank where pin = '"+pno+"'");
          
             while(rs.next()){
                 if(rs.getString("type").equals("Deposit")){
                     b+=Integer.parseInt(rs.getString("amount"));
                 } else {
                     b-=Integer.parseInt(rs.getString("amount"));
                 }
             }   
         } catch(Exception e)
                  {
                  System.out.println(e);
                  }
            
             JLabel l1 = new JLabel("Your current account balance is Rs "+b);
          l1.setForeground(Color.WHITE);
           //l1.setFont(new Font("System",Font.BOLD,16));
           l1.setBounds(170,300,400,30);
            l.add(l1);     
         
          setSize(900,900);
         setLocation(300,0);
         setUndecorated(true);
          setVisible(true);
 }
 
  public void actionPerformed(ActionEvent ae){
    setVisible(false); 
     new Transactions(pno).setVisible(true);
     
  
  }
        
   
    public static void main(String args[]) {
         new Balanceenquiry("");
    }
}
