
package registration.forme;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RegistrationForme extends JFrame implements ActionListener{
    JComboBox c1;
    JRadioButton r1,r2,r3;
    JTextField t1,t2,t3,t4,t5,t6;
    JButton b1;
    RegistrationForme(){
        
        b1=new JButton("SUBMIT");
        b1.setBounds(150,500,140,30);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        JLabel l1=new JLabel("REGISTRATION FORM");
        l1.setBounds(130,10,400,30);
        l1.setFont(new Font("Tahoma",Font.BOLD,20));
        l1.setForeground(Color.BLUE);
        add(l1);
        
       JLabel l2=new JLabel("NAME");
        l2.setBounds(50,70,150,30);
       l2.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(l2); 
       
         t1= new JTextField();
        t1.setFont(new Font("Tahoma",Font.PLAIN,17));
        t1.setBounds(200,70,200,30);
        add(t1);
        
         JLabel l3=new JLabel("COLLEGE ID");
        l3.setBounds(50,120,150,30);
       l3.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(l3); 
       
        t2= new JTextField();
        t2.setFont(new Font("Tahoma",Font.PLAIN,17));
        t2.setBounds(200,120,200,30);
        add(t2);
        
         JLabel l4=new JLabel("BRANCH");
        l4.setBounds(50,170,150,30);
       l4.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(l4); 
       
        t3= new JTextField();
        t3.setFont(new Font("Tahoma",Font.PLAIN,17));
        t3.setBounds(200,170,200,30);
        add(t3);
        
        JLabel l5=new JLabel("SESSION");
         l5.setFont(new Font("Tahoma",Font.PLAIN,17));
        l5.setBounds(50,220,100,30);
        add(l5);
        String cs1[]={"2018-2022","2019-2023","2020-2024","2021-2025"};
        c1=new JComboBox(cs1);
        c1.setBounds(200,220,200,30);
        c1.setBackground(Color.WHITE);
        add(c1);
        
         JLabel l6=new JLabel("GENDER");
         l6.setFont(new Font("Tahoma",Font.PLAIN,17));
        l6.setBounds(50,270,100,30);
        add(l6);
        r1=new JRadioButton("male");
        r1.setBounds(200,270,70,30);
        r1.setFont(new Font("Tahoma",Font.PLAIN,17));
        r1.setBackground(Color.WHITE);
        add(r1);
         r2=new JRadioButton("female");
        r2.setBounds(280,270,100,30);
        r2.setFont(new Font("Tahoma",Font.PLAIN,17));
        r2.setBackground(Color.WHITE);
        add(r2);
        
        r3=new JRadioButton("other");
        r3.setBounds(380,270,100,30);
        r3.setFont(new Font("Tahoma",Font.PLAIN,17));
        r3.setBackground(Color.WHITE);
        add(r3);
        
         JLabel l7=new JLabel("CONTACT NO.");
        l7.setBounds(50,320,150,30);
       l7.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(l7); 
       
     t4= new JTextField();
        t4.setFont(new Font("Tahoma",Font.PLAIN,17));
        t4.setBounds(200,320,200,30);
        add(t4);
        
         JLabel l8=new JLabel("DATE OF BIRTH");
        l8.setBounds(50,370,150,30);
       l8.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(l8); 
       
        t5= new JTextField();
        t5.setFont(new Font("Tahoma",Font.PLAIN,17));
        t5.setBounds(200,370,200,30);
        add(t5);
        
         JLabel l9=new JLabel("EMAIL ID");
        l9.setBounds(50,420,150,30);
       l9.setFont(new Font("Tahoma",Font.PLAIN,17));
        add(l9); 
       
        t6= new JTextField();
        t6.setFont(new Font("Tahoma",Font.PLAIN,17));
        t6.setBounds(200,420,200,30);
        add(t6);
         getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(500,100,500,600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        
         
         String Name=t1.getText();
         String CollegeId=t2.getText();
         String Branch=t3.getText();
         String Session=(String)c1.getSelectedItem();
         String Gender=null;
        if(r1.isSelected()){
          Gender="male";
        }else if(r2.isSelected()){
          Gender="female";
      }else if(r3.isSelected()){
          Gender="other";
      }
         String Contact=t4.getText();
         String Birth=t5.getText();
         String Email=t5.getText();
         
         
        
         
         connc c=new connc();
          String str="insert into data values('"+Name+"','"+CollegeId+"','"+Branch+"','"+Session+"','"+Gender+"','"+Contact+"','"+Birth+"','"+Email+"')";
         
         try{
             c.s.executeUpdate(str);
             JOptionPane.showMessageDialog(null,"Form Submitted");
             
             this.setVisible(false);
         }catch(Exception e){
             
         }
            
        }
    public static void main(String[] args) {
        new RegistrationForme();
        
    }
    
}
