
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener {
    JButton d1,d2;
     JTextField t;
     String pno;
    Deposit(String pno)
    {     setLayout(null);
    this.pno = pno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
            Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
             ImageIcon i3 = new ImageIcon(i2);
               JLabel l = new JLabel(i3);
              l.setBounds(0,0,900,900);
               add(l);
             
                JLabel l1 = new JLabel("Enter the amount you want to deposit");
          l1.setForeground(Color.WHITE);
           l1.setFont(new Font("System",Font.BOLD,16));
           l1.setBounds(170,300,400,20);
            l.add(l1);  
            
            t = new JTextField();
             t.setFont(new Font("Raleway",Font.BOLD,22));
           t.setBounds(170,350,320,25);
            l.add(t);  
             
               d1= new JButton("Deposit");
              d1.setBounds(355,485,150,30);
             d1.addActionListener(this);
                l.add(d1);
            
            d2= new JButton("Back");
           d2.setBounds(355,520,150,30);
              d2.addActionListener(this);
            l.add(d2);
            
            
            
           setSize(900,900);
            setLocation(300,0);
         //  setUndecorated(true);
            setVisible(true);
    }
   
       public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== d1){
          String n = t.getText();
          Date date = new Date();
          if(n.equals("")){
           JOptionPane.showMessageDialog(null, "Please enter amount you want to deposit");    
          } else {
              try{
             Conn con = new Conn();
                   String query= "insert into bank values('"+pno+"','"+date+"','Deposit','"+n+"')";
                  con.s.executeUpdate(query);   
                  JOptionPane.showMessageDialog(null, "Rs"+n+"Deposited Successfully");    
                  setVisible(false);
                  new Transactions(pno).setVisible(true);
          } catch(Exception e)
                  {
                  System.out.println(e);
                  }
    }
    } else if(ae.getSource()== d2){
         setVisible(false);
            new Transactions(pno).setVisible(true);
    }
     }
    public static void main(String args[]) {
        new Deposit("");
    }
}
