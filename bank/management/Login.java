package bank.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton login,signup,clear;
    JTextField cardTextField ;
    JPasswordField pinTextField;
    Login(){
       
        setTitle("AUTOMATIC TAYLOR MACHINE");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        
        add(label);
        
        JLabel text= new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        
        JLabel Cardno= new JLabel("Card No:");
        Cardno.setFont(new Font("Railway",Font.BOLD,38));
        Cardno.setBounds(200,150,250,50);
        add(Cardno);
        
        cardTextField=new JTextField();
        cardTextField.setBounds(365,165,300,30);
        cardTextField.setFont(new Font("arial",Font.BOLD,20));
        add(cardTextField);
        
        
        
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Railway",Font.BOLD,38));
        pin.setBounds(280,205,400,50);
        add(pin);
        
        pinTextField=new JPasswordField();
        pinTextField.setBounds(365,220,300,30);
        pinTextField.setFont(new Font("arial",Font.BOLD,20));
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(370,285,135,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(530,285,135,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN IN");
        signup.setBounds(365,350,300,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        
        getContentPane().setBackground(Color.WHITE);
        
                
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    
     @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== clear){
            cardTextField.setText("");
            pinTextField.setText("");
            
        }else if(ae.getSource()== login){
            
            Conn conn=new Conn();
            
            String cardnumber=cardTextField.getText();
            String pinnumber=pinTextField.getText();
            String query="select * from login where cardnumber='"+cardnumber+"' and pin='"+pinnumber+"'";
            
            try{
                ResultSet rs=conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
                
                
            }catch(Exception e){
                System.out.println(e);
            }
            
            
        }else if(ae.getSource()== signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        
    } 
    
    }
public static void main(String[] args){
        new Login();
   
    }
    
    
}
