class Parent  // Parent class - who is sharing the members to child class
{
int a, b;
void setInput(int a , int b)
{
 this.a= a;
 this.b= b;
}
}
class ThirteenClass extends Parent // inheriting class parent here using extends keyword
{ 
static public void main(String [] x)
{
ThirteenClass obRef = new ThirteenClass(); // Creation object to child class
obRef.setInput(20,25);// invoking parent class method using child class object
int c = obRef.a+obRef.b;// invoking parent class members using child class object
System.out.println("Result is "+c);
}
}

/*
Note : 
1.what is inheritance
2.what are the types of inheritance
3.How parent class share its member to child
4.Why multiple inheritance is not supported in java
5.why child class object is enough to access parent class members
*/