class Pattern0 
{
	public static void main(String[] args) 
	{
		int space =3;
		int star =1;
		int var =1;
		for(int i=1;i<=4;i++){
			var=1;
			for(int j=1;j<=space;j++){
				System.out.print("   ");
			}
			space--;
			for(int j=1;j<=star;j++){
				System.out.print(" "+var+" ");
				var--;
				if(var<0){
				var=1;
			    }
			}
			star+=2;
			
			System.out.println();
		}
	}
}
