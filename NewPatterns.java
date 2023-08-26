class NewPatterns 
{
	public static void pattern1(){
		int n= 7;
		int m=4;
		int star =1;
		for(int i=0;i<=n;i++){
			for(int j=1;j<=star;j++){
				System.out.print(" * ");
			}
			star++;
			if(star>m){
				break;
			}
			System.out.println();
			

			
		}
		System.out.println();
		for(int i=0;i<=n;i++){
			for(int j=star-2;j>=1;j--){
				System.out.print(" * ");
			}
			star--;
			if(star<=0){
				break;
			}
			System.out.println();
		}
	}
	public static void diamond(){
		int n= 9;
		int space = n-1;
		int star = 1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++){
				System.out.print("   ");
			}
			for(int j=1;j<=star;j++){
				System.out.print(" * ");
			}
			star+=2;
			space--;
			System.out.println();
		}
		
		
	

	}
	public static void reverseDiamond(){
		int space2 =0;
		int star2 = (2*n-1);
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++){
				System.out.print("   ");
			}
			for(int j=1;j<=star;j++){
				System.out.print(" * ");
			}
			star2-=2;
			space2++;
			System.out.println();
		}
	}
	public static void main(String[] args){


		diamond();
	}
}
