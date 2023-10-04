class FourthClass
{
int x;int y; // Non Static instace variable
public static void main(String a[])
	{
	 int d=new FourthClass().x;//accessing non static member x from static function --need to create object and invoke the member
	 int e = new FourthClass().y;//accessing non static member y from static function --need to create object and invoke the member
	 System.out.println("The instance variables are" +d+""+e);
	}
}

/*
Note:
     How many objects created in main()
     What is the syntax of object creation?
     How many ways an object can be created?
     what is the problem when invoking members directly using object (with out reference to object)
*/