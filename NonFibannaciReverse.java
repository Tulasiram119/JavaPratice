class NonFibannaciReverse 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int c=1;
		for(int i=1;i<=10;i++){
			if(i==c){
				a=b;
				b=c;
				c=a+b;
			}
			else{
				System.out.print(i+",");
			}
		}
		System.out.println();
		if(c>10){
			c=b;
			b=a;
			a=c-b;
		}
		for(int i=10;i>=1;i--){
			if(i==c){
				c=b;
				b=a;
				a=c-b;
			}
			else{
				System.out.print(i+",");
			}
		}

	}
}
