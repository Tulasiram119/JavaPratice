class NumberPattern 
{
	public static void numberPattern1(){
		int n=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(" "+n+" ");
				n++;
			}
			System.out.println();
		}
	}
	public static void numberpattern2(){
		for(int i=1;i<=5;i++){
			int n=1;
			for(int j=1;j<=5;j++){
				System.out.print(" "+n+" ");
				n++;
			}
			System.out.println();
		}
	}
	public static void numberpattern3(){
		for(int i=1;i<=5;i++){
			int n=5;
			for(int j=1;j<=5;j++){
				System.out.print(" "+n+" ");
				n--;
			}
			System.out.println();
		}
	}
	public static void numberpattern4(){
		int n=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(n==6){
					n=1;
				}
				System.out.print(" "+n+" ");
				n++;
			}
			System.out.println();
		}
	}
	
	
	
	
	public static void main(String[] args) 
	{
		numberPattern1();
		System.out.println();
		System.out.println();
		System.out.println();
		numberpattern2();
		System.out.println();
		System.out.println();
		System.out.println();
		numberpattern3();
		System.out.println();
		System.out.println();
		System.out.println();
		numberpattern4();

	}
}
