import java.util.LinkedList;
import java.util.Stack;

public class StackAssignments {
    public static boolean palindromeLinkedList(LinkedList<Character> list) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            s.add(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            if (s.pop() != list.get(i)) {
                return false;
            }
        }
        return true;

    }

    public static String stringSimplifiy(String str) {
        Stack<String> s = new Stack<>();
        String res = "";
        int length_A = str.length();
        for (int i = 0; i < length_A; i++) {
            String dir = "";
            while (i < length_A && str.charAt(i) == '/') {
                i++;
            }
            while (i < length_A && str.charAt(i) != '/') {
                dir += str.charAt(i);
                i++;
            }
            if (dir.equals("..") == true) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else if (dir.equals(".") == true) {
                continue;
            } else if (dir.equals(".") == true) {
                continue;
            } else if (dir.length() != 0) {
                s.push(dir);
            }
        }
        Stack<String> s1 = new Stack<>();
        while (!s1.isEmpty()) {
            if (s1.size() != 1) {
                res += (s1.pop() + "/");
            } else {
                res += s1.pop();
            }
        }
        return res;
    }
    public static String decode(String str){
        Stack<Integer> integerStack = new Stack<>();
        Stack<Character> characterStack = new Stack<>();
        String temp = "",result = "";
        for(int i =0;i < str.length();i++){
            int count =0;
            if(Character.isDigit(str.charAt(i))){
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 +str.charAt(i) +'0';
                    i++;
                }
                i--;
                integerStack.push(i);
            } else if(str.charAt(i) == ']'){
                temp = "";
                count = 0;
                if (!integerStack.isEmpty()) {
                    count = integerStack.peek();
                    integerStack.pop();
                }
                while (!characterStack.isEmpty() && characterStack.peek() != ']') {
                   temp = characterStack.peek()+temp;
                   characterStack.pop(); 
                }
                if(!characterStack.isEmpty() && characterStack.peek() == '['){
                    characterStack.pop();
                }
                for(int j = 0;j<count;j++){
                    result = result + temp;
                }
                for(int j = 0;j< result.length();j++){
                    characterStack.push(result.charAt(i));
                }
                result = "";
            } else if(str.charAt(i) == '['){
                if(Character.isDigit(str.charAt(i-1))){
                    characterStack.push(str.charAt(i));
                }else{
                    characterStack.push(str.charAt(i));
                    integerStack.push(1);
                }
            } else{
                characterStack.push(str.charAt(i));
            }
            
        }
        while (!characterStack.isEmpty()) {
                result = result + characterStack.peek();
                characterStack.pop();
            }
            return result;

    }
    public static int trappedRainWater(int height[]){
        Stack<Integer> s = new Stack<>();
        int n = height.length;
        int ans = 0;
        for(int i =0;i < n;i++){
            while ((!s.isEmpty()) && (height[s.peek()] < height[i])) {
                int pop_height = s.peek();
                s.pop();
                if(s.isEmpty()){
                    break;
                }
                int distance = i - s.peek() - 1;
                int min_height = Math.min(height[s.peek()],height[i])-pop_height;
                ans += distance * min_height;
            }
            s.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        // LinkedList<Character> list = new LinkedList();
        // list.add('A');
        // list.add('B');
        // list.add('Z');
        // list.add('F');
        // list.add('A');
        // System.out.println(palindromeLinkedList(list));
        // String str = new String("/a/./b/../../c/");
        // String res = stringSimplifiy(str);
        // System.out.println(res);
        // String str = "3[b2[ca]]";
        // System.out.println(decode(str));
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.print(trappedRainWater(arr));
    }
}
