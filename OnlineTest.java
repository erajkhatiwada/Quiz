import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class OnlineTest extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    OnlineTest(String s)  
    {  
        super(s);  
        l=new JLabel();  
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Next");  
        b2=new JButton("Save");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        add(b1);add(b2);  
        set();  
        l.setBounds(30,40,450,20);  
        jb[0].setBounds(60,80,100,20);  
        jb[1].setBounds(60,110,100,20);  
        jb[2].setBounds(60,140,100,20);  
        jb[3].setBounds(60,170,100,20);  
        b1.setBounds(100,240,100,30);  
        b2.setBounds(270,240,100,30);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(500,500);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==9)  
            {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }  
        if(e.getActionCommand().equals("Save"))  
        {  
            JButton bk=new JButton("Save "+x);  
            bk.setBounds(480,20+30*x,100,30);  
            add(bk);  
            bk.addActionListener(this);  
            m[x]=current;  
            x++;  
            current++;  
            set();    
            if(current==9)  
                b2.setText("Result");  
            setVisible(false);  
            setVisible(true);  
        }  
        for(int i=0,y=1;i<x;i++,y++)  
        {  
        if(e.getActionCommand().equals("Save"+y))  
        {  
            if(check())  
                count=count+1;  
            now=current;  
            current=m[y];  
            set();  
            ((JButton)e.getSource()).setEnabled(false);  
            current=now;  
        }  
        }  
      
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;   
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            System.exit(0);  
        }  
    }  
    
    // replace "enter your question here" with any question you'd like to ask 
    // replace choice 1,2,3,4 with your options
    void set()  
    {  
        jb[4].setSelected(true);  
        if(current==0)  
        {  
            l.setText("Enter your question here");  
            jb[0].setText("Choice 1");jb[1].setText("Choice 2");jb[2].setText("Choice 3");jb[3].setText("Choice 4");   
        }  
        if(current==1)  
        {  
            l.setText("Enter your question here?");  
            jb[0].setText("Choice 1");jb[1].setText("Choice 2");jb[2].setText("Choice 3");jb[3].setText("Choice 4");  
        }  
        if(current==2)  
        {  
            l.setText("Enter your question here");  
            jb[0].setText("Choice 1");jb[1].setText("Choice 2");jb[2].setText("Choice 3");jb[3].setText("Choice 4");  
        }  
        if(current==3)  
        {  
            l.setText("Enter your question here");  
            jb[0].setText("Choice 1");jb[1].setText("Choice 2");jb[2].setText("Choice 3");jb[3].setText("Choice 4");  
        }  
        if(current==4)  
        {  
            l.setText("Enter your question here");  
            jb[0].setText("Choice 1");jb[1].setText("Choice 2");jb[2].setText("Choice 3");jb[3].setText("Choice 4");  
        }  
        if(current==5)  
        {  
            l.setText("Enter your question here");  
            jb[0].setText("Choice 1");jb[1].setText("Choice 2");jb[2].setText("Choice 3");jb[3].setText("Choice 4");  
        }  
        if(current==6)  
        {  
            l.setText("Enter your question here");  
            jb[0].setText("Choice 1");jb[1].setText("Choice 2");jb[2].setText("Choice 3");  
                        jb[3].setText("Choice 4");  
        }  
        if(current==7)  
        {  
            l.setText("Enter your question here");  
            jb[0].setText("Choice 1");jb[1].setText("Choice 2");jb[2].setText("Choice 3");  
                        jb[3].setText("Choice 4");         
        }  
        if(current==8)  
        {  
            l.setText("Enter your question here");  
            jb[0].setText("Choice 1");jb[1].setText("Choice 2");jb[2].setText("Choice 3");jb[3].setText("Choice 4");  
        }  
        if(current==9)  
        {  
            l.setText("Enter your question here");  
            jb[0].setText("Choice 1");jb[1].setText("Choice 2");jb[2].setText("Choice 3");  
                        jb[3].setText("Choice 4");  
        }  
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
    	// this is where you assign the correct answer of the question
    	
        if(current==0)  
            return(jb[1].isSelected());   //  the correct answer of first question is Choice 2
        if(current==1)  
            return(jb[2].isSelected());  // the correct answer of second question is choice 3
        if(current==2)  
            return(jb[3].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[2].isSelected());  
        if(current==5)  
            return(jb[2].isSelected());  
        if(current==6)  
            return(jb[1].isSelected());  
        if(current==7)  
            return(jb[3].isSelected());  
        if(current==8)  
            return(jb[1].isSelected());  
        if(current==9)  
            return(jb[2].isSelected());  
        return false;  
    }  
    public static void main(String s[])  
    {  
        new OnlineTest("Make your own quiz with this code!");  
    }  
}  
