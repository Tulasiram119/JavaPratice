public class BinaryTreesAssig {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node newNode(int data){
        Node temp = new Node(data);
        temp.left = null;
        temp.right = null;
        return temp;
    }
    public static boolean isUnival(Node root){
        if(root == null){
            return true;
        }
        if((root.left != null) && root.data != root.left.data){
            return false;
        }
        if((root.left != null) && root.data != root.right.data){
            return false;
        }
        return (isUnival(root.left)&&isUnival(root.right));
    }
    public static Node mirrorTree(Node root){
        if(root == null){
            return root;
        }
        Node left = mirrorTree(root.left);
        Node right = mirrorTree(root.right);

        root.left = right;
        root.right = left;

        return root;
        
    }
    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(1);
        root.right = newNode(1);
        root.left.left = newNode(1);
        root.left.right = newNode(1);
        System.out.println(isUnival(root));
    }
}
