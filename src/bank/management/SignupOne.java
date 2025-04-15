
package bank.management;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField,FnameTextField,pinTextField,addressTextField,cityTextField,countryTextField,stateTextField,
            emailTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried,singal;
    JDateChooser dateChooser;
  
    
    
    SignupOne(){
        
        
        setLayout(null);
        
        
        //form no all code
        
        
        Random ran=new Random();
        random=Math.abs((ran.nextLong()  %9000L)+1000L);
        
        
        JLabel formno=new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        //personal details all code
        
         JLabel personalDetails=new JLabel("Page 1:Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        //name all code
        
        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
         nameTextField=new JTextField();
        nameTextField.setFont(new Font("Ralway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
        
        //fname all code
        
        
        JLabel Fname=new JLabel("Father's Name:");
        Fname.setFont(new Font("Raleway",Font.BOLD,20));
        Fname.setBounds(100,190,200,30);
        add(Fname);
        
          FnameTextField=new JTextField();
        FnameTextField.setFont(new Font("Ralway",Font.BOLD,14));
        FnameTextField.setBounds(300,190,400,30);
        add(FnameTextField);
        
        
        //dob all code
        
        
         JLabel dob=new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
         dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        
        //gender all code
        
        
         JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
         male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
         female=new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
         other=new JRadioButton("Other");
        other.setBounds(600,290,60,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
        
        
        //email all code
        
         JLabel email=new JLabel("Email:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
         emailTextField=new JTextField();
        emailTextField.setFont(new Font("Ralway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        
        
        //marital all code
        
        JLabel maritalstatus=new JLabel("Marital:");
        maritalstatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalstatus.setBounds(100,390,200,30);
        add(maritalstatus);
        
         married=new JRadioButton("Married");
        married.setBounds(300,390,120,30);
        married.setBackground(Color.WHITE);
        add(married);
        
         unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
         singal=new JRadioButton("Singal");
        singal.setBounds(600,390,100,30);
        singal.setBackground(Color.WHITE);
        add(singal);
        
         
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(singal);
        
        

        
        //address all code
        
        
         JLabel address=new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
         addressTextField=new JTextField();
        addressTextField.setFont(new Font("Ralway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        
        //city all code
        
        
         JLabel city=new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
       
          cityTextField=new JTextField();
        cityTextField.setFont(new Font("Ralway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        
        //state all code
        
        
         JLabel state=new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
         stateTextField=new JTextField();
        stateTextField.setFont(new Font("Ralway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        
        //country all code
        
        
        JLabel country=new JLabel("Country:");
        country.setFont(new Font("Raleway",Font.BOLD,20));
        country.setBounds(100,590,200,30);
        add(country);
        
         countryTextField=new JTextField();
        countryTextField.setFont(new Font("Ralway",Font.BOLD,14));
        countryTextField.setBounds(300,590,400,30);
        add(countryTextField);
        
        //pin all code
        
         JLabel pin=new JLabel("Pin Code:");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,640,200,30);
        add(pin);
        
        
         pinTextField=new JTextField();
        pinTextField.setFont(new Font("Ralway",Font.BOLD,14));
        pinTextField.setBounds(300,640,400,30);
        add(pinTextField);
        
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
        String formno="" +random;  //long value
        String name=nameTextField.getText();//settext
        String Fname=FnameTextField.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        
        //gender code
        
        String gender=null;
        if(male.isSelected()){
            gender="male";
        }else if(female.isSelected()){
            gender="female";
        
        }else if(other.isSelected()){
            gender="other";
        }
        
        
      String email=emailTextField.getText();
      
      
      
      // marital code
      
      String marital=null;
      if(married.isSelected()){
          marital="married";
      }else if(unmarried.isSelected()){
          marital="unmarried";
      }else if(singal.isSelected()){
          marital="singal";
      }
          
          String address=addressTextField.getText();
          String city=cityTextField.getText();
          String state=stateTextField.getText();
          String pin=pinTextField.getText();
          
          
          // action listener name is reuqired;
          try{
              if(name.equals("")){
                  JOptionPane.showMessageDialog(null,"Name is Required");
              
              }
              if(Fname.equals("")){
                  JOptionPane.showMessageDialog(null,"FName is Required");
             
              }if(dob.equals("")){
                  JOptionPane.showMessageDialog(null,"dob is Required");
                  
                
              }if(email.equals("")){
                  JOptionPane.showMessageDialog(null,"email is Required");
              
                  } if(address.equals("")){
                  JOptionPane.showMessageDialog(null,"address is Required");
                  }
                  if(city.equals("")){
                  JOptionPane.showMessageDialog(null,"city is Required");
                  }
                  if(state.equals("")){
                  JOptionPane.showMessageDialog(null,"state is Required");
                  }
                 
                  if(Fname.equals("")){
                  JOptionPane.showMessageDialog(null,"FName is Required");
                  }
                  else{
                  Conn c=new Conn();
                  String query="insert into signup values('"+formno+"', '"+name+"' ,'"+Fname+"','"+email+"','"+dob+"' ,'"+gender+"','"+marital+"','"+city+"','"+state+"','"+pin+"','"+address+"') ";
                  c.s.executeUpdate(query);
                  
                 setVisible(false);
                 new SignupTwo(formno).setVisible(true);
                  
              }
              
                  
              
          }catch (Exception e){
              System.out.println(e);
          }
          
    }
    
   
    
    public static void main(String args[]){
       new SignupOne(); 
    }


    }
    
