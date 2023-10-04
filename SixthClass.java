class SixthClass
{
int x;int y; // two non static instance member declaration
void display() // Non static member function with defination with out paramenter
	{
	System.out.println("Iam from display function" +x+""+y);
	}
public static void main(String a[])
	{
	 SixthClass six= new SixthClass(); // Object creation and assignment to reference variable
	 System.out.println("The instance variables are" +six.x+""+six.y);
	 six.display(); // invoking non static member function (without arguments) from static context using object reference
	}
}

/*
Note: 
1. How to access non static meber function from static member function
2. Which scenario non static memeber function / static member function is used for best results
*/