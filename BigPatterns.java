class BigPatterns 
{
	public static void halfDiamond(){
		int space =9;
		int star =1;
		for(int i=0;i<=9;i++){
			

			
			for(int j=1;j<=space;j++){
				System.out.print("   ");
			}
			for(int k=1;k<=star;k++){
				System.out.print(" * ");
			}
			space--;
			star+=2;
			System.out.println();
		}		
	}
	public static void reverseHalfDiamond(){
		int space =0;
		int star =9;
		for(int i=0;i<=9;i++){
			

			
			for(int j=1;j<=space;j++){
				System.out.print("   ");
			}
			for(int k=1;k<=star;k++){
				System.out.print(" * ");
			}
			space--;
			star+=2;
			System.out.println();
		}		
	}
				

	public static void main(String[] args) 
	{
		reverseHalfDiamond();
	}
}
