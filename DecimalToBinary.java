import java.util.*;
class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		int n=17;
		int res =0;
		int j=0
		while(n>0){
			int rem = n%2;
			res = num+rem*Math.pow(10,j);
			n=n/2
			j++;
		}
		
	}
}
