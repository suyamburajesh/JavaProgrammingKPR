class NinethClass
{
int x;int y;
public NinethClass() // constructor of class - non Parametric (default)
{ //constructor are called without invocation by objects - directly called when object is created
  x=10;
  y=16;	
}
void display()
	{
	System.out.println("Iam from display function" +x+" "+y);
	}
public static void main(String a[])
	{
	 NinethClass s9= new NinethClass();
	 System.out.println("The instance variables are" +s9.x+""+s9.y); 
	 s9.display();
	}
}

\*
Note:
what are the significance of constructor
why constructors are called when object is created
what is default constructor
why declared (un initialized) instance memebers assiged with default value based on its type  
*\