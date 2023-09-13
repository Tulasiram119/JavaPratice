import java.util.*;
public class ArrayListAssignments {
    public static boolean monotanic(ArrayList <Integer> arr){
        int lp =0;
        int rp = arr.size()-1;
        boolean greater = true;
        if(arr.get(lp)>arr.get(rp)){
            greater = false;
        }
        while(lp<rp){
            boolean check = arr.get(lp)<arr.get(rp);
            if(greater!=check){
                return false;
            } 
            lp++;
            rp--;           
        }
        return true;
    }
    public static boolean monotanicSimple(ArrayList <Integer> arr){
        boolean inc = true;
        boolean des = true;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)<arr.get(i+1)){
                des = false;
            }
            else if(arr.get(i)>arr.get(i+1)){
                inc = false;
            }
        }
        return inc || des;
    }
    public static ArrayList<Integer> lonelyNumber(ArrayList <Integer> arr){        
            ArrayList<Integer> list = new ArrayList<>();
            Map <Integer,Integer> map = new HashMap<>();
            for(int i=0;i<arr.size();i++){
                if(map.containsKey(arr.get(i))){
                    map.put(arr.get(i),map.get(arr.get(i)+1));
                }
                else{
                    map.put(arr.get(i),1);
                }
            }
            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(entry.getValue()==1){
                    if(map.containsKey(entry.getKey()+1) == false && map.containsKey(entry.getKey()-1) == false){
                        list.add(entry.getKey());
                    }
                }
            }
                
        return list;
    }
    public static int mostFrequent(ArrayList<Integer> nums,int key){
        int result[] = new int[1000];
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)==key){
                result[nums.get(i+1)-1]++;
            }
        }
        int maxvalue = Integer.MIN_VALUE;
        int ans =0;
        for(int i=0;i<1000;i++){
            if(maxvalue<result[i]){
                maxvalue = result[i];
                ans=i+1;
            }
        }
        return ans;
    }
    public static ArrayList<Integer> beautifulArrayList(int n){
        ArrayList <Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(i+1);
        }
        return res;
    }
    public static ArrayList<Integer> beautifulArrayListGiven(int n){
        ArrayList <Integer> res = new ArrayList<>();
        res.add(1);
        for(int i=2;i<n;i++){
            ArrayList <Integer> temp = new ArrayList<>();
            for(Integer e:res){
                if(2*e<=n)temp.add(e*2);
            } 
            for(Integer e: res){
                if(2*e-1<=n)temp.add(e*2-1);
            }
            res=temp;
        }  
        return res;      
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(200);
        
        System.out.println(monotanic(list));
        System.out.println(monotanicSimple(list));
        //System.out.println(lonelyNumber(list));
        System.out.println(mostFrequent(list, 1));
        System.out.println(beautifulArrayList(4));
        System.out.println(beautifulArrayListGiven(4));
    }
}
