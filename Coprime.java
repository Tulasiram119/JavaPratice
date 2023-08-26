class CoPrime 
{
	public static void main(String[] args) 
	{
		int n=10;
		int m=20;
		boolean check=true;
		for(int i=1;i<=m;i++){
			if(n%i==0 && m%i==0){
				if(i!=1){
					check=false;
					break;
				}
			}
		}
		if(check){
			System.out.println("Coprimes");
		}
		else{
			System.out.println("not coprimes");
		}
	}
}

