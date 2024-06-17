
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    JButton de,wi,fc,ms,pc,bc,ex;
    String pno;
       Transactions(String pno){
           setLayout(null);
           this.pno = pno;
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
            Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
             ImageIcon i3 = new ImageIcon(i2);
              JLabel l = new JLabel(i3);
              l.setBounds(0,0,900,900);
               add(l);
               
             JLabel l1 = new JLabel("Please select your Transaction");
          l1.setForeground(Color.WHITE);
           l1.setFont(new Font("System",Font.BOLD,16));
           l1.setBounds(210,300,700,35);
            l.add(l1);  
            
              de= new JButton("Deposit");
            de.setBounds(170,415,150,30);
             de.addActionListener(this);
             l.add(de);
             
             wi= new JButton("Cash Withdrawl");
            wi.setBounds(355,415,150,30);
             wi.addActionListener(this);
             l.add(wi);
             
               
             fc= new JButton("Fast Cash");
            fc.setBounds(170,450,150,30);
             fc.addActionListener(this);
             l.add(fc);
             
                ms= new JButton("Mini Statement");
            ms.setBounds(355,450,150,30);
             ms.addActionListener(this);
             l.add(ms);
             
               
               pc= new JButton("Pin Change");
            pc.setBounds(170,485,150,30);
             pc.addActionListener(this);
             l.add(pc);
             
               bc= new JButton("Balance Inquiry");
            bc.setBounds(355,485,150,30);
             bc.addActionListener(this);
             l.add(bc);
             
                 ex= new JButton("Exit");
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
            System.exit(0);}
      else if(ae.getSource()== de){
           setVisible(false);
     new Deposit(pno).setVisible(true); 
      }  else if(ae.getSource()== wi){
           setVisible(false);
     new Withdrawl(pno).setVisible(true); 
      } else if(ae.getSource()== fc){
           setVisible(false);
     new Fastcash(pno).setVisible(true); 
 
     }  else if(ae.getSource()== pc){
           setVisible(false);
     new Pinchange(pno).setVisible(true); 
 
     }  else if(ae.getSource()== bc){
           setVisible(false);
     new Balanceenquiry(pno).setVisible(true); 
 
     } else if(ae.getSource()== ms){
          
     new Ministatement(pno).setVisible(true); 
 
     } 
     }
     
    public static void main(String args[]) {
      new Transactions("");
    }
}
