class SecondClass
{
  //int x=10; //(non Static) - Class Member or Instance member or class or instance variable
  //int y=10; //(non Static) - Class Member or Instance member or class or instance variable
 static int x=10; //(Static) - Class Member or Instance member or class or instance variable
 static int y=20; //(Static) - Class Member or Instance member or class or instance variable
 public static void main(String a[])
	{
		System.out.print("The instance variables are" +x+ " " +y);
	}
}

/* Note : 1.Difference between static and non static members Min 4 points
          2. Why x and y Directly accssible in main() with static keyword
          3. Check what happen in output when command static members an uncommand non-static members-justify  

*/