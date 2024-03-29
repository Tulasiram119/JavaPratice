/**
 * DivideAndConquerAssignment
 */


 public class DivideAndConquerAssignment {

    public static void printArr(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void printArr(String[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    
    
    
    public static int sortedArrayRotatedArray(int [] arr,int k){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==k){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                if(arr[start]<=k && arr[mid]>=k){
                    end=mid;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]<=k && arr[end]>=k){
                    start=mid;
                }
                else{
                    end=mid-1;
                }
            }
            
        }
        return -1;
    }
    public static String[] mergeSort(String[] arr,int si,int ei){
        if(si==ei){
            String[] A = {arr[ei]};
            return A;
        }

        int mid = si+(ei-si)/2;
        String[] arr1= mergeSort(arr, si, mid);
        String [] arr2 = mergeSort(arr1, mid+1, ei);
        String [] arr3= merge(arr1,arr2);
        return arr3;
    }
    public static String[] merge(String [] arr1,String arr2[]){
        int m= arr1.length-1;
        int n = arr2.length-1;
        String[] arr3 = new String[m+n+1];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(isAlphabeticallySmaller(arr1[1], arr2[j])){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            arr3[k]=arr1[i];
            k++;
            i++;

        }
        while(j<m){
            arr3[k]=arr1[j];
            k++;
            j++;
        }
        return arr3;
        
    }
    public static boolean isAlphabeticallySmaller(String str1,String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        return false;
    }
    public static int countInRange(int [] nums,int num,int lo,int hi){
        int count=0;
        for(int i=lo;i<hi;i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }
    public static int majorityElementRec(int[] nums , int lo,int hi){
        //base case
        if(lo==hi){
            return nums[lo];
        }
        int mid = lo+(hi-lo)/2;
        int left = majorityElementRec(nums, lo, mid);
        int right= majorityElementRec(nums, mid+1, hi);
        if(left==right){
            return left;
        }
        int leftcount= countInRange(nums, left, lo, hi);
        int rightcount = countInRange(nums, right, lo, hi);
        return leftcount>rightcount ? left:right;

    }
    public static int majorityElement(int [] nums){
        return majorityElementRec(nums, 0, nums.length-1);
    }
    
    public static int inversionCount(int[] arr,int left,int right){
        int invCount = 0;
        if(right>left){
            int mid = (left+right)/2;
            invCount = inversionCount(arr, left, mid);
            invCount += inversionCount(arr, mid+1, right);
            invCount += count(arr,left,mid+1,right);
        }
        return invCount;
    }
    public static int count(int[] arr,int left,int mid,int right){
        int i=left;
        int j= mid;
        int k=0;
        int invCount=0;
        int [] temp = new int [right-left+1];
        while(i<mid && j<= right){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                invCount +=(mid-i);
                j++;
                k++;
            }
        }
        while(i<mid){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<=right){
            temp[k]=arr[j];
            k++;
            j++;
        }
        for(i=left,k=0;i<right;i++,k++){
            arr[i]=temp[k];
        }
        return invCount;
    }
    public static int invMainCount(int[] arr){
        int n=arr.length-1;
        return inversionCount(arr, 0, n);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4,6};
        //System.out.println(sortedArrayRotatedArray(arr, 0));
        // String [] arr1 = {"sun", "earth", "mars", "mercury"};
        // int si =0;
        // int ei=arr1.length-1;
        // String[] A = mergeSort(arr1, si, ei);
        // printArr(A);
        //System.out.println(majorityElement(arr));
        System.out.println(invMainCount(arr));
        
    }
}