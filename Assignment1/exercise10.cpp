/*Assignment 1 - Exercise 10
Add a shake() method to your Monkey class. If you shake a monkey it takes on the opposite state, so if it is sad it becomes happy, and if it is happy it becomes sad. 
Demonstrate that your new method works correctly.
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

bool Monkey::shake()
{
	mood = !mood;
	return mood; 
}

int main()
{
	Monkey jack;
	Monkey john;
	
	jack.feed();
	john.tease();
	jack.display();
	john.display();
	jack.shake();
	john.shake();
	jack.tease();
	john.feed();
	jack.shake();
	john.shake();
	jack.display();
	john.display();

	return 0;
}
