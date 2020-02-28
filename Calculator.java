package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator implements ActionListener
{
	JFrame frame=new JFrame();
	JPanel pannel=new JPanel();
	JTextArea textarea=new JTextArea();
	
	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
	JButton button4=new JButton();
	JButton button5=new JButton();
	JButton button6=new JButton();
	JButton button7=new JButton();
	JButton button8=new JButton();
	JButton button9=new JButton();
	JButton button0=new JButton();
			

	JButton buttonad=new JButton();
	JButton buttonmul=new JButton();
	JButton buttonsub=new JButton();
	JButton buttondiv=new JButton();
	JButton buttonclr=new JButton();
	JButton buttondot=new JButton();
	JButton buttoneq=new JButton();
	
	
	double number1,number2,result;
	int adc=0,subc=0,mulc=0,divc=0;
	
	public Calculator()
	{
		frame.setSize(300,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculator");
		
		frame.setResizable(true);
		
		frame.add(pannel);
		pannel.setBackground(Color.LIGHT_GRAY);
		Border border=BorderFactory.createLineBorder(Color.RED,4);
		
		pannel.add(textarea);
		
		textarea.setBackground(Color.WHITE);
		Border tborder= BorderFactory.createLineBorder(Color.BLUE,3);
		
		textarea.setBorder(tborder);
		Font font=new Font("arial",Font.BOLD,15);
		textarea.setFont(font);
		textarea.setForeground(Color.BLUE);
		
		textarea.setPreferredSize(new Dimension(250,100));
		textarea.setLineWrap(true);
		
		button1.setPreferredSize(new Dimension(80,40));
		button1.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\button1.JPG"));
		
		button2.setPreferredSize(new Dimension(80,40));
		button2.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\button2.JPG"));
		
		button3.setPreferredSize(new Dimension(80,40));
		button3.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\button3.JPG"));
		
		button4.setPreferredSize(new Dimension(80,40));
		button4.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\button4.JPG"));
		
		button5.setPreferredSize(new Dimension(80,40));
		button5.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\button5.JPG"));
		
		button6.setPreferredSize(new Dimension(80,40));
		button6.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\button6.JPG"));
		
		button7.setPreferredSize(new Dimension(80,40));
		button7.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\button7.PNG"));
		
		button8.setPreferredSize(new Dimension(80,40));
		button8.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\button8.PNG"));
		
		
		button9.setPreferredSize(new Dimension(80,40));
		button9.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\button9.PNG"));
		
		button0.setPreferredSize(new Dimension(80,40));
		button0.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\button0.JPG"));
		
		buttonad.setPreferredSize(new Dimension(80,40));
		buttonad.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\buttonad.PNG"));
		
		buttonmul.setPreferredSize(new Dimension(80,40));
		buttonmul.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\buttonmul.JPG"));
		
		buttonsub.setPreferredSize(new Dimension(60,40));
		buttonsub.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\buttonsub.PNG"));
		
		buttondiv.setPreferredSize(new Dimension(80,40));
		buttondiv.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\buttondiv.JPG"));
		
		buttondot.setPreferredSize(new Dimension(80,40));
		buttondot.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\buttondot.JPG"));
		
		buttoneq.setPreferredSize(new Dimension(80,40));
		buttoneq.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\buttoneq.PNG"));
		
		buttonclr.setPreferredSize(new Dimension(80,40));
		buttonclr.setIcon(new ImageIcon("C:\\Users\\sitar\\Downloads\\New folder\\buttonclr.JPG"));
		
		
		pannel.add(button1);
		pannel.add(button2);
		pannel.add(button3);
		pannel.add(button4);
		pannel.add(button5);
		pannel.add(button6);
		pannel.add(button7);
		pannel.add(button8);
		pannel.add(button9);
		pannel.add(button0);
		pannel.add(buttonad);
		pannel.add(buttonmul);
		pannel.add(buttonsub);
		pannel.add(buttondiv);
		pannel.add(buttondot);
		pannel.add(buttoneq);
		pannel.add(buttonclr);
		
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		button6.addActionListener((ActionListener) this);
		button7.addActionListener((ActionListener) this);
		button8.addActionListener((ActionListener) this);
		button9.addActionListener((ActionListener) this);
		button0.addActionListener((ActionListener) this);
		buttonad.addActionListener((ActionListener) this);
		buttonmul.addActionListener((ActionListener) this);
		buttonsub.addActionListener((ActionListener) this);
		buttondiv.addActionListener((ActionListener) this);
		buttondot.addActionListener((ActionListener) this);
		buttoneq.addActionListener((ActionListener) this);
		buttonclr.addActionListener((ActionListener) this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source= e.getSource();
		if(source==buttonclr)
		{
			number1=0.0;
			number2=0.0;
			textarea.setText(" ");
		}
		if(source==button1)
		{
			textarea.append("1");
		
	    }
		if(source==button2)
		{
			textarea.append("2");
			
        }
		if(source==button3)
		{
			textarea.append("3");
        }
		if(source==button4)
		{
			textarea.append("4");
		}
		if(source==button5)
		{
			textarea.append("5");
		}
		if(source==button6)
		{
			textarea.append("6");
		}
		if(source==button7)
		{
			textarea.append("7");
		}
		if(source==button8)
		{
			textarea.append("8");
		}
		if(source==button9)
		{
			textarea.append("9");
		}
		if(source==button0)
		{
			textarea.append("0");
		}
		if(source==buttondot)
		{
			textarea.append(".");
		}
		if(source==buttonad)
		{
			number1=number_reader();
		
			textarea.setText("+");
			adc=1;
			subc=0;
			mulc=0;
			divc=0;
		}
		if(source==buttonmul)
		{
			number1=number_reader();
		
			textarea.setText("");
			adc=0;
			subc=0;
			mulc=1;
			divc=0;
		}
		if(source==buttonsub)
		{
			number1=number_reader();
		
			textarea.setText(" ");
			adc=0;
			subc=1;
			mulc=0;
			divc=0;
		}
		if(source==buttondiv)
		{
			number1=number_reader();
		
			textarea.setText(" ");
			adc=0;
			subc=0;
			mulc=0;
			divc=1;
		}
		if(source==buttoneq)
		{
			number2=number_reader();
		     if(adc>0)
		     {
		    	 result=number1+number2;
		    	 textarea.setText(Double.toString(result));
		     }
		     if(mulc>0)
		     {
		    	 result=number1*number2;
		    	 textarea.setText(Double.toString(result));
		     }
		     if(subc>0)
		     {
		    	 result=number1-number2;
		    	 textarea.setText(Double.toString(result));
		     }
		     if(divc>0)
		     {
		    	 result=number1%number2;
		    	 textarea.setText(Double.toString(result));
		     }
			
		}
			
	}
	public double number_reader()
	{
		double num1;
		String s;
		s=textarea.getText();
		num1=Double.valueOf(s);
		return num1;
	}
 
}
		