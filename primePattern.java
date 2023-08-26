class primePattern 
{
	public static void main(String[] args) 
	{
		int a=1;
		for(int i=0;i<=3;i++){
			for(int j=1;j<=3;j++){
				for(int n=a+1;n<=100;n++){
					a=n;
					int count=0;
					for(int m=1;m<=n;m++){
						if(n%m==0){
							count++;
						}
						if(count==2){
							System.out.print(" "+n+" ");
							break;
						
						}
					}
				}
				
			}
			System.out.println();
			
		}

	}
}
