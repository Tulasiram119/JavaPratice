import java.util.*;
public class Greedy {
    
    public static void maxActivites(int [] start,int[] end){
        //example sorting
        int [][] activites = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }
        //sorting using lamdsa functions
        Arrays.sort(activites,Comparator.comparingDouble(o->o[2]));
        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // 1st activity
        maxAct = 1;
        ans.add(activites[0][0]);
        int lastEnd = activites[0][2];
        for(int i =1;i< end.length;i++){
            if(start[i] >=lastEnd){
                maxAct++;
                ans.add(activites[i][0]);
                lastEnd = activites[i][2];
            }
        }
        System.out.println("Max Activites : "+maxAct);
        for(int i =0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
    public static void fractionalNapSack(int [] val, int [] weight,int W){
        double ratio [][] = new double[val.length][2];

        //0th column has index and 1 th column has ratio of val to weight
        for(int i=0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        //ascending order
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        //we want  desending order
        int capacity = W;
        int finalValue = 0;
        for(int i = ratio.length-1 ; i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                finalValue += val[idx];
                capacity -= weight[idx];
            }else{
                finalValue += (capacity*ratio[i][1]);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final value : "+finalValue);
    }
    public static void minDifference(int [] A,int [] B){
        Arrays.sort(A);
        Arrays.sort(B);
        int min = 0;
        for(int i = 0;i<A.length;i++){
            min += Math.abs(A[i]-B[i]);
        }
        System.out.println("Min Absolute difference :"+min);
    }
    public static void maxLengthPairs(int[][] pairs){
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chainLength = 1;
        int chainEnd = pairs[0][1]; // last selected pair end
        for(int i = 1;i<pairs.length;i++){
            if(pairs[i][0] > chainEnd){
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("chain length "+chainLength);
    }
    public static void indianCoins(Integer[] coins,int amount){
        Arrays.sort(coins,Comparator.reverseOrder());
        int count = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0;i< coins.length;i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    count++;
                    amount -= coins[i];
                    res.add(coins[i]);
                }
            }
        }
        System.out.println("Number of coins :"+count);
        System.out.println("coins :"+res);
    }
    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int deadline,int profit,int id){
            this.deadline = deadline;
            this.profit = profit;
            this.id = id;
        }
    }
    public static void jobSequence(int[][] jobInfo){
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i =0;i<jobInfo.length;i++){
            jobs.add(new Job(jobInfo[i][0],jobInfo[i][1],i));
        }
        
        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit); // desending order
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i =0;i < jobs.size();i++){
            Job curr = jobs.get(i);            
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("max Jobs :"+ seq.size());
        for(int i =0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
    }
    public static void chocola(Integer[] costver,Integer[] costHor){
        Arrays.sort(costver,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        while(h < costHor.length && v < costver.length){
            if(costver[v] <= costHor[h]){//horizontal
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }else{//vertical
                cost += (costver[v] * hp);
                vp++;
                v++;
            }
        }
        while(h < costHor.length){
           cost += (costHor[h] * vp);
            hp++;
            h++; 
        }
        while(v < costver.length){
           cost += (costver[v] * hp);
            vp++;
            v++; 
        }
        System.out.println("min cost :"+cost);
    }
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        //maxActivites(start, end);
        int[] val = {60,100,120};
        int [] weight = {10,20,30};
        int W = 50;
        //fractionalNapSack(val, weight, W);
        int[] A = {4,1,8,7};
        int[] B = {2,3,6,5};
        //minDifference(A, B);
        int [][] pairs = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        //maxLengthPairs(pairs);
        Integer [] coins = {1,2,5,10,20,50,100,500,1000,2000};
        int amount = 999;
        //indianCoins(coins, amount);
        int [][] jobsInfo = {{4,20},{1,10},{1,40},{1,30}};
        //jobSequence(jobsInfo);
        int n = 4,m = 6;
        Integer costver[] = {2,1,3,1,4};//m-1
        Integer costHor[] = {4,1,2};//n-1
        chocola(costver, costHor);
    }
}
