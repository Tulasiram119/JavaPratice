class HappyNumber 
{
	public static void main(String[] args) 
	{

		int n =1;
		int nth=23;
		while(n>0){
			int count=0;
			int temp =n;
			while(temp>9){
				int sum=0;
				while(temp>0){
					int d=temp%10;
					int sq = d*d;
					sum+=sq;
					temp/=10;
				}
				temp=sum;
				if(sum==1){
					count++;
				}
				if(count==nth){
					System.out.println(n);
			}
			n++;
	       
	   }
	}
}


		
			
		
	
	


		
	

}
