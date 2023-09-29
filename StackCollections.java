import java.util.*;

public class StackCollections {

    public static void pushBottom(int data, Stack<Integer> s) {
        if (s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(data, s);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        String res = "";
        while (!s.empty()) {
            res = res + s.peek();
            s.pop();
        }
        return res;
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }
        int ele = s.pop();
        reverseStack(s);
        pushBottom(ele, s);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static void stockSpan(int[] stock, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stock.length; i++) {
            int currPrice = stock[i];
            while (!s.isEmpty() && currPrice > stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    public static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[arr.length];
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            while (!s.empty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.empty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return nextGreater;
    }

    public static boolean validParenthis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((ch == ')' && s.peek() == '(') ||
                        (ch == '}' && s.peek() == '{')
                        || (ch == ']' && s.peek() == '[')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        }
        return false;

    }

    public static boolean duplicateParenthisis(String str) { // O(n)
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void maxArea(int [] arr){
        int maxArea = 0;
        int[] nsl = new int[arr.length];
        int[] nsr = new int [arr.length];
        //next smaller element right 
        Stack<Integer> s = new Stack<>();
        for(int i =arr.length-1; i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            } else{
                nsr[i] = s.peek();
            }
            s.push(i);
        } 
        //next smaller element left
         s = new Stack<>();
        for(int i = 0; i < arr.length;i++){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            } else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //curr width = j-i-1; nsr[i] - nsl[i]-1;
        for(int i = 0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = height*width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println(maxArea);
    }
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushBottomR(11, s);
        // while (!s.empty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }
        // System.out.println(reverseString("null"));
        // reverseStack(s);
        // printStack(s);
        // int stock[] = {100,80,60,70,60,85,100};
        // int span[] = new int[stock.length];
        // stockSpan(stock,span);
        // for(int i = 0;i < span.length;i++){
        // System.out.println(span[i]+" ");
        // }
        // int[] arr = {6,8,0,1,3};
        // arr = nextGreaterElement(arr);
        // for(int i=0;i< arr.length;i++){
        // System.out.print(arr[i]+" ");
        // }
        // String str = "(a+b)";
        // String str1 = "((a+b))";
        // System.out.println(validParenthis(str));
        // System.out.println(duplicateParenthisis(str1));
        int[] arr = { 2, 1, 5, 6, 2, 3 }; 
        maxArea(arr);       

    }
}
