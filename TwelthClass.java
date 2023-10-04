// Multi class java program
class First // class First with two instance variable and two instance member function
{
static int a;
 int b;
 int setInput(int a, int b)
	{
	 this.a = a;
         this.b = b;
	 System.out.println("I have assigned Local var to intstance var");
	return 0;
	} 
 void display()
	{
	 System.out.println("Class First OP"+a + " " +b);
	}
}	
class Second // class Second with two instance variable and two instance member function
{
 int c;
 int d;
 int setInput(int c, int d)
	{
	 this.c = c;
         this.d = d;
	 System.out.println("I have assigned Local var to intstance var");
	 return 0;
	} 
 void display()
	{
	 System.out.println("Class second OP"+c + " " +d);
	}
}
class TwelthClass // Main class also public class of program
{
int i=20, j=30;
static public void main(String [] x)
{
// invoking Main class members with main class object
 TwelthClass s12 = new TwelthClass();
 System.out.println("" +s12.i +s12.j);
 System.out.println("-----------------------");
// invoking First class members with First class object
 First ob1 = new First();
 ob1.setInput(10,15);
 ob1.display();
System.out.println("-----------------------");
// invoking second class members with Second class object
 Second ob2 = new Second();
 ob2.setInput(10,15);
 ob2.display();
}
}

/*
Note:
1. How many public class in this java program
2. what about the access specifiers of class First and second
3. how to access members of classes First and Second
4. how many class files created in this program
5. Why inheritance is needed based on the difficulty in this program
6. Why this keyword is used in this program
*/