

package bank.management.system;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;


public class Signuptwo extends JFrame implements  ActionListener {
   
    JTextField aTextField,cTextField;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
   String formno;
    JComboBox rel,cat,in,e,oo;
      Signuptwo(String formno)
      {
          this.formno=formno;
          setLayout(null);
          
         setTitle("NEW ACCOUNT APPLICATION FORM  -- PAGE-2");
          
          
            
            JLabel adet = new JLabel("Page 2: Additional Deatils");
           adet.setFont(new Font("Raleway",Font.BOLD,22));
           adet.setBounds(290,80,400,30);
            add(adet);
            
           JLabel name = new JLabel("Religion: ");
           name.setFont(new Font("Raleway",Font.BOLD,20));
           name.setBounds(100,140,100,30);
            add(name);
            
            String varrel[]= {"Hindu","Muslim","Sikh","Christian","Other"};
             rel = new JComboBox(varrel);
            rel.setBounds(300,140,400,30);
            rel.setBackground(Color.WHITE);
            add(rel);
            
            
            
           
            JLabel fname = new JLabel("Category: ");
           fname.setFont(new Font("Raleway",Font.BOLD,20));
           fname.setBounds(100,190,200,30);
            add(fname);
            
             String varcat[]= {"General","OBC","SC","ST","Other"};
              cat = new JComboBox(varcat);
            cat.setBounds(300,190,400,30);
            cat.setBackground(Color.WHITE);
            add(cat);
            
            
            
             JLabel dob = new JLabel("Income: ");
           dob.setFont(new Font("Raleway",Font.BOLD,20));
           dob.setBounds(100,240,200,30);
            add(dob);
            
            String varin[]= {"Null","< 150000","< 250000","< 500000","Upto 1000000"};
             in = new JComboBox(varin);
            in.setBounds(300,240,400,30);
            in.setBackground(Color.WHITE);
            add(in);
            
           
            
            JLabel g = new JLabel("Educational: ");
           g.setFont(new Font("Raleway",Font.BOLD,20));
           g.setBounds(100,290,200,30);
            add(g);
            
            
          
            JLabel em = new JLabel("Qualification: ");
           em.setFont(new Font("Raleway",Font.BOLD,20));
           em.setBounds(100,315,200,30);
            add(em);
            
            String vare[]= {"Non-Graduate","Graduate","Post-Graduation","Doctorate","Others"};
            e = new JComboBox(vare);
            e.setBounds(300,315,400,30);
            e.setBackground(Color.WHITE);
            add(e);
            
            
             
            
              JLabel ms = new JLabel("Occupation: ");
           ms.setFont(new Font("Raleway",Font.BOLD,20));
           ms.setBounds(100,390,200,30);
            add(ms);
            
            String varo[]= {"Salaried","Self-employed","Businessman","Student","Retired"};
             oo = new JComboBox(varo);
            oo.setBounds(300,390,400,30);
            oo.setBackground(Color.WHITE);
            add(oo);
            
            
              
            
            JLabel a = new JLabel("Pan No: ");
           a.setFont(new Font("Raleway",Font.BOLD,20));
           a.setBounds(100,440,200,30);
            add(a);
            
              aTextField = new JTextField();
            aTextField.setFont(new Font("Raleway",Font.BOLD,14));
            aTextField.setBounds(300,440,400,30);
            add(aTextField);
            
            JLabel c = new JLabel("Aadhar No: ");
           c.setFont(new Font("Raleway",Font.BOLD,20));
           c.setBounds(100,490,200,30);
            add(c);
            
              cTextField = new JTextField();
            cTextField.setFont(new Font("Raleway",Font.BOLD,14));
            cTextField.setBounds(300,490,400,30);
            add(cTextField);
            
            JLabel st = new JLabel("Senior Citizen: ");
           st.setFont(new Font("Raleway",Font.BOLD,20));
           st.setBounds(100,540,200,30);
            add(st);
            
              syes= new JRadioButton("Yes");
             syes.setBounds(300,540,100,30);
             syes.setBackground(Color.WHITE);
            add(syes);
            
             sno= new JRadioButton("No");
            sno.setBounds(450,540,100,30);
            sno.setBackground(Color.WHITE);
            add(sno);
            
             
            
            ButtonGroup marital = new ButtonGroup();
            marital.add(syes);
            marital.add(sno);
            
            
            
            
            
             JLabel p = new JLabel("Existing Account: ");
           p.setFont(new Font("Raleway",Font.BOLD,20));
           p.setBounds(100,590,200,30);
            add(p);
            
             eyes= new JRadioButton("Yes");
             eyes.setBounds(300,590,100,30);
             eyes.setBackground(Color.WHITE);
            add(eyes);
            
             eno= new JRadioButton("No");
            eno.setBounds(450,590,100,30);
            eno.setBackground(Color.WHITE);
            add(eno);
            
             
            
            ButtonGroup emarital = new ButtonGroup();
            emarital.add(eyes);
            emarital.add(eno);
            
            
         
            
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
        
        String religion= (String)rel.getSelectedItem();
        String category= (String)cat.getSelectedItem();
        String income= (String)in.getSelectedItem();
        String education= (String)e.getSelectedItem();
        String occupation= (String)oo.getSelectedItem();
        String seniorcit=null;
        if(syes.isSelected()){
            seniorcit="Yes";
        } else if(sno.isSelected()){
            seniorcit="No";
        }
        
        
        String exist = null;
         if(eyes.isSelected()){
            exist="Yes";
        } else if(eno.isSelected()){
            exist="No";
        } 
         String pan= aTextField.getText();
         String adhaar= cTextField.getText();
         
         
          try {
          
              Conn c= new Conn();
              String query= "insert signuptwo value('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+seniorcit+"','"+exist+"','"+pan+"','"+adhaar+"' )";
              c.s.executeUpdate(query);
          setVisible(false);
          new Signupthree(formno).setVisible(true);
        } catch(Exception e){
           System.out.println(e);
        }
    }
    public static void main(String args[]) {
     new Signuptwo("");
    }
}
