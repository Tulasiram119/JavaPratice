class BtoDec 
{
	public static int expo(int n,int pow){
		int ex =1;
		for(int i=1;i<=pow;i++){
			ex*=n;
		}
		return ex;
	}
	public static void main(String[] args) 
	{
		int n=26;
		int dec=0;
		int pow=0;
		while(n>0){
			int d=n%2;
			dec+=(d*expo(10,pow));
			n=n/2;
			pow++;
		}
		System.out.println(dec);
	}
}
