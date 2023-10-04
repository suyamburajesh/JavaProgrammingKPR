class FirstClass // Class Created with class name FirstClass
{  //Beign of Class scope 
	
	public static void main(String a[]) // Main Function with String array as Argument
		{ // Begin of Main memberfunction Scope
			int x=5;int y=4; // Two variable in local Scope(Accessible with in main Function)
			// Display Output in console -Three ways
			System.out.print("The result is" +x); //display in console without newline character
			//System.out.printf("The result is %d,%d",x,y);//display in console  with format
			//System.out.println("The result", x,y);//display in console with newline character
		} // End of main memberfunction Scope
}//End of Class Scope

/*
Note:
1. Rules to declare class name and file name
2. Why the main should be static and public
3. What is meaning of string array argument of main()
4. difference between local and global scope of variable
5. difference between print(), println(), printf()- min 3 points each
*/
