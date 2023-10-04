class EighthClass
{
int x;int y;    // Two non static variables are declared

void display() // Non static memeber function without argument
	{
	System.out.println("Iam from display function" +x+" "+y);
	}
static void setInput()  //static memeber function without argument
{
EighthClass s9= new EighthClass(); // since static member function - to access  and y need an object
  s9.x=10; //initilizing x with object reference
  s9.y=16; //initilizing x with object reference
  s9.display(); // invoking memeber function with object reference
}

static void setInput1(EighthClass ob)// static memeber function with object of class as argument
{
  ob.x=10; // invoking x using main()- class object
  ob.y=16;// invoking x using main()- class object
  ob.display();// invoking memeber function using main()- class object
}
public static void main(String a[])
	{
	EighthClass s8= new EighthClass();
	System.out.println("The instance variables are" +s8.x+""+s8.y);
	s8.setInput(); 
	s8.setInput1(s8);// supply the class object to another static function as argument
	//s8.display();
	
	}
}

/*
Note :
 1. How to access instance members from different static memeber function
 2. How to supply object as argument and parameter to function
*/