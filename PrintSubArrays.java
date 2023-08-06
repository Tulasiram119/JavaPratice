import java.util.Scanner;
public class PrintSubArrays {
    /**
     * @param args
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Size");
       int n = sc.nextInt();
       System.out.println("Elements");
       int [] arr = new int[n];
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        
       }
       //print(arr); 
       //prefixSum(arr);
       //pairs(arr);
       //System.out.println(kadane(arr));
       System.out.println(lenOfLongSubarr(arr, n, 10));

    }
    public static void print(int[] arr){
        int maxsum=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++){
                sum=+arr[k];
                
            }
            System.out.println("sum :"+sum);
            maxsum= Math.max(sum,maxsum);
        }
    }
    if(maxsum==0){
        for(int i=0;i<arr.length;i++){
            maxsum= Math.max(maxsum,arr[i]);
        }
    }
    System.out.println("maxsum :"+maxsum);
}
public static void prefixSum(int[] arr){
    int [] psum = new int[arr.length];
    psum[0]=arr[0];
    int sum=0;
    int maxsum=0;
    for(int i=1;i<arr.length;i++){
        psum[i]=psum[i-1]+arr[i];
    }
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<psum.length;j++){
            try {
                sum = (i==0)? psum[j]:psum[j]-psum[i-1];
                System.out.println("Sum is:"+sum);
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Something went wrong please check code");
            }
            maxsum = Math.max(sum,maxsum);
            
        }
    }
    System.out.println("maxsum"+maxsum);
}
public static void pairs(int[] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            System.out.println("("+arr[i]+","+arr[j]+")");
        }
    }
}
public static int kadane(int[] arr){
    int sum =0;
    int maxsum = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        sum=+arr[i];
        if(sum<0){
            sum=0;
        }
        maxsum=Math.max(sum,maxsum);
    }
    return maxsum;
}
public static int lenOfLongSubarr (int A[], int N, int K) {
    int maxlength=0;
    
    for(int i=0;i<N;i++){
        int sum=0;
        for(int j=i+1;j<N;j++){           
            sum+=A[j];
            if(sum==maxSum(A)){
                int length = j-i+1;
                maxlength= Math.max(length,maxlength);
            }               
        }
    }
    return maxlength;
    
    
}
public static int maxSum(int[] A){
    int sum=0;
    int maxsum = Integer.MIN_VALUE;
    for(int i=0;i<A.length;i++){
        sum+=A[i];
        if(sum<0){
            sum=0;
        }
        maxsum=Math.max(sum,maxsum);
    }
    return maxsum;
}

}
