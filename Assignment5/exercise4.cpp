/*Assignment 5 - Exercise 4
Write a C++ class called Time24h that describes a time of the day in hours, minutes, and seconds. It should contain the following methods:
	Three different suitable overloaded constructors (one of which must include a seconds value). Each constructor should test that the values passed to the constructor are valid; otherwise, it should set the time to be midnight. Write efficient code!

	A display method to display the time in the format hh:mm:ss. (Note: the time can be displayed as 17:4:34 -- i.e. leading zeros are not required)

	A method that returns the time as the total (closest) number of minutes since midnight.

	A compare method that accepts a single Time24h object and returns the greater time as a Time24h object.
*/
#include <iostream>
using namespace std;

class Time24h{
	
    private:
        int hours;
        int minutes;
        int seconds;

    public:
    	Time24h(int, int, int);
    	Time24h(int, int);
    	Time24h(int);
    	virtual void display();
    	virtual void setTime(int, int, int);
    	virtual int timeSince();
    	virtual Time24h compare(Time24h);
};

void Time24h::setTime(int hoursT, int minutesT, int secondsT){
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
Time24h::Time24h(int hours, int minutes, int seconds){
	setTime(hours, minutes, seconds);
}
Time24h::Time24h(int hours, int minutes){
	setTime(hours, minutes, 0);
}
Time24h::Time24h(int hours){
	setTime(hours, 0, 0);
}
int Time24h::timeSince(){
	int timeSinceMidnight = hours*60 + minutes;
	if(seconds > 29){
		timeSinceMidnight++;
	}
	return timeSinceMidnight;
}

Time24h Time24h::compare(Time24h t){
	int tTotalSeconds = t.hours*60*60 + t.minutes*60 + t.seconds;
	int thisTotalSeconds = hours*60*60 + minutes*60 + seconds;
	cout << tTotalSeconds << endl;
	cout << thisTotalSeconds << endl;
	
	if(tTotalSeconds > thisTotalSeconds)
		return t;
	else if(tTotalSeconds == thisTotalSeconds){
		cout << "both equal" << endl;
		return *this;
	}
	else return *this;
}

void Time24h::display(){
	cout << hours << ":" << minutes << ":" << seconds << endl;
}
int main(){
	Time24h t = Time24h(20);
	Time24h ta = Time24h(23,00);
	t.display();
	ta.display();
	t.compare(ta).display();
	return 0;
}
