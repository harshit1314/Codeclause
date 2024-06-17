
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
import java.sql.*;

public class Pinchange extends JFrame implements ActionListener {
JButton d1,d2;
    JPasswordField p,rp;
    String pno;
   Pinchange(String pno){
       this.pno=pno;
       setLayout(null);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
         JLabel l = new JLabel(i3);
         l.setBounds(0,0,900,900);
         add(l);
         
                
          JLabel l1 = new JLabel("Change your PIN");
          l1.setForeground(Color.WHITE);
           l1.setFont(new Font("System",Font.BOLD,16));
           l1.setBounds(250,280,500,20);
            l.add(l1); 
            
            JLabel l2 = new JLabel("New PIN:");
          l2.setForeground(Color.WHITE);
           l2.setFont(new Font("System",Font.BOLD,16));
           l2.setBounds(165,320,180,25);
            l.add(l2); 
            
             p = new   JPasswordField();
             p.setFont(new Font("Raleway",Font.BOLD,25));
              p.setBounds(330,320,180,25);
            l.add(p); 
             
            JLabel l3 = new JLabel("Re-enter New PIN:");
          l3.setForeground(Color.WHITE);
           l3.setFont(new Font("System",Font.BOLD,16));
           l3.setBounds(165,360,180,25);
            l.add(l3); 
            
          rp = new  JPasswordField();
             rp.setFont(new Font("Raleway",Font.BOLD,25));
              rp.setBounds(330,360,180,25);
            l.add(rp); 
         
              d1= new JButton("Change");
              d1.setBounds(355,485,150,30);
             d1.addActionListener(this);
                l.add(d1);
            
            d2= new JButton("Back");
           d2.setBounds(355,520,150,30);
              d2.addActionListener(this);
            l.add(d2);
            
         setSize(900,900);
         setLocation(300,0);
         setUndecorated(true);
          setVisible(true);
   }
   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== d1){
         try{
             String npin = p.getText();
             String rpin = rp.getText();
             if(!npin.equals(rpin)){
               JOptionPane.showMessageDialog(null, "Entered PIN did not match");  
               return;
             }
             
             if(npin.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter PIN");  
               return;  
             }
             
              if(rpin.equals("")){
                JOptionPane.showMessageDialog(null, "Please re- enter new PIN");  
               return;  
             }
             Conn con = new Conn();
                   String query= "update bank set pin = '"+rpin+"'where pin='"+pno+"'";
                    String query1= "update login set pin = '"+rpin+"'where pin='"+pno+"'";
                     String query2= "update signupthree set pin = '"+rpin+"'where pin='"+pno+"'";
                  con.s.executeUpdate(query);   
                  con.s.executeUpdate(query1); 
                  con.s.executeUpdate(query2); 
                     JOptionPane.showMessageDialog(null, "PIN changed successfully");
                 setVisible(false); 
                  new Transactions(rpin).setVisible(true);
          } catch(Exception e)
                  {
                  System.out.println(e);
                  }
    } else{
             setVisible(false); 
           new Transactions(pno).setVisible(true);
        }
    }

    
    
    public static void main(String args[]) {
       new Pinchange("").setVisible(true);
    }
}
