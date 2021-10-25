package mcs_3E.DSA.AVLTreeAlgo.AVLLinkedListTutorial;

public class AVL {

    Node root=null;

    int max(int a, int b){
        return Math.max(a, b);
    }

    int getHeight(Node node){
        if(node==null){
            return -1;
        }
        else
            return node.height;
    }

    int getBalanceFactor(Node node){
        return getHeight(node.left)-getHeight(node.right);
    }

    // Right Rotation
    Node rightRotate(Node node){
        System.out.println("Right Rotating Node = "+node.key);
        Node n2=node.left;
        node.left=n2.right;
        n2.right=node;

        n2.height=max(getHeight(n2.left),getHeight(n2.right))+1;
        node.height=max(getHeight(node.left),getHeight(node.right))+1;
        System.out.println("Returning node= "+n2.key+" as parents \n");
        return n2;
    }
    // Left Rotation
    Node leftRotate(Node node){
        System.out.println("Left Rotating Node = "+node.key);
        Node n2=node.right;
        node.right=n2.left;
        n2.left=node;

        n2.height=max(getHeight(n2.left),getHeight(n2.right))+1;
        node.height=max(getHeight(node.left),getHeight(node.right))+1;
        System.out.println("Returning node= "+n2.key+" as parents \n");
        return n2;
    }
    // Left-Right Rotation
    Node leftRightRotate(Node node){ // node= 40
        Node temp=leftRotate(node.left);
        node.left=temp;
        temp=rightRotate(node);
        return temp;
    }

    // Right-Left Rotation
    Node rightLeftRotate(Node node){
        Node temp=rightRotate(node.right);
        node.right=temp;
        temp=leftRotate(node);
        return temp;
    }

    void add(int key){ // 7
        root=add(root,key);
    }

    Node add(Node start,int key){ // starting node key=7
        if (start == null) { // false
            start=new Node(key); //
        }
        else if(key<start.key){ // 7 < 10 = true -- > 7 < 5 = false
            start.left=add(start.left,key); // 10 ka left = start = 5 , 7
            int balanceFactor=getBalanceFactor(start);
            if(balanceFactor==2 || balanceFactor==-2){
                if(key<start.left.key){
                    start=rightRotate(start);
                }
                if(key>start.left.key){
                    start=leftRightRotate(start);
                }
            }
        }
        else  if(key>start.key){ // 7 > 5 = true
            start.right=add(start.right,key);
            int balanceFactor=getBalanceFactor(start);
            if(balanceFactor==2 || balanceFactor==-2) {
                if(key>start.right.key){
                    start=leftRotate(start);
                }
                if(key<start.right.key){
                    start=rightLeftRotate(start);
                }
            }
        }
        else
            return start;
        start.height=max(getHeight(start.left),getHeight(start.right))+1;
        return start;
    }

    void inOrder(Node start){
        if(start!=null){
            inOrder(start.left);
            System.out.print(start.key+"\t");
            inOrder(start.right);
        }
    }

    void preOrder(Node start) {
        if (start != null) {
            System.out.print(start.key + " ");
            preOrder(start.left);
            preOrder(start.right);
        }
    }

    void postOrder(Node start){
        if (start != null) {
            postOrder(start.left);
            postOrder(start.right);
            System.out.print(start.key + " ");
        }
    }

    Node minValueNode(Node node) {
        Node min = node;
        while (min.left != null)
            min = min.left;

        return min;
    }

    Node maxValueNode(Node node){
        Node max =node;
        while(max.right!=null){
            max=max.right;
        }
        return max;
    }

    Node deleteNode(Node root, int key) {
        if (root == null)
            return null;
        if (key < root.key)
            root.left = deleteNode(root.left, key);
        else if (key > root.key)
            root.right = deleteNode(root.right, key);
        else
        {
            // node with only one child or no child
            if ((root.left == null) || (root.right == null))
            {
                Node temp = null;
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;

                // No child case
                if (temp == null)
                {
                    temp = root;
                    root = null;
                }
                else // One child case
                    root = temp; // Copy the contents of
                // the non-empty child
            }
            else
            {

                // node with two children: Get the inorder
                // successor (smallest in the right subtree)
                Node temp = minValueNode(root.right);

                // Copy the inorder successor's data to this node
                root.key = temp.key;

                // Delete the inorder successor
                root.right = deleteNode(root.right, temp.key);
            }
        }
        if (root == null)
            return root;
        root.height = max(getHeight(root.left), getHeight(root.right)) + 1;

        int balance = getBalanceFactor(root);

        if (balance > 1 && getBalanceFactor(root.left) >= 0)
            return rightRotate(root);
        if (balance > 1 && getBalanceFactor(root.left) < 0)
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if (balance < -1 && getBalanceFactor(root.right) <= 0)
            return leftRotate(root);
        if (balance < -1 && getBalanceFactor(root.right) > 0)
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }
}
