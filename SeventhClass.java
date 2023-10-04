class SeventhClass
{
int x;int y; // Two non static members declared
void display(int e, int f) // non static member function with two parameters of type integer
	{
	System.out.println("Iam from display function" +x+" "+y+" "+e +" "+f);
	}
public static void main(String a[])
	{
	 int e =5; // variable intialization - local scope of main()
	 int f=4;// variable intialization - local scope of main()
	 SeventhClass s7= new SeventhClass(); // Object craetion with local reference
	 s7.x=10; // Intialization of instance member - using object reference
	 s7.y=15; // Intialization of instance member - using object reference
	 System.out.println("The instance variables are" +s7.x+""+s7.y);
	 s7.display(e,f); // invoking non static memeber function using object reference with arguments
	}
}

/*
1. difference between parameter and argument
2. How to initialize instance memeber from main()
3. what happen if i call display function with our argument
*/