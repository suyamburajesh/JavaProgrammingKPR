class EleClass
{
int x;
int y;
static void setInput(EleClass s11) // static member function with object as parameter
{
 s11.x=10;
 s11.y=16;
}
void display()
{
System.out.println("Iam from Display" +x +y);
}
public static void main(String a[])
{
  EleClass s11 = new EleClass();
  System.out.println("The Result from Main " +s11.x +s11.y);
  s11.setInput(s11); // call static member function by supply object reference as argument
  s11.display();   
}
}