
package bank.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener{
    JButton deposit,withdrawl,ministatement,pinchange,fastcash,balanceenquiry,recipt,exit;

    String pinnumber;
Transaction(String pinnumber){
    this.pinnumber=pinnumber;
    
    setLayout(null);
    
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/icons2.jpg"));
    Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(0,0,900,900);
    add(image);
    
    JLabel text=new JLabel("Please select Your Transaction");
    text.setBounds(210,300,700,35);
    text.setForeground(Color.WHITE);
    text.setFont(new Font("system",Font.BOLD,16));
    image.add(text);
    
    deposit=new JButton("Deposit");
    deposit.setBounds(170,415,150,30);
    deposit.addActionListener(this);
    image.add(deposit);
    
     withdrawl=new JButton("Cash Withrdral");
    withdrawl.setBounds(350,415,150,30);
    withdrawl.addActionListener(this);
    image.add(withdrawl);
    
     fastcash=new JButton("Fast Cash");
    fastcash.setBounds(170,450,150,30);
    fastcash.addActionListener(this);
    image.add(fastcash);
    
      ministatement=new JButton("Mini Satatement");
    ministatement.setBounds(350,450,150,30);
    ministatement.addActionListener(this);
    image.add(ministatement);
    
     pinchange=new JButton("Pin Change");
    pinchange.setBounds(170,485,150,30);
    pinchange.addActionListener(this);
    image.add(pinchange);
    
      recipt=new JButton("Recipt");
    recipt.setBounds(170,520,150,30);
    recipt.addActionListener(this);
    image.add(recipt);
    
     balanceenquiry=new JButton("Balance Enquiry");
    balanceenquiry.setBounds(350,485,150,30);
    balanceenquiry.addActionListener(this);
    image.add(balanceenquiry);
    
     exit=new JButton("Exit");
    exit.setBounds(350,520,150,30);
    exit.addActionListener(this);
    image.add(exit);
            
            
    setSize(900,900);
    setLocation(300,0);
    setUndecorated(true);
    setVisible(true);
    
    
}

    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== exit){
            System.exit(0);
        }else if(ae.getSource() == deposit){
            setVisible(false);
            new Deposite(pinnumber).setVisible(true);
            
        }else if(ae.getSource() == withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource()== fastcash){
            
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }else if(ae.getSource() == pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if(ae.getSource()==balanceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }else if(ae.getSource()==ministatement){
           
            new MiniStatement(pinnumber).setVisible(true);
            
        }else if(ae.getSource()== recipt){
            new Recipt(pinnumber).setVisible(true);
        }
            
      
        
    }
    
     public static void main(String args[]){
        new Transaction ("");
    }  
    
    
}
