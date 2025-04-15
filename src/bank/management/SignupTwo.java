
package bank.management;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class SignupTwo extends JFrame implements ActionListener {

    JTextField pan,addhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,Category,occupational,education,Income;
    String formno;
    
    
    SignupTwo(String formno){
        this.formno=formno;
        
        setLayout(null);
        
        
        //form no all code
        
        
       setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        //additional details all code
        
         JLabel additionalDetails=new JLabel("Page 2:Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        //Religion all code
        
        JLabel Religion=new JLabel("Religion:");
        Religion.setFont(new Font("Raleway",Font.BOLD,20));
        Religion.setBounds(100,140,100,30);
        add(Religion);
        
        String valreligion[]={"Hindu","Muslim","Sikh","Christan","other"};
         religion=new JComboBox(valreligion);
         religion.setBounds(300,140,400,30);
         religion.setBackground(Color.WHITE);
        add(religion);
        
      
        
        
        
        //category all code
        
        
         JLabel category=new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,190,200,30);
        add(category);
        
        String valCategory[]={"General","OBC","BC","SC","ST","Other"};
           Category = new JComboBox(valCategory);
        Category.setBounds(300,190,400,30);
        Category.setBackground(Color.WHITE);
        add(Category);
        
        
        //income all code
        
        
         JLabel income=new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);
        
        
        
        String valIncome[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
           Income = new JComboBox(valIncome);
        Income.setBounds(300,240,400,30);
        Income.setBackground(Color.WHITE);
        add(Income);
        
         
        
        //educational all code
        
        
         JLabel gender=new JLabel("Educational:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,315,200,30);
        add(gender);
        
         String educationvalues[]={"Non-Graduate","Garduate","Post-Garduate","10Th Pass","Doctrate","Others"};
           education = new JComboBox(educationvalues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
                
        
         JLabel email=new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
     
         

        
        
        //occupation all code
        
        JLabel occupation=new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,390,200,30);
        add(occupation);
        
        String occupationalvalues[]={"Salaried","Self-employed","Businessman","Student","Retired","Others"};
           occupational = new JComboBox(occupationalvalues);
        occupational.setBounds(300,390,400,30);
        occupational.setBackground(Color.WHITE);
        add(occupational);
        
        

        
        //pan all code
        
        
         JLabel panno=new JLabel("PAN No:");
        panno.setFont(new Font("Raleway",Font.BOLD,20));
        panno.setBounds(100,440,200,30);
        add(panno);
        
        
        
         pan=new JTextField();
         pan.setFont(new Font("Ralway",Font.BOLD,14));
         pan.setBounds(300,440,400,30);
         add(pan);
        
        
        //aadhar all code
        
        
         JLabel addharno=new JLabel("Aadhar No:");
        addharno.setFont(new Font("Raleway",Font.BOLD,20));
        addharno.setBounds(100,490,200,30);
        add(addharno);
       
          addhar=new JTextField();
        addhar.setFont(new Font("Ralway",Font.BOLD,14));
        addhar.setBounds(300,490,400,30);
        add(addhar);
        
        
        //senior citizen  all code
        
        
          JLabel seniorcitizen=new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway",Font.BOLD,20));
        seniorcitizen.setBounds(100,540,200,30);
        add(seniorcitizen);
        
        
      
          syes =new JRadioButton("Yes");
        syes.setBounds(300,540,120,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
         sno=new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
         ButtonGroup addhar=new ButtonGroup();
        addhar.add(syes);
        addhar.add(sno);
   
        
        
        
        
        
        
        
        //existing account  all code
        
        
        JLabel existing=new JLabel("Existing Account:");
        existing.setFont(new Font("Raleway",Font.BOLD,20));
        existing.setBounds(100,590,200,30);
        add(existing);
        
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,120,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
         eno=new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
         ButtonGroup existingaccount=new ButtonGroup();
        existingaccount.add(eyes);
        existingaccount.add(eno);
        
        
        
        
        
        
        
        // next button
        
        
         next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setBounds(600,690,80,30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
       // String formno="" +random;  //long value
        String sreligion=(String)religion.getSelectedItem();
        String ccategory=(String)Category.getSelectedItem();
        String sincome=(String) Income.getSelectedItem();
        String seducation=(String)education.getSelectedItem();
        String soccupation=(String)occupational.getSelectedItem();
        String seniorcitizen="null";
        if(syes.isSelected()){
            seniorcitizen="yes";
        }else if(sno.isSelected()){
            seniorcitizen="No";
            
                    }
            
        
        
      
      String existingaccount="null";
      if(eyes.isSelected()){
          existingaccount="yes";
      }else if(eno.isSelected()){
          existingaccount="No";
      }
      
      
      
      // marital code
      
    
          
          String span=pan.getText();
          String saddhar=addhar.getText();
          
          
          
          // action listener name is reuqired;
          try{
               
              if(addhar.equals("")){
                  JOptionPane.showMessageDialog(null,"addhar is Required");
              
              }
              if(pan.equals("")){
                  JOptionPane.showMessageDialog(null,"pan is Required");
              
              }
                  Conn c=new Conn();
                  String query="insert into signupTwo values('"+formno+"', '"+sreligion+"' ,'"+ccategory+"','"+seducation+"','"+soccupation+"' ,'"+span+"','"+saddhar+"','"+seniorcitizen+"','"+sincome+"','"+existingaccount+"') ";
                  c.s.executeUpdate(query);
                  
                   //setVisible(false);
                  //new SignupTwo(formno).setVisible(true);
                  setVisible(false);
                  new SignupThree(formno).setVisible(true);
                  
                }catch (Exception e){
              System.out.println(e);
          }
          
    }
    
   
    
    public static void main(String args[]){
       new SignupTwo(""); 
    }


    }
    

