class Node{
    int value;
    Node right;
    Node left;
    Node root;
    public Node(int value){
        this.value = value;
        right = null;
        left = null;
    }
}
public class Bstpractice {
    public Node root;
    public void insert(int value){
        if(root==null){
            root = new Node(value);
            return;
        }
        Node current = root;
        Node parent = null;
        while(current!=null){
            parent = current;
            if(value<current.value){
                current = current.left;
            }
            else if(value>current.value){
                current = current.right;
            }
            else{
                return ;
            }
         }
        Node newnode = new Node(value);
        if (value < parent.value) {
            parent.left = newnode;
        } else {
            parent.right = newnode;
        }

    }   
    public int maxele() {
        Node max_ele = root;
        while(max_ele.right != null) {
            max_ele = max_ele.right;
        }
        return max_ele.value;
    }

    public int minele() {
        Node min_ele = root;
        while(min_ele.left != null) {
            min_ele = min_ele.left;
        }
        return min_ele.left;
    }

    public int getHeight(Node n) {
        if(node == null) {
            return -1;
        }
        int leftHeight = getHeight(n.left);
        int rightHeight = getHeight(n.right);
        return 1+(Math.max(leftHeight, rightHeight));
    }
}
