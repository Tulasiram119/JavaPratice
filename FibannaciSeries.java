class FibannaciSeries 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;c<=100;i++){
			System.out.print(c+",");			
			a=b;
			b=c;
			c=a+b;
		}
	}
}
