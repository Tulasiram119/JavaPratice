import java.util.Scanner;
class HarshadNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp =n;
		int sum =0;
		while(n>0){
			int digit = n%10;
			sum+=digit;
			n=n/10;
		}
		if(temp%sum==0){
			System.out.println("Harshad number");
		}
		else{
			System.out.println("not a harshad number");
		}


		
	}
}
