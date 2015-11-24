/*Assignment 7 - Exercise 3
Write a Java GUI-based application with two TextFields a and b. You should be able to write two numeric values in each TextField. 
In between the two TextFields there should be a Choice which allows you to select one of "add", "subtract", "multiply", "divide" and "modulo". 
When you press a button called “Calculate” the two numbers are operated on according to the chosen operation and the result should appear in another TextField. 
The TextFields should all be labelled. If an invalid number (e.g., “abcd”) is entered in a TextField then the application should display a message “Invalid Values” in a component of your choosing.
*/
import java.awt.*; 
import java.awt.event.*; 
 
public class Question3 extends Frame implements ActionListener{ 
	private TextField a; 
    private TextField b; 
    private TextField answer; 
    private TextField error; 
    private int num1; 
    private int num2; 
	private Button calculate; 
	private Choice choice; 
   
public Question3(){ 

	this.a = new TextField(Integer.toString(num1), 2); 
	this.add(a); 
 
	this.choice = new Choice(); 
	this.choice.addItem("add");  
	this.choice.addItem("subtract"); 
	this.choice.addItem("multiply"); 
	this.choice.addItem("divide"); 
	this.choice.addItem("modulo"); 
	this.add(choice); 
	  
	this.b = new TextField(Integer.toString(num2), 2); 
	this.add(b); 
	  
	this.calculate = new Button("Calculate"); 
	this.calculate.addActionListener(this); 
	this.add(calculate); 
	  
	this.answer = new TextField(5); 
	this.add(answer); 
	  
	this.error = new TextField(15); 
	this.add(error); 
	  
	this.setLayout(new FlowLayout()); 
	  
	this.setTitle("Calculator"); 
	this.pack(); 
	a.setEditable(true); 
	b.setEditable(true); 
	error.setEditable(false); 
	answer.setEditable(false); 
	this.setVisible(true); 
  
	this.addWindowListener(new WindowAdapter() { 
		public void windowClosing(WindowEvent we) { 
			dispose(); 
			} 
		} 
	); 
} 
	   
	public boolean isNumeric(String s){ 
	 
		try {Integer.valueOf(s);}catch(NumberFormatException nfe){return false;}  
		return true; 
	} 
	  
	@Override 
	public void actionPerformed(ActionEvent e) {  
		if(!isNumeric(a.getText()) || !isNumeric(b.getText()))  
	 		error.setText(" Invalid Values"); 

		else if(choice.getSelectedItem().equals("add")){  
			answer.setText(Integer.toString(Integer.valueOf(a.getText()) + Integer.valueOf(b.getText()))); 
		} 
		else if(choice.getSelectedItem().equals("subtract")){ 
			answer.setText(Integer.toString(Integer.valueOf(a.getText()) ­- Integer.valueOf(b.getText()))); 
		} 
		else if(choice.getSelectedItem().equals("multiply")){ 
			answer.setText(Integer.toString(Integer.valueOf(a.getText()) * Integer.valueOf(b.getText()))); 
		} 
	 
		else if(choice.getSelectedItem().equals("divide")){ 
			answer.setText(Integer.toString(Integer.valueOf(a.getText()) / Integer.valueOf(b.getText()))); 
		}
		else if(choice.getSelectedItem().equals("modulo")){ 
			answer.setText(Integer.toString(Integer.valueOf(a.getText()) % Integer.valueOf(b.getText()))); 
		}
	} 
	public static void main(String[] args) { 
		System.out.println("Start of Application"); 
	 
		Question3 app = new Question3(); 
	 
		System.out.println("End of Application"); 
	 
	} 
} 
