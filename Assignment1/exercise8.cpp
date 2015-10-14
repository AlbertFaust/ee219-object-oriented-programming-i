/*Assignment 1 - Exercise 8
Write a class Monkey. It should have the following methods: 
	display();  that displays if the monkey is happy or sad.
	feed();      that makes the monkey happy
	tease();    that makes the monkey sad 
*/
#include <iostream>
using namespace std;

class Monkey
{
private:
	
	bool mood;

public:
	
	virtual void display();
	virtual bool feed();
	virtual bool tease();
};

void Monkey::display()
{
	if (mood == true)
	{
		cout << "Monkey is Happy" << endl;
	}
	else
	{
		cout << "Monkey is Sad" << endl;
	}
}

bool Monkey::feed()
{
	return mood = true;
}

bool Monkey::tease()
{
	return mood = false;
}
// program will not run as there is no main
