import java.util.Scanner;

public class UpSkill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int a= num, r=0, result=0;
		
		while(a!=0) {
			r=a%10;
			a=a/10;
			result=result + r*r*r;
		
		}
		if(result ==num) {
			System.out.println("this is an armstrong :" + num);
			
		}
		else {
			System.out.println("This is not an armstrong number :" +num);
		}
		
    //2nd question
		int temp, last;
		int sum;
		System.out.println("The Armstrong Number falling in the range of 100-999 are as follows:");
		for (int i = 100; i <= 999; i++) {
			temp=i;
			sum=0;
			while (temp!= 0) {
				last=temp%10;
				sum += (last * last * last);
				temp /=10;
 
			}
			if (sum == 1) {
				System.out.println(i);
				
			}
		}
		
		//Question 3
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the principal: ");
		double principal = input.nextDouble();
		
		System.out.println("Enter the rate :");
		double rate = input .nextDouble();
		
		System.out.println("Enter The Duration :");
		double time = input.nextDouble();
		
		double simpleIntrest =(principal*rate*time)/100;
		
		System.out.println("Enter the number of time interest is Componded");
		double number = input.nextDouble();
		
		double compoundIntrest = principal *(Math.pow((1+rate/100),(time * number )))-principal;
		System.out.println("simple Intrest is : "+simpleIntrest);
		
		System.out.println("Compound intrest is :"+compoundIntrest);
		
		//Question 4
		System.out.println("Enter the 3 marks");
		Scanner input2 = new Scanner (System.in);
		int mark1=input2.nextInt();
		int mark2=input2.nextInt();
		int mark3=input2.nextInt();
		if(mark1 > 60 && mark2 >60 && mark3 >60) {
			System.out.println("Hey You passed the Exam");
			
		}
		else if((mark1 > 60 && mark2 > 60)||(mark2 >60 && mark3 > 60) ||(mark3 > 60 && mark1>60)) {
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("failed");
		}
		
		//Question5
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter your CTC: ");
		double ctc = input3.nextDouble();
		double taxAmount;
		
		if((ctc>0)&&(ctc>180000)) {
			System.out.println("You belong to SLAB-A And the tax payable is nil");
			
			
		}
		if((ctc>180000)&&(ctc>300000)) {
			taxAmount=(ctc*0.10);
			System.out.println("You belong to SLAB-B and tax payable is :"+taxAmount);
		}
		else if((ctc>300000)&&(ctc>500000)) {
			taxAmount=(ctc*0.20);
			System.out.println("You belong to SLAB-C and tax payable is :"+taxAmount);
		}
		if((ctc>500000)&&(ctc>1000000)) {
			taxAmount=(ctc*0.30);
			System.out.println("You belong to SLAB-D and tax payable is :"+taxAmount);
		}
		
		//Question 6
		String userid ="Cg_training";
		String Password ="Training";
		Scanner input1 = new Scanner(System.in);
		
		
		for(int i=3; i>=1; i--) {
			System.out.println("Enter the user id ");
			String user_Id1 = input1.nextLine();
			System.out.println("Enter user password :");
			String password1= input1.nextLine();
			
			
			
			if((userid.matches(user_Id1))&& (Password.matches(password1))) {
				System.out.println("Welcome" + userid);
				break;
			}
			
			
			else {
				System.out.println("Login Failed Attempts remaining "+(i-1));
				System.out.println("");
				if(i==1) {
					System.out.println("Contact Admin");
				}
			}
				
		}
		//Question 7
		int []num1= {1,16,23,65,22,87,94,12,24,65,14,78,96,91,55};
		int flag = 0;
		
		Scanner abc = new Scanner(System.in);
		System.out.println("Enter a number to search: ");
		int num2 = abc.nextInt();
		
		for(int i=0;i<num1.length;i++) {
			if(num1[i]==num2) {
				System.out.println("Match found at position: "+i);
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("Match not found");
		}
		
		
		
		
 
	}

}

