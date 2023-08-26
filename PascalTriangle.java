class PascalTriangle 
{
	public static void main(String[] args) 
	{
		int space = 4;
		int star =1;
		int n1=0;
		int n2 =0;
		int n3 =1;
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
					n1=n2;
					n2=n3;
					n3=n1+n2;
				if(j==i){
					System.out.print(" 1");
				}
				else{

					
					System.out.print(" "+n3);
				}
				
			}
			star++;
			space--;
			System.out.println();
		}
	}
}
