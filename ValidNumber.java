class ValidNumber 
{
	public static void main(String[] args) 
	{
		int n= 12345;
		int temp=n;
		int nth = 1;
		while(temp>0){
			int digit = temp%10;
			temp/=10;
			int count=0;
			while(temp>0){
				int digit2= temp%10;
				if(digit2>digit){
					count++;
				}
				if(nth==count){
					System.out.println(digit);
					break;
				}
			}
			
		}
		
			
	}
}
