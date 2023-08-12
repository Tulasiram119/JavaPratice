class NonFibanacci 
{
	public static void main(String[] args) 
	{
		int n1 =0;
		int n2 =1;
		int n3=0;

		for(int i=1;i<=10;i++)
		{
			if(n3==i){
				n1=n2;
			    n2=n3;
			    n3=n1+n2;
			}
			System.out.println(i);
			
			

		}
	}
}
