

package bank.management.system;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.util.*;

public class Signupone extends JFrame implements  ActionListener {
    long ran;
    JTextField nTextField,fTextField,eTextField,aTextField,sTextField,pTextField,cTextField;
    JButton next;
    JRadioButton m,f,mar,un,ot;
    JDateChooser dt;
      Signupone()
      {
          setLayout(null);
          
          Random r = new Random();
           ran = Math.abs((r.nextLong() % 9000L)+1000L); 
          
          JLabel formno = new JLabel("APPLICATION FORM NO."+ ran);
           formno.setFont(new Font("Raleway",Font.BOLD,38));
           formno.setBounds(140,20,600,40);
            add(formno);
            
            JLabel pdet = new JLabel("Page 1: Personal Deatils");
           pdet.setFont(new Font("Raleway",Font.BOLD,22));
           pdet.setBounds(290,80,400,30);
            add(pdet);
            
           JLabel name = new JLabel("Name: ");
           name.setFont(new Font("Raleway",Font.BOLD,20));
           name.setBounds(100,140,100,30);
            add(name);
            
             nTextField = new JTextField();
            nTextField.setFont(new Font("Raleway",Font.BOLD,14));
            nTextField.setBounds(300,140,400,30);
            add(nTextField);
            
            
            JLabel fname = new JLabel("Father's Name: ");
           fname.setFont(new Font("Raleway",Font.BOLD,20));
           fname.setBounds(100,190,200,30);
            add(fname);
            
             fTextField = new JTextField();
            fTextField.setFont(new Font("Raleway",Font.BOLD,14));
            fTextField.setBounds(300,190,400,30);
            add(fTextField);
            
             JLabel dob = new JLabel("Date of Birth: ");
           dob.setFont(new Font("Raleway",Font.BOLD,20));
           dob.setBounds(100,240,200,30);
            add(dob);
            
             dt= new JDateChooser();
            dt.setBounds(300,240,400,30);
            dt.setForeground(new Color(105,105,105));
            add(dt);
            
            JLabel g = new JLabel("Gender: ");
           g.setFont(new Font("Raleway",Font.BOLD,20));
           g.setBounds(100,290,200,30);
            add(g);
            
             m= new JRadioButton("Male");
             m.setBounds(300,290,60,30);
             m.setBackground(Color.WHITE);
            add(m);
            
            f= new JRadioButton("Female");
            f.setBounds(450,290,120,30);
            f.setBackground(Color.WHITE);
            add(f);
            
            ButtonGroup gg = new ButtonGroup();
            gg.add(m);
            gg.add(f);
            
            JLabel em = new JLabel("Email Addrss: ");
           em.setFont(new Font("Raleway",Font.BOLD,20));
           em.setBounds(100,340,200,30);
            add(em);
            
              eTextField = new JTextField();
            eTextField.setFont(new Font("Raleway",Font.BOLD,14));
            eTextField.setBounds(300,340,400,30);
            add(eTextField);
            
              JLabel ms = new JLabel("Marital Status: ");
           ms.setFont(new Font("Raleway",Font.BOLD,20));
           ms.setBounds(100,390,200,30);
            add(ms);
            
                mar= new JRadioButton("Married");
             mar.setBounds(300,390,100,30);
             mar.setBackground(Color.WHITE);
            add(mar);
            
             un= new JRadioButton("Unmarried");
            un.setBounds(450,390,100,30);
            un.setBackground(Color.WHITE);
            add(un);
            
              ot= new JRadioButton("Other");
            ot.setBounds(630,390,120,30);
            ot.setBackground(Color.WHITE);
            add(ot);
            
            ButtonGroup marital = new ButtonGroup();
            marital.add(mar);
            marital.add(un);
            marital.add(ot);
            
            
            JLabel a = new JLabel("Address: ");
           a.setFont(new Font("Raleway",Font.BOLD,20));
           a.setBounds(100,440,200,30);
            add(a);
            
              aTextField = new JTextField();
            aTextField.setFont(new Font("Raleway",Font.BOLD,14));
            aTextField.setBounds(300,440,400,30);
            add(aTextField);
            
            JLabel c = new JLabel("City: ");
           c.setFont(new Font("Raleway",Font.BOLD,20));
           c.setBounds(100,490,200,30);
            add(c);
            
              cTextField = new JTextField();
            cTextField.setFont(new Font("Raleway",Font.BOLD,14));
            cTextField.setBounds(300,490,400,30);
            add(cTextField);
            
            JLabel st = new JLabel("State: ");
           st.setFont(new Font("Raleway",Font.BOLD,20));
           st.setBounds(100,540,200,30);
            add(st);
            
             sTextField = new JTextField();
            sTextField.setFont(new Font("Raleway",Font.BOLD,14));
            sTextField.setBounds(300,540,400,30);
            add(sTextField);
            
             JLabel p = new JLabel("Pin Code: ");
           p.setFont(new Font("Raleway",Font.BOLD,20));
           p.setBounds(100,590,200,30);
            add(p);
            
             pTextField = new JTextField();
            pTextField.setFont(new Font("Raleway",Font.BOLD,14));
            pTextField.setBounds(300,590,400,30);
            add(pTextField);
            
            next = new JButton("Next");
             next.setBackground(Color.BLACK);
              next.setForeground(Color.WHITE);
              next.setFont(new Font("Raleway",Font.BOLD,14));
              next.setBounds(620,660,80,30);
              next.addActionListener(this);
              add(next);
          
          getContentPane().setBackground(Color.WHITE);
          setSize(850,800);
          setLocation(350,10);
          setVisible(true);
      }
  public void actionPerformed(ActionEvent ae){
        String formno= "" + ran;
        String name= nTextField.getText();
        String fname= fTextField.getText();
        String dob = ((JTextField)dt.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(m.isSelected()){
            gender="Male";
        } else if(f.isSelected()){
            gender="Female";
        }
        
        String email= eTextField.getText();
        String martial = null;
         if(mar.isSelected()){
            gender="Married";
        } else if(un.isSelected()){
            gender="Unmarried";
        } else if(ot.isSelected()){
            gender="Other";
        }
         String address= aTextField.getText();
         String city= cTextField.getText();
         String state= sTextField.getText();
         String pincode= pTextField.getText();
         
          try {
          if(name.equals("")){
              JOptionPane.showMessageDialog( null, "Name required");
          }else{
              Conn c= new Conn();
              String query= "insert signup value('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+state+"','"+pincode+"' )";
              c.s.executeUpdate(query);
              
              setVisible(false);
              new Signuptwo(formno).setVisible(true);

          }
        } catch(Exception e){
           System.out.println(e);
        }
    }
    public static void main(String args[]) {
     new Signupone();
    }
}
