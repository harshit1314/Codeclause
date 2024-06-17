
package bank.management.system;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Signupthree extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton d1,d2;
    String formno;
     Signupthree(String formno){
         this.formno=formno;
         setLayout(null);
         
         JLabel l1 = new JLabel("Page 3: Account Deatils");
           l1.setFont(new Font("Raleway",Font.BOLD,22));
           l1.setBounds(280,40,400,40);
            add(l1);
            
             JLabel l2 = new JLabel("Account Type");
           l2.setFont(new Font("Raleway",Font.BOLD,22));
           l2.setBounds(100,140,200,30);
            add(l2);
            
               r1= new JRadioButton("Savings Account");
               r1.setFont(new Font("Raleway",Font.BOLD,16));
             r1.setBounds(100,180,160,20);
             r1.setBackground(Color.WHITE);
            add(r1);
            
              r2= new JRadioButton("Fixed Deposit Account");
               r2.setFont(new Font("Raleway",Font.BOLD,16));
             r2.setBounds(350,180,250,20);
             r2.setBackground(Color.WHITE);
            add(r2);
            
              r3= new JRadioButton("Current Account");
               r3.setFont(new Font("Raleway",Font.BOLD,16));
             r3.setBounds(100,220,250,20);
             r3.setBackground(Color.WHITE);
            add(r3);
            
              r4= new JRadioButton("Recurring Account");
               r4.setFont(new Font("Raleway",Font.BOLD,16));
             r4.setBounds(350,220,250,20);
             r4.setBackground(Color.WHITE);
            add(r4);
            
         ButtonGroup gc = new ButtonGroup();
          gc.add(r1);
          gc.add(r2);
          gc.add(r3);
          gc.add(r4);
          
               
           JLabel l3 = new JLabel("Card Number");
           l3.setFont(new Font("Raleway",Font.BOLD,22));
           l3.setBounds(100,300,200,30);
            add(l3);
            
             JLabel l4 = new JLabel("XXXX-XXXX-XXXX-4184");
           l4.setFont(new Font("Raleway",Font.BOLD,22));
           l4.setBounds(330,300,300,30);
            add(l4);
            
             JLabel l = new JLabel("Your 16 digit Card Number");
           l.setFont(new Font("Raleway",Font.BOLD,12));
           l.setBounds(100,330,300,20);
            add(l);
            
                
           JLabel l5 = new JLabel("Pin:");
           l5.setFont(new Font("Raleway",Font.BOLD,22));
           l5.setBounds(100,370,200,30);
            add(l5);
            
             JLabel l6 = new JLabel("XXXX");
           l6.setFont(new Font("Raleway",Font.BOLD,22));
           l6.setBounds(330,370,300,30);
            add(l6);
            
            JLabel ll = new JLabel("Your 4 digit Pin");
           ll.setFont(new Font("Raleway",Font.BOLD,12));
           ll.setBounds(100,400,300,20);
            add(ll);
            
            JLabel l7 = new JLabel("Services Required:");
           l7.setFont(new Font("Raleway",Font.BOLD,22));
           l7.setBounds(100,450,400,20);
            add(l7);
            
            c1= new JCheckBox("ATM Card");
            c1.setFont(new Font("Raleway",Font.BOLD,16));
             c1.setBounds(100,500,200,30);
             c1.setBackground(Color.WHITE);
            add(c1);
            
            c2= new JCheckBox("Internet Banking");
            c2.setFont(new Font("Raleway",Font.BOLD,16));
             c2.setBounds(350,500,200,30);
             c2.setBackground(Color.WHITE);
            add(c2);
            
            c3= new JCheckBox("Mobile Banking");
            c3.setFont(new Font("Raleway",Font.BOLD,16));
             c3.setBounds(100,550,200,30);
             c3.setBackground(Color.WHITE);
            add(c3);
            
            c4= new JCheckBox("Email and SMS Alerts");
            c4.setFont(new Font("Raleway",Font.BOLD,16));
             c4.setBounds(350,550,200,30);
             c4.setBackground(Color.WHITE);
            add(c4);
            
            c5= new JCheckBox("Chequebook");
            c5.setFont(new Font("Raleway",Font.BOLD,16));
             c5.setBounds(100,600,200,30);
             c5.setBackground(Color.WHITE);
            add(c5);
            
            c6= new JCheckBox("E-Statement");
            c6.setFont(new Font("Raleway",Font.BOLD,16));
             c6.setBounds(350,600,200,30);
             c6.setBackground(Color.WHITE);
            add(c6);
            
            c1= new JCheckBox("I hereby declares that above entered details are correct to the best of my hands.");
            c1.setFont(new Font("Raleway",Font.BOLD,12));
             c1.setBounds(100,680,600,30);
             c1.setBackground(Color.WHITE);
            add(c1);
            
             d1= new JButton("Submit");
            d1.setFont(new Font("Raleway",Font.BOLD,14));
             d1.setBounds(250,720,100,30);
             d1.setBackground(Color.BLACK);
             d1.addActionListener(this);
             d1.setForeground(Color.WHITE);
            add(d1);
            
            d2= new JButton("Cancel");
            d2.setFont(new Font("Raleway",Font.BOLD,14));
             d2.setBounds(420,720,100,30);
              d2.addActionListener(this);
             d2.setBackground(Color.BLACK);
             d2.setForeground(Color.WHITE);
            add(d2);
            
            getContentPane().setBackground(Color.WHITE);
           
            setSize(850,820);
            setLocation(350,0);
            setVisible(true);
     }
    
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== d1){
            String ac = null;
            if(r1.isSelected()){
                ac= "Savings Account";
            }else if(r2.isSelected()){
                ac= "Fixed Deposit Account";
            }else if(r3.isSelected()){
                ac= "Current Account";
            }else if(r4.isSelected()){
                ac= "Recurring Account";
            }
            Random r = new Random();
            String cn =""+ Math.abs((r.nextLong()%90000000L)+5040936000000000L);
             String p =""+ Math.abs((r.nextLong()%9000L)+1000L);
             String f ="";
             if(c1.isSelected()){
                f= f+ "ATM Card";
            } else if(c2.isSelected()){
                f= f+ "Internet Banking";
            }else if(c3.isSelected()){
                f= f+ "Mobile Banking";
            }else if(c4.isSelected()){
                f= f+ "Email and SMS Alerts";
            }else if(c5.isSelected()){
                f= f+ "Chequebook";
            }else if(c6.isSelected()){
                f= f+ "E-Statement";
            }
             
           try{
               if(ac.equals("")){
                   JOptionPane.showMessageDialog(null, "Account type required");
                  }else {
                   Conn con = new Conn();
                   String query1= "insert into signupthree values('"+formno+"','"+ac+"','"+cn+"','"+p+"','"+f+"')";
                   String query2= "insert into login values('"+formno+"','"+cn+"','"+p+"')";
                   con.s.executeUpdate(query1);
                   con.s.executeUpdate(query2);
                   
                   JOptionPane.showMessageDialog(null, "Card Number:"+cn+"\nPin: "+p);
                     setVisible(false);
              new Deposit(p).setVisible(true); 
               }
           }  catch(Exception e){
               System.out.println(e);
           }
            
        } else if(ae.getSource()== d2){
             setVisible(false);
     new Login().setVisible(true); 
        }
     }
        
    public static void main(String args[]) {
      new Signupthree("");
    }
}
