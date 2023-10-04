class MyClass
{
   int mem1, mem2;

void setInput(int mem1=5,int mem2=6)
{
 this.mem1 = mem1;
 this.mem2 = mem2;
}

void display()
{
System.out.println(mem1+mem2);
}
public static void main(String [] a)
{
Myclass ob = new MyClass();
ob.setInput();
ob.display();
}
}
