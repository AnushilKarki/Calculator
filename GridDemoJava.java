package griddemo.java;

 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
public class GridDemoJava implements ActionListener {
     JFrame f1;
     JLabel l1,l2,l3;
     JTextField t1,t2,t3;
     JButton b1,b2,b3,b4;
     GridDemoJava()
     {
         f1=new JFrame();
         f1.setSize(300,300);
         f1.setLayout(new GridLayout(5,2));
         f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         l1=new JLabel("Num1");
         l2=new JLabel("num2");
         l3=new JLabel("Result");
         t1=new JTextField();
         t2=new JTextField();
         t3=new JTextField();
         b1=new JButton("ADd");
         b2=new JButton("Subtract");
         b3=new JButton("multiplier");
         b4=new JButton("division");
         f1.add(l1);
         f1.add(t1);
         f1.add(l2);
         f1.add(t2);
         f1.add(l3);
         f1.add(t3);
         f1.add(b1);
         f1.add(b2);
         f1.add(b3);
         f1.add(b4);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         f1.setVisible(true);
     }
     
     
          
   
    public static void main(String[] args) {
        new GridDemoJava();
    }
    public void actionPerformed(ActionEvent e)
    {
       int c=0;
       int a=Integer.parseInt(t1.getText());
       int b=Integer.parseInt(t2.getText());
       if(e.getSource()==b1)
       {
           c=a+b;
       }
       else if(e.getSource()==b2)
       {
           c=a-b;
       }
       else if(e.getSource()==b3)
       {
           c=a*b;
       }
       else
       {
           c=a/b;
       }
       t3.setText(c+"");
    }
}
