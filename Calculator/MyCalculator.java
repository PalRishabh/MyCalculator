import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet  code="MyCalculator"  width="300"  height="500"> </applet>*/
public class MyCalculator extends Applet implements ActionListener
{
	 int a,b,c;
  	 String s,s1,s2,s3,s4;
  	 TextField t1;
  	 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;	
 	 public void init()
  	 {
	
	        t1=new TextField();

  		b1=new Button("1");
  		b2=new Button("2");
  		b3=new Button("3"); 
  		b4=new Button("4");
 	 	b5=new Button("5");
  		b6=new Button("6");
  		b7=new Button("7");
  		b8=new Button("8");
  		b9=new Button("9");
  		b10=new Button("0");
		b11=new Button("+");
  		b12=new Button("-");
 		b13=new Button("*");
		b14=new Button("/");
  		b15=new Button("=");
  		b16=new Button("clear");

		setLayout(null);

 		t1.setBounds(0,100,295,50);
 		b1.setBounds(10,280,50,30);
  		b2.setBounds(80,280,50,30);
  		b3.setBounds(150,280,50,30);
  		b4.setBounds(10,330,50,30);
  		b5.setBounds(80,330,50,30);
  		b6.setBounds(150,330,50,30);
  		b7.setBounds(10,380,50,30);
  		b8.setBounds(80,380,50,30);
  		b9.setBounds(150,380,50,30);
  		b10.setBounds(80,430,50,30);
		b11.setBounds(230,430,50,30);
		b12.setBounds(230,380,50,30);
  		b13.setBounds(230,330,50,30);
  		b14.setBounds(230,280,50,30);
  		b15.setBounds(150,430,50,30);
  		b16.setBounds(10,430,50,30);
  		

  		add(t1);

  		add(b1);
  		add(b2);
 		add(b3);
		add(b4);
  		add(b5);
  		add(b6);
  		add(b7);
  		add(b8);
  		add(b9);
  		add(b10);
  		add(b11);
  		add(b12);
  		add(b13);
  		add(b14);
  		add(b15);
  		add(b16);
 
	  	b1.addActionListener(this);
  		b2.addActionListener(this);
  		b3.addActionListener(this);
 		b4.addActionListener(this);
  		b5.addActionListener(this);
	  	b6.addActionListener(this);
  		b7.addActionListener(this);
  		b8.addActionListener(this);
  		b9.addActionListener(this);
  		b10.addActionListener(this);	
		b11.addActionListener(this);
  		b12.addActionListener(this);
  		b13.addActionListener(this);
  		b14.addActionListener(this);
  		b15.addActionListener(this);
  		b16.addActionListener(this);
	  }
 	
 
 		public void actionPerformed(ActionEvent e)
  		{
     			s=e.getActionCommand();
     			if(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")
        		||s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9"))
    			{
     				s1=t1.getText()+s;
   				t1.setText(s1);
   			}
  			if(s.equals("+"))
  			{
    				s2=t1.getText();
    				t1.setText("");
    				s3="+";
  			}
 			if(s.equals("-"))
  			{
    				s2=t1.getText();
    				t1.setText("");
 				s3="-";
 			}
  			if(s.equals("*"))
  			{
    				s2=t1.getText();
    				t1.setText("");
    				s3="*";
  			}
 			if(s.equals("/"))
  			{
    				s2=t1.getText();
    				t1.setText("");
    				s3="/";
  			}
 			if(s.equals("="))
  			{ 
    				s4=t1.getText();
    				a=Integer.parseInt(s2);
    				b=Integer.parseInt(s4);
    				if(s3.equals("+"))
    				{
     					c=a+b;
    				}
    				if(s3.equals("-"))
    				{
     					c=a-b;
   				}
    				if(s3.equals("*"))
    				{
     					c=a*b;
    				}
    				if(s3.equals("/"))
    				{
    					 c=a/b;
    				}
   				t1.setText(String.valueOf(c));
  				}
    				if(s.equals("clear"))
    				{
     				t1.setText("");
		    }
 
	}

}