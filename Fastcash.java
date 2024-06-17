
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
import java.sql.*;

public class Fastcash extends JFrame implements ActionListener{
    JButton de,wi,fc,ms,pc,bc,ex;
    String pno;
       Fastcash(String pno){
           setLayout(null);
           this.pno = pno;
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
            Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
             ImageIcon i3 = new ImageIcon(i2);
              JLabel l = new JLabel(i3);
              l.setBounds(0,0,900,900);
               add(l);
               
             JLabel l1 = new JLabel("Select withdrawl amount");
          l1.setForeground(Color.WHITE);
           l1.setFont(new Font("System",Font.BOLD,16));
           l1.setBounds(210,300,700,35);
            l.add(l1);  
            
              de= new JButton("Rs 100");
            de.setBounds(170,415,150,30);
             de.addActionListener(this);
             l.add(de);
             
             wi= new JButton("Rs 500");
            wi.setBounds(355,415,150,30);
             wi.addActionListener(this);
             l.add(wi);
             
               
             fc= new JButton("Rs 1000");
            fc.setBounds(170,450,150,30);
             fc.addActionListener(this);
             l.add(fc);
             
                ms= new JButton("Rs 2000");
            ms.setBounds(355,450,150,30);
             ms.addActionListener(this);
             l.add(ms);
             
               
               pc= new JButton("Rs 5000");
            pc.setBounds(170,485,150,30);
             pc.addActionListener(this);
             l.add(pc);
             
               bc= new JButton("Rs 10000");
            bc.setBounds(355,485,150,30);
             bc.addActionListener(this);
             l.add(bc);
             
                 ex= new JButton("Back");
            ex.setBounds(355,520,150,30);
             ex.addActionListener(this);
             l.add(ex);
            
         
            setSize(900,900);
            setLocation(300,0);
           setUndecorated(true);
            setVisible(true);
       }
     public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== ex){
          setVisible(false);
    new Transactions(pno).setVisible(true);
    }
      else {
        String amount = ((JButton)ae.getSource()).getText().substring(3);
         Conn con = new Conn();
         try{
            
             ResultSet rs = con.s.executeQuery("select * from bank where pin = '"+pno+"'");
             int b = 0;
             while(rs.next()){
                 if(rs.getString("type").equals("Deposit")){
                     b+=Integer.parseInt(rs.getString("amount"));
                 } else {
                     b-=Integer.parseInt(rs.getString("amount"));
                 }
             }
             if(ae.getSource()!=ex && b< Integer.parseInt(amount)){
                JOptionPane.showMessageDialog(null, "Insufficient Balance");   
                return;
             }
             Date date = new Date();
                   String query= "insert into bank values('"+pno+"','"+date+"','Withdrawl','"+amount+"')";
                  con.s.executeUpdate(query);   
                  JOptionPane.showMessageDialog(null, "Rs"+amount+"Withdraw Successfully");    
                  setVisible(false);
                  new Transactions(pno).setVisible(true);
          } catch(Exception e)
                  {
                  System.out.println(e);
                  }
           setVisible(false);
     new Deposit(pno).setVisible(true); 
      }  
 
     }
     
     
    public static void main(String args[]) {
      new Fastcash("");
    }
}
