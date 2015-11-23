/*Assignment 7 - Exercise 2
Write a Java GUI based application that has a TextField in which you can enter a String. Add a button called “Count” that when pressed displays the number of characters in the entered String in a different read-only TextField.
*/
import java.awt.*; 
import java.awt.event.*; 
 
public class Question2 extends Frame implements ActionListener{ 
	private TextField t; 
    private TextField r; 
	private Button b; 
	private int count; 
   
   
	public Question2(){ 
 
	this.b = new Button("Count"); 
 
	b.addActionListener(this); 
 
	this.t = new TextField(30); 
	this.r = new TextField(Integer.toString(count),5); 

	this.setLayout(new FlowLayout()); 
  
	this.setTitle("String Counter"); 
 
	this.add(t); 
	this.add(r); 
	this.add(b);   
 
	this.pack(); 
	r.setEditable(false);  
	this.setVisible(true); 
 
	this.addWindowListener(new WindowAdapter() { 
 		public void windowClosing(WindowEvent we) { 
 		dispose(); 
 
 		}
	} 
); 
} 

@Override 
public void actionPerformed(ActionEvent e) { 
	int size = t.getText().length(); 
	r.setText(Integer.toString(size)); 
} 
 
public static void main(String[] args) { 
	System.out.println("Start of Application"); 
  
	Question2 app = new Question2(); 
  
	System.out.println("End of Application"); 
} 
