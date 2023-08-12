public class DivideAndConquer {
    public static void printArr(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] arr,int si,int ei){
        //base case
        if(si >= ei){
            return;
        }
        
        
        //kaam
        int mid = (si+(ei-si))/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int[] arr,int si,int mid,int ei){
        int [] temp = new int[ei-si+1];
        int i = si;
        int j= mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void quickSort(int [] arr,int si,int ei ){
        //base case
        if(si>=ei){
            return;
        }

        //last elemnet
        int pindx = partition(arr, si,ei);
        quickSort(arr, si, pindx-1);//left part
        quickSort(arr, pindx+1, ei);//right part
    }
    public static int partition(int [] arr,int si,int ei){
        int pivot = arr[ei];
        int i= si-1; // to make space for values smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp= arr[j];
                arr[j]=arr[i];
                arr[i]= temp;
                
            }
            
        }
        i++;
        int temp= pivot;
        arr[ei]=arr[i];
        arr[i]= temp;
        return i;

    }
    public static int searchInSortedArray(int [] arr,int target,int si,int ei){
      //base case
      
        if(si>ei){
        return -1;
       }
       
       
        //kaam
        int mid = si+(ei-si)/2;

        //found
        if(arr[mid]==target){
            return mid;
        }
        //mid on line 1
        if(arr[si]<= arr[mid]){
            
            if(arr[si] <= target && arr[mid] >= target ){ //left part of line 1
                 return searchInSortedArray(arr, target, si, mid);
            }
            else{ //right part of mid
                return searchInSortedArray(arr, target, mid+1, ei);
            }
        }
        else{
            //mid on line 2
            if(arr[mid]<=target && target>=arr[ei]){//right part of line 2
                return searchInSortedArray(arr, target, mid+1, ei);
            }
            else{ //left part of mid
                return searchInSortedArray(arr, target, si, mid-1);
            }
        }
    }
    
    
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        //mergeSort(arr,0,arr.length-1);
        //quickSort(arr, 0, arr.length-1);
        //printArr(arr);
        int target = 0;
        int x=searchInSortedArray(arr, target, 0, arr.length-1);
        System.out.println(x);
    }
}
