/*Assignment 1 - Exercise 9
Demonstrate that your code works in Q8 works correctly by creating two monkey objects jack and john. 
Demonstrate that they can be independently happy/sad. 
Demonstrate all possible states through teasing and feeding jack and john.
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

int main()
{
	Monkey jack;
	Monkey john;
	
	jack.feed(); 
	john.tease();
	jack.display(); 
	john.display(); 
	jack.tease();
	john.feed();
	jack.display();
	john.display();

	return 0;
}
