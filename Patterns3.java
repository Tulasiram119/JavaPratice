class Patterns3 
{

	public static void pattern1(){

		for(int i=1;i<=5;i++){
			int a=i;
			int b=5-i;
			for(int j=0;j<=5;j++){
				while(b>0){
					System.out.print("   ");
					b--;
				}
				while(a>0){
					System.out.print(" "+a+" ");
					a--;
				}
			}
			System.out.println();
		}
	}
	public static void pattern3(){
		int num=9;
		char ch ='a';
		for(int i=1;i<=6;i++){
			for(int j=1;j<=6;j++){
				if(i+j<=7){
					if(i%2!=0){
						System.out.print(" "+num+" ");
						num--;
						if(num<0){
							num=9;
						}
					}
					else{
						System.out.print(" "+ch+" ");
						ch++;
						if(ch>'h'){
							ch='a';
						}
					}
				}
				
			}
			System.out.println();
		}
	}



	public static void main(String[] args) 
	{
		pattern3();
		
	} 
}
