import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

   class Calculator extends JFrame implements ActionListener
{
   JTextField tres;
   JButton b1 , b2 , b3 , b4 , b5 , b6 , b7 , b8 , b9 , b0 , bPlus,  bMinus , bTimes , bDivide , bPoint , bEquals  ;
   JPanel p1;
   String num1="" ,num2="" , op=""; 
   static double n1=0 , n2=0 ;
   static double ans = 0;
   Container c = getContentPane();
   
   
   Calculator() // GUI Component
   {
      super("Calculator version 1");
      
      //for buttons
      b0 = new JButton("0"); b0.addActionListener(this);  
      b1 = new JButton("1"); b1.addActionListener(this); b1.setBounds(30,40,280,30);
      b2 = new JButton("2"); b2.addActionListener(this); b2.setBounds(30,40,280,30);
      b3 = new JButton("3"); b3.addActionListener(this); b3.setBounds(30,40,280,30);
      b4 = new JButton("4"); b4.addActionListener(this); b4.setBounds(30,40,280,30);
      b5 = new JButton("5"); b5.addActionListener(this); b5.setBounds(30,40,280,30);
      b6 = new JButton("6"); b6.addActionListener(this); b6.setBounds(30,40,280,30);
      b7 = new JButton("7"); b7.addActionListener(this); b7.setBounds(30,40,280,30);
      b8 = new JButton("8"); b8.addActionListener(this); b8.setBounds(30,40,280,30);
      b9 = new JButton("9"); b9.addActionListener(this); b9.setBounds(30,40,280,30);

      bPlus = new JButton("+"); bPlus.addActionListener(this); bPlus.setBounds(30,40,280,30); 
      bMinus = new JButton("-"); bMinus.addActionListener(this); bMinus.setBounds(30,40,280,30);
      bTimes = new JButton("*"); bTimes.addActionListener(this); bTimes.setBounds(30,40,280,30);
      bDivide = new JButton("/"); bDivide.addActionListener(this); bDivide.setBounds(30,40,280,30); 
      bPoint = new JButton("."); bPoint.addActionListener(this); bPoint.setBounds(30,40,280,30);
      bEquals = new JButton("="); bEquals.addActionListener(this); bEquals.setBounds(30,40,280,30);
      
      //result textfield
      tres = new JTextField("0"); tres.setEditable(false);      
      //setup the panel
      p1 = new JPanel(); p1.setLayout(new GridLayout(4,4));
      p1.add(b7) ; p1.add(b8) ; p1.add(b9) ; p1.add(bDivide) ;
      p1.add(b4) ; p1.add(b5) ; p1.add(b6) ; p1.add(bTimes) ;
      p1.add(b1) ; p1.add(b2) ; p1.add(b3) ; p1.add(bMinus) ;
      p1.add(b0) ; p1.add(bPoint) ; p1.add(bEquals) ; p1.add(bPlus);

      
      c.setLayout(new BorderLayout());
      c.add(tres , BorderLayout.NORTH);
      c.add(p1 , BorderLayout.CENTER);
      
      setDefaultCloseOperation(EXIT_ON_CLOSE );
      setSize(300,200);
      setResizable(true);
   }
   
   public void actionPerformed(ActionEvent e) //2. Listener Method
   {  
      String s = e.getActionCommand();
      
      if ((s.charAt(0)>='0' && s.charAt(0)<='9') || s.charAt(0)=='.')
      {
         //if operaor is present then add to second number
         if (!op.equals(" ")){
            num2 = num2 + s;
            tres.setText(num2);
         }
         else{
            num1 = num1 + s;
            tres.setText(num1);
         }
      }   
  //    else if (s.charAt(0) == '+' || s.charAt(0) == '-' || s.charAt(0) == '*' || s.charAt(0) == '/' )
  //    {
  //         op = op + s; 
  //    }   
            
      else if (s.charAt(0) == '=')
      {
        n1 = Double.parse(num1);
        n2 = Double.parse(num2);
        
        switch (op)
        {
            case "+" : ans = n1 + n2; break;
            case "-" : ans = n1 - n2; break;
            case "*" : ans = n1 * n2; break;
            case "/" : ans = n1 / n2; break;
        }
      }
   }

 
   //}
}   
   //-----------------------------------------
   public class Calculatorv2
   {
      public static void main(String[] args)
      {
         Calculator calc = new Calculator();
         calc.setVisible(true);
      }
   }
