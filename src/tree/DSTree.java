package tree;

import java.util.Scanner;

public class DSTree {
    private static Scanner scanner;

    static class DSNode {
        int data;
        DSNode left, right;

        public DSNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static DSNode createTree() {
        DSNode root = null;
        scanner = new Scanner(System.in);
        System.out.println("Enter data...");
        int data = scanner.nextInt();
        if (data == -1) {
            return null;
        }
        root = new DSNode(data);
        System.out.println("Enter left child for"+data +"...");
        root.left = createTree();
        System.out.println("Enter right child for"+data +"...");
        root.right =createTree();
        return root;
    }

    public static void printTree(DSNode root){
        if(root==null){
            return;
        }
        printTree(root.left);
        System.out.println(root.data);
        printTree(root.right);
    }

    public static void inOrderTraverse(DSNode root){
        if(root ==null){
            return;
        }
        inOrderTraverse(root.left);
        System.out.println(root.data);
        inOrderTraverse(root.right);

    }

    public static void preOrderTraverse(DSNode root){
        if(root ==null){
            return;
        }
        System.out.println(root.data);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);

    }


    public static void postOrderTraverse(DSNode root){
        if(root ==null){
            return;
        }
        postOrderTraverse(root.left);
        postOrderTraverse(root.right);
        System.out.println(root.data);
    }

    public static int heightOfBT(DSNode root){
        if(root == null){
            return 0;
        }

        return Math.max(heightOfBT(root.left), heightOfBT(root.right))+1;
    }

    public static int sizeOfBT(DSNode root){
        if(root == null){
            return 0;
        }

        return sizeOfBT(root.left) + sizeOfBT(root.right)+1;
    }

    public static int maxOfBT(DSNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        return Math.max(root.data, Math.max(maxOfBT(root.left), maxOfBT(root.right)));
    }

    public static int minOfBT(DSNode root){
        if(root == null){
            return Integer.MAX_VALUE;
        }

        return Math.min(root.data, Math.min(minOfBT(root.left), minOfBT(root.right)));
    }

    /**
     * complexity is n^2
     * @param root
     */
    public static void levelOrderTraversal(DSNode root){
        int height = heightOfBT(root);
        for(int level = 1; level<=height; level++ ){
            printLevel(root, level);
            System.out.println("");
        }
    }

    //using queue, complexity can be reduced to O(n)
    public static void levelOrderTraversalOptimized(DSNode root){

    }




    private static void printLevel(DSNode root, int level){
        if(root==null){
            return;
        }
        if(level==1){
            System.out.print(root.data +", ");
        }else if(level>1){
            printLevel(root.left, level-1);
            printLevel(root.right, level-1);
        }

    }

    public static void main(String[] args){
        DSNode root = createTree();

        System.out.println("Size of tree.."+ sizeOfBT(root));
        System.out.println("max node of tree.."+ maxOfBT(root));
        System.out.println("min node of tree.."+ minOfBT(root));
        System.out.println("Height of tree.."+ heightOfBT(root));
        System.out.println("Level order traversal..");
        levelOrderTraversal(root);
        System.out.println("Level order traversal.. END");

//        System.out.println("Printing inOrder...");
//        inOrderTraverse(root);
//        System.out.println("Printing preOrder...");
//        preOrderTraverse(root);
//        System.out.println("Printing postOrder...");
//        postOrderTraverse(root);
    }

}


