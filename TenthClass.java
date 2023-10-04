class TenthClass
{
int x;int y;
public TenthClass(int e, int f)// Parameterized constructor
{
  x=e;
 // y=f;	
}
void display()
	{
	System.out.println("Iam from display function" +x+" "+y);
	}
public static void main(String a[])
	{
	 TenthClass s10= new TenthClass(10,15); // Invoking parameterized constructor with arguments
	 System.out.println("The instance variables are" +s10.x+""+s10.y); 
	 s10.display();
	}
}

/*
Note: 
1. What is parameterized constructor
2. how to invoke parameterized constructor
*/