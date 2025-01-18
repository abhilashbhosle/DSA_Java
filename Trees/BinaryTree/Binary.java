
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Binary {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class rootPair {

        Node node;
        int state;

        rootPair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    // displaying the tree
    public static void display(Node node) {
        if (node == null) {
            return;
        }
        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += "->" + node.data + "<-";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);
        display(node.left);
        display(node.right);
    }

    // size of a tree
    public static int size(Node node) {
        if (node == null) {
            return 0;
        }
        int ls = size(node.left);
        int rs = size(node.right);
        int ts = ls + rs + 1;
        return ts;
    }

    // sum of a tree
    public static int sum(Node node) {
        if (node == null) {
            return 0;
        }
        int lsum = sum(node.left);
        int rsum = sum(node.right);
        int tsum = lsum + rsum + node.data;
        return tsum;
    }

    // maximum number in a tree
    public static int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int lmax = max(node.left);
        int rmax = max(node.right);
        int tmax = Math.max(lmax, rmax);
        tmax = Math.max(tmax, node.data);
        return tmax;
    }

    // height of a binary tree
    public static int height(Node node) {
        if (node == null) {
            return -1;   // return -1 if in case of edges or 0 in case of nodes.
        }
        int lh = height(node.left);
        int rh = height(node.right);
        int th = Math.max(rh, lh) + 1;
        return th;
    }

    // traversal in binary tree
    public static void traversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data + "pre order");
        traversal(node.left);
        System.out.println(node.data + "in order");
        traversal(node.right);
        System.out.println(node.data + "post order");
    }

    // level order traversal
    public static void lot(Node node) {
        if (node == null) {
            return;
        }
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                node = q.remove();
                System.out.print(node.data + " ");
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            System.out.println("");
        }
    }

    // find whether value is present or not
    public static boolean find(Node node, int num) {
        if (node == null) {
            return false;
        }
        if (node.data == num) {
            return true;
        }
        boolean ls = find(node.left, num);
        if (ls) {
            return true;
        }
        boolean rs = find(node.right, num);
        if (rs) {
            return true;
        }
        return false;
    }
    public static boolean findPath(Node node, int num, ArrayList<Integer> list) {
        if (node == null) {
            return false;
        }
        if (node.data == num) {
            list.add(node.data);
            return true;
        }
        boolean ls = findPath(node.left, num, list);

        if (ls) {
            list.add(node.data);
            return true;
        }
        boolean rs = findPath(node.right, num, list);
        if (rs) {
            list.add(node.data);
            return true;
        }
        return false;
    }

    // print k levels down
    public static void printKLevelsDown(Node node, int k) {
        if (node == null || k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(node.data);
            return;
        }
        printKLevelsDown(node.left, k - 1);
        printKLevelsDown(node.right, k - 1);
    }

    // find root path
    public static boolean findNodePath(Node node, int targetNode, ArrayList<Node> list) {
        if (node == null) {
            return false;
        }
        if (node.data == targetNode) {
            list.add(node);
            return true;
        }
        boolean ls = findNodePath(node.left, targetNode, list);

        if (ls) {
            list.add(node);
            return true;
        }
        boolean rs = findNodePath(node.right, targetNode, list);
        if (rs) {
            list.add(node);
            return true;
        }
        return false;
    }

    // print k levels down path
    public static void printKLevelsDownPath(Node node, int k, Node blocker) {
        if (node == null || k < 0 || node == blocker) {
            return;
        }
        if (k == 0) {
            System.out.println(node.data);
            return;
        }
        printKLevelsDownPath(node.left, k - 1, blocker);
        printKLevelsDownPath(node.right, k - 1, blocker);
    }

    // print k levels far
    public static void printKLevelsFar(Node node, int target, int k) {
        ArrayList<Node> list = new ArrayList<>();
        findNodePath(node, target, list);
        for (int i = 0; i < list.size(); i++) {
            printKLevelsDownPath(list.get(i), k - i, i == 0 ? null : list.get(i - 1));
        }
    }

    // path to leaf from root
    public static void pathToLeaf(Node node, String path, int sum, int low, int high) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            sum = sum + node.data;
            if (sum >= low && sum <= high) {
                System.out.println(path + node.data);
            }
            return;
        }
        pathToLeaf(node.left, path + node.data + " ", sum + node.data, low, high);
        pathToLeaf(node.right, path + node.data + " ", sum + node.data, low, high);
    }

    // create leftcloned tree
    public static Node transFormToLeftClone(Node node) {
        if (node == null) {
            return null;
        }

        Node lcr = transFormToLeftClone(node.left);
        Node rcr = transFormToLeftClone(node.right);

        Node newNode = new Node(node.data, lcr, null);
        node.left = newNode;
        node.right = rcr;
        return node;
    }

    // transform back to normal from left cloned
    public static Node transFormBackFromLeftClone(Node node) {
        if (node == null) {
            return null;
        }
        node=node.left.left;
        transFormBackFromLeftClone(node.left);
        transFormBackFromLeftClone(node.right);
        // Node newNode = new Node(node.data, lcr, null);
        return node;
    }

    // remove all the leaves
    public static Node removeLeaves(Node node){
        if(node==null){
            return null;
        }
        if(node.left==null && node.right==null){
            return null;
        }
        node.left=removeLeaves(node.left);
        node.right=removeLeaves(node.right);
        return node;
    }

    // diameter of a binary tree
    public static class DiaPair{
        int ht;
        int dia;
    }
    public static DiaPair diameter2(Node node){
        if(node==null){
            DiaPair bp=new DiaPair();
            bp.ht=-1;
            bp.dia=0;
            return bp;
        }
        DiaPair lp=diameter2(node.left);
        DiaPair rp=diameter2(node.right);
        DiaPair mp=new DiaPair();
        mp.ht=Math.max(lp.ht, rp.ht)+1;
        int fes=lp.ht+rp.ht+2;
        mp.dia=Math.max(fes, Math.max(lp.dia, rp.dia));
        return mp;
    }

    // tilt of a binary tree
    static int tilt=0;
    public static int tilt(Node node){
        if(node==null){
            return 0;
        }
        int ls=tilt(node.left);
        int rs=tilt(node.right);
        int abs=Math.abs(ls-rs);
        tilt+=abs;
        int ts=ls+rs+node.data;
        return ts;
    }
    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root = new Node(arr[0], null, null);
        rootPair rtp = new rootPair(root, 1);
        Stack<rootPair> st = new Stack<>();
        st.push(rtp);
        int idx = 0;
        while (!st.isEmpty()) {
            rootPair top = st.peek();
            if (top.state == 1) {
                // add to the left side
                idx++;
                if (arr[idx] != null) {
                    Node node = new Node(arr[idx], null, null);
                    top.node.left = node;
                    rootPair lp = new rootPair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) {
                // add to the right side
                idx++;
                if (arr[idx] != null) {
                    Node node = new Node(arr[idx], null, null);
                    top.node.right = node;
                    rootPair rp = new rootPair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }
                top.state++;
            } else {
                st.pop();
            }
        }
        // display(root);
        // System.out.println(size(root));
        // System.out.println(sum(root));
        // System.out.println(max(root));
        // System.out.println(height(root));
        // traversal(root);
        // lot(root);
        // System.out.println(find(root, 75));
        // ArrayList<Integer> list = new ArrayList<>();
        // if (findPath(root, 70, list)) {
        //     System.out.println(list);
        // }
        // printKLevelsDown(root, 2);
        // printKLevelsFar(root, 75, 3);
        // pathToLeaf(root, "", 0, 50, 87);
        // transFormToLeftClone(root);
        // transFormBackFromLeftClone(root);
        // removeLeaves(root);
        // display(root);
        //  DiaPair p=diameter2(root);
        //  System.out.println(p.dia);
        System.out.println(tilt(root));

    }
}
