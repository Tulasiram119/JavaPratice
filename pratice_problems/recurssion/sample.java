package pratice_problems.recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class sample {
    public static void reverseArray(ArrayList<Integer>arr){
        int low = 0;
        int high = arr.size()-1;
        while(low <high){
            int temp = arr.get(low);
            arr.set(low,arr.get(low));
            arr.set(high,temp);
            low++;
            high--;
        }
    }
    public static void score(ArrayList <Integer> arr){
        int player1 = 0;
        int player2 = 0;
        int chance = 1;
        for(int i =0;i<arr.size();i++ ){
            if(chance ==1){
                player1+=arr.get(i);
                chance = 2;
            }else{
                player2+=arr.get(i); 
                chance = 1;               
            }
            if(arr.get(i) %2 ==0){
                    reverseArray(arr);
            }
        }
        System.out.println(Math.abs(player1-player2));
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // reverseArray(arr);
        // for(int i =0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        arr.add(4);
        arr.add(3);
        score(arr);
    }
}
