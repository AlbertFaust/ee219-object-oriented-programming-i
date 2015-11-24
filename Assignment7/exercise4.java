/*Assignment 7 - Exercise 4
Write a Java GUI application based on the lottery numbers Question Q8 in Assignment 5 that has one button called “Draw Numbers”. When you press this button a set of random numbers (1-45) should appear, each in a non-editable TextField. Marks are going for doing this efficiently, i.e. using an array of TextFields rather than 7 individual TextFields.

Each number (1-45) should have a different colour and when that number appears, the background of the TextField containing that number should change to its colour. Pick the colours automatically using an algorithm of your choosing - remember R (0-255), G (0-255) and B (0-255) can be used to construct a Color object. There may be an easier way too... have a look at the API documentation.

Add a separate set of seven TextFields directly underneath the random number TextFields. These textfields should display the total number of times that the number that was randomly chosen above it was drawn since the application executed.
*/
import java.awt.*; import java.awt.event.*; 
import java.awt.Color; 
 
public class Question4 extends Frame implements ActionListener{ 
	private TextField[] nums; 
	private Button draw; 
   
	public Question4(){ 
   
		this.nums = new TextField[7]; 
 
		for (int i = 0; i < 7; i++){ 
 
			this.nums[i] = new TextField(2);  
			this.add(nums[i]); 
 			nums[i].setEditable(false); 
 		}
 
	this.draw= new Button("Draw Numbers");  
	this.draw.addActionListener(this); 
	this.add(draw);  
	 
	this.setLayout(new FlowLayout()); 
	 
	this.setTitle("Lottery"); 
	this.pack(); 
	this.setVisible(true); 
 
	this.addWindowListener(new WindowAdapter() { 
 
 		public void windowClosing(WindowEvent we) { 
 
 			dispose(); 
 		} 
 	} 
	); 
	/* 
	 Color[] Color = new Color[45]; 
	 
	 for(int i = 0; i < 45; i++){
	 	Color[i] = new Color(i, i, i, i); 
	 } 
	  */ 
} 
	boolean contains(int[] list, int element){ 
 
		for(int i = 0; i < list.length; i++){ 
 
 			if(list[i] == element){ 
 			return true; 
 			}  
		} 
 		return false; 
   	} 
    
	int[] lotteryNumbers(){  
	 	int[] a = new int[7]; 
	 	int numbersTaken = 0; 

		while(numbersTaken != a.length){  
	
			int rand = (int)(Math.random() * 45) + 1; 
			if(!contains(a,rand)){ 
				a[numbersTaken] = rand;  
				numbersTaken++; 
			} 
	 	} 
	 
	 	return a; 
	} 
   
	@Override 
	public void actionPerformed(ActionEvent e) { 
	 
		Question4 l = new Question4(); 
	 
		for(int i = 0; i < 7; i++){ 
	 
			int[] numbers = l.lotteryNumbers();
			nums[i].setText((Integer.toString(numbers[i])));  
			nums[i].setBackground(new 
			Color(numbers[i]+100,numbers[i]+50,numbers[i]+150)); 
	 	} 
	} 
	public static void main(String[] args) { 

		System.out.println("Start of Application");  

		Question4 app = new Question4();  
	  
		System.out.println("End of Application"); 
	 
	} 
 
} 
