class NthHappynumber 
{
	public static void main(String[] args) 
	{
		int n=13;
		boolean check=false;
		int sum=0;
		while(n>9){

			while(n>0){
				int d=n%10;
				sum+=(d*d);
				n/=10;
			}
			n=sum;
			if(sum==1){
				check=true;
				break;
			}
			
		}
		if(check){
			System.out.println("happy number");
		}
			
	}
}
