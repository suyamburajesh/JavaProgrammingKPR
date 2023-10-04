class ThirdClass
{
static int a; // (Static)Instance Memeber of class 
static int b; // (Static) Instance Member of class
static //Static Block - Execution starts before main()
{
System.out.println("Iam the beginner");
}
static int fun1() //(Static) - Member function or Method of class
{
System.out.println("Iam in fun 1");
return 0;
}
public static void main(String [] x)
{
System.out.println(ThirdClass.a + " " +ThirdClass.b); //Invoking static instance memeber using class name
ThirdClass.fun2();//Invoking static instance memeber function using class name
ThirdClass.fun1();//Invoking static instance memeber function using class name
}
static int fun2() //(Static) - Member function or Method of class
{
System.out.println("Iam in fun 2");
return 0;
}
}

/*
Note :
   1.When static memeber is needed to created insted non static member?
   2. Advantages of Static member functions over non static member function
   3. How to access static and non static members and functions
   4. why static block is executed before main function
*/