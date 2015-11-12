/*Assignment 5 - Exercise 5
Write the same code as in Q4, except in Java. Test that it works.
*/
class Time24h{
	
    private int hours;
    private int minutes;
    private int seconds;
	
	void setTime(int hoursT, int minutesT, int secondsT){
		if(hoursT > 23 || minutesT > 59 || secondsT > 59){
			hours = 0;
			minutes = 0;
			seconds = 0;
		}
		else{
			hours = hoursT;
			minutes = minutesT;
			seconds = secondsT;
		}
	}
	Time24h(int hours, int minutes, int seconds){
		setTime(hours, minutes, seconds);
	}
	Time24h(int hours, int minutes){
		setTime(hours, minutes, 0);
	}
	Time24h(int hours){
		setTime(hours, 0, 0);
	}
	
	int timeSince(){
		int timeSinceMidnight = hours*60 + minutes;
		if(seconds > 29){
			timeSinceMidnight++;
		}
		return timeSinceMidnight;
	}
	
	public Time24h compare(Time24h t){
		int tTotalSeconds = t.hours*60*60 + t.minutes*60 + t.seconds;
		int thisTotalSeconds = hours*60*60 + minutes*60 + seconds;
	
		if(tTotalSeconds > thisTotalSeconds)
			return t;
		else if(tTotalSeconds == thisTotalSeconds){
			System.out.println("Both equal");
			return this;
		}
		else return this;
	}
	
	void display(){
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}

	public static void main(String[] args){
		Time24h t = new Time24h(20);
		Time24h ta = new Time24h(23,00);
		t.compare(ta).display();
		System.out.println(ta.timeSince());
	}
}

