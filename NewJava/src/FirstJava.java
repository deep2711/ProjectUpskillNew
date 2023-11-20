import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FirstJava {

	public static void main(String[] args) throws Exception {
		
//		System.out.println("Diyanshu");
//         int, float,char,char, String, long, double, Boolean, Short, Byte
//		
//		Variables and Data Types
//		int age = 18;
//		float percentage = 82.4f;
//		char grade = 'B';
//		String name = "Raghav";
//		boolean isValid = true;
//		long MobNum = 9876455881l;
//		
//		
//		accessing Variables and Data Types
//		System.out.println(age);
//		System.out.println(percentage);
//		System.out.println(grade);
//		System.out.println(name);
//		System.out.println(isValid);
//		System.out.println(MobNum);
//		
//		Operators - Arithmetic Operators(+, -, *, %, /, ++, --), Logical Operator (), Assignment Operators, Bit-wise Operator
//		
//		int firstNumber = 123;
//		int secondNumber = 234;
//		
//		In line 32 we are doing typecasting- i.e changing data type of a variable.
//		double sum = (double)firstNumber / (double)secondNumber;
//		
//		int rem = firstNumber % secondNumber;
//		System.out.println(sum);
//		System.out.println(rem);
//
//		 increment and decrement
//		int a = 12;
//		a++;
//		System.out.println(a);
//		a--;
//		System.out.println(a);
//
//		 Assigment Operator -> "=" This is used to assign a vale.
//		
		//Taking User Input
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your age: ");
//		int age = sc.nextInt();
//		System.out.println("Your age is: ");
//		System.out.println(age);
//		System.out.println(2*age); just trying different this that we can do with our input
//		System.out.println("Enter your Height:");
//		float height = sc.nextFloat();
//		System.out.println("Your Height is: ");
//		System.out.println(height);
//		System.out.println("Enter your name: ");
//		String name = sc.nextLine();
//		System.out.println("Your name is ");
//		System.out.println(name);
//		
//		Conditional Statements 
//		
//		
//		System.out.println("Enter your age");
//		int age = sc.nextInt();
//		System.out.println(age);
//		if(age>18) {
//			System.out.println("You can vote");
//		}
//		else {
//			System.out.println("you can't vote ");
//		
//		}
//		
//		 conditional operator -> <,>, <=, >=, ==, !=
//		
//		System.out.println(19<18);
//		System.out.println(19>18);
//		System.out.println(19<=18);
//		System.out.println(19>=18);
//		System.out.println(19==18);
//		System.out.println(19!=18);
//		
//		else if condition
//		char grade = 'D';
//		
//		if(grade == 'A') {
//			System.out.println("your grade is very good");
//		}
//		else if (grade == 'B') {
//			System.out.println("your grade is good, keep learning");
//		}
//		else if (grade == 'C') {
//			System.out.println("Need to improve");
//		}
//		else {
//			//System.out.println("Invalid");
//		}
//		
//		 switch case
//		
//		char marks = 'B';
//		switch(marks) {
//		case 'A':
//			System.out.println("Your grade is very good");
//			break;
//		case 'B' :
//			System.out.println("You need to improve");
//		    break;
//		case 'C' :
//			System.out.println("very poor");
//			break;
//		default:
//			System.out.println("worng argument");
//		}
//
//		logical operator -> &&(and), ||(or), !(not)
//		int age =12;
//		if ( !(age>18)) {
//			System.out.println("you can vote");
//		}
//		else {
//			System.out.println("you can't vote");
//		}
		
//		Loops -> for loop, while loop, do while loop
		
//		for loop
		
//		for(int i=0; i<10; i++) {
//			System.out.println(i+"Divyanshu");
//		}
		
//      while loop		
		
//		int a =23;
//		while(a<=100) {
//			System.out.println(a);
//			a++;		
//		}
//		int a = 23;
//		do {
//			System.out.println(a);
//			a++;
//		}
//		while (a>100);
		
      // Array
		
//		int marks[] = new int [5];
//		marks[0] = 23;
//		marks[1] = 12;
//		marks[2] = 56;
//		marks[3] = 34;
//		marks[4] = 99;
		
//		for(int i=0; i<marks.length; i++) {
//			System.out.println(marks[i]);
//		}
		
	   // another way to store element in array
//		int marks[] = {23, 12, 56, 34,99, 77,48};
		
//		for(int i =0; i<marks.length; i++) {
//			System.out.println(marks[i]);
//		}
		
		// Matrix -> 2D array
//		int a[][] =new int [2][3]; one of the way to initalize 2d array
		
//		int a[][]= {{1,2},{3,4}}; // another way to initalize 2d array
//		System.out.println(a[0][0]);
		
		//Methods -> use to call the peace of code that is repeating continously it increase the readiblity of code and maintanbality of code
		
		// syntax of method (method and function same thing)
		// returnType functionNmae (arguments){}
		
//	System.out.println(average(4,6)); // average method called here
		//Exception handling
		
//	int a[]	=new int[3];
//	try {
//	System.out.println(a[4]);
//	System.out.println(2/0);
//	} catch(Exception e) {
//		System.out.println("Error is there");
//		System.out.println(e.getLocalizedMessage());
		
//	}
	
//	System.out.println("After error also this will print");
		//Exception handling try catch 
//		int i,j,k=0;
//		i=8;
//		j=0;
		
//		try {
//			k= i/j;
//		}
//		catch(Exception e){
//			System.out.println("Cannot divide by zero");
//		}
		
//		System.out.println(k);
		
		//Exception handling try with multiple catch Unchecked 
		
//		int i,j,k=0;
//		int a[] = new int[4];
//		i=8;
//		j=2;
//		
//		try {
//			k= i/j;
//			for(int c=0; c<=4; c++) {
//				a[c]=c+1;
//			}
//			for(int value : a) {
//				System.out.println(value);
//			}
//		}
//		catch(ArithmeticException e){
//			System.out.println("Cannot divide by zero"+ e);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Maximum number of value is 4 ");
//		}
//	
//		System.out.println(k);
		
		//Exception handling checked
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("engter the value of j");
//		int i = sc.nextInt();
//		int j = 8;
//		int k=0;
//		try {
//			k=j/i;
//		}
//		catch(Exception e){
//			System.out.println("exception is there");
//		}
//		System.out.println(k);
		//	In finally block wether the exception is trown or that is will run the element in the finally block and print it
		
		//try with resource
	
//	try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in))) {
//		String str ="";
//		str = br.readLine();
//	}
		
		
		//user difined exception
		
//		int i=5;
//		try {
//			if(i<10)
//			{
//				throw new MyException("Errroorr");
//			}
//		}
//		catch(Exception e)
//		{
//		System.out.println(e);
//		}
		
		
		
		
	//element inside a try is resource and here we do not need catch and finally to execute it
	//Some time we also use throw throw it is just to supress the error and not to handel it
}
	//Method
//	static int average (int firstNumber, int secondNumber) {
//		int sum = firstNumber + secondNumber;
//		return sum/2;
//	}
	
	

}


//class MyException extends Exception
//{
//	public MyException(String msg) {
//		super(msg);
//	}
//}















