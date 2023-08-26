class FibannaciSeriesReverse 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;c<=10;i++){
			System.out.print(c+",");			
			a=b;
			b=c;
			c=a+b;
			
		}
		if(c>10){
			c=b;
			b=a;
			a=c-b;
		}

		

	}
}

