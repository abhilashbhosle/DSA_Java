
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class Generic {

    private static class Node {

        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node() {

        }

        Node(int data) {
            this.data = data;
        }

    }

    private static void display(Node node) {
        String str = node.data + "->";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);
        for (Node child : node.children) {
            display(child);
        }
    }

    private static int size(Node node) {
        int s = 0;
        for (Node child : node.children) {
            int cs = size(child);
            s = s + cs;
        }
        s = s + 1;
        return s;
    }

    private static int maximum(Node node) {
        int max = Integer.MIN_VALUE;
        for (Node child : node.children) {
            int m = maximum(child);
            if (m > max) {
                max = m;
            }
        }
        max = Math.max(node.data, max);
        return max;
    }

    private static int height(Node node) {
        int h = -1;
        for (Node child : node.children) {
            int ch = height(child);
            h = Math.max(ch, h);
        }
        h += 1;
        return h;
    }

    private static void traversal(Node node) {
        System.out.println("Node Pre " + node.data);
        for (Node child : node.children) {
            System.out.println("Edge Pre" + node.data + "--" + child.data);
            traversal(child);
            System.out.println("Edge Post" + node.data + "--" + child.data);
        }
        System.out.println("Node Post" + node.data);
    }

    private static void levelOrder(Node node) {
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while (!q.isEmpty()) {
            node = q.remove();
            System.out.println(node.data);
            for (Node child : node.children) {
                q.add(child);
            }
        }
        System.out.println(".");
    }

    private static void levelOrderLineWise(Node node) {
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        Queue<Node> cq = new ArrayDeque<>();
        while (!q.isEmpty()) {
            node = q.remove();
            System.out.print(node.data + " ");
            for (Node child : node.children) {
                cq.add(child);
            }
            if (q.isEmpty()) {
                q = cq;
                cq = new ArrayDeque<>();
                System.out.println("");
            }
        }
    }

    private static void levelOrderLineWise2(Node node) {
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        q.add(new Node(-1));
        while (!q.isEmpty()) {
            node = q.remove();
            if (node.data != -1) {
                System.out.print(node.data + " ");
                for (Node child : node.children) {
                    q.add(child);
                }
            } else {
                if (!q.isEmpty()) {
                    q.add(new Node(-1));
                    System.out.println("");
                }
            }

        }
    }

    private static void levelOrderLineWise3(Node node) {
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                node = q.remove();
                System.out.print(node.data + " ");
                for (Node child : node.children) {
                    q.add(child);
                }
            }
            System.out.println("");
        }
    }

    private static class Pair {

        private Node node;
        private int level;

        Pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    private static void levelOrderLineWise4(Node node) {
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(node, 1));
        int level = 1;
        while (!q.isEmpty()) {
            Pair p = q.remove();
            if (p.level > level) {
                level = p.level;
                System.out.println("");
            }
            System.out.print(p.node.data + " ");
            for (Node child : p.node.children) {
                Pair cp = new Pair(child, p.level + 1);
                q.add(cp);
            }
        }
    }

    private static void levelOrderLineWiseZigZag(Node node) {
        Stack<Node> ms = new Stack<>(); // main stack
        ms.push(node);
        Stack<Node> cs = new Stack<>(); //child stack;
        int level = 1;
        while (!ms.isEmpty()) {
            node = ms.pop();
            System.out.print(node.data + " ");
            if (level % 2 == 1) {
                for (int i = 0; i < node.children.size(); i++) {
                    Node child = node.children.get(i);
                    cs.push(child);
                }
            } else {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    Node child = node.children.get(i);
                    cs.push(child);
                }
            }
            if (ms.isEmpty()) {
                ms = cs;
                cs = new Stack<>();
                level++;
                System.out.println("");
            }
        }
    }

    private static void mirror(Node node) {
        for (Node child : node.children) {
            mirror(child);
        }
        Collections.reverse(node.children);
    }

    private static void removeLeaves(Node node) {
        for (int i = node.children.size() - 1; i >= 0; i--) {
            Node child = node.children.get(i);
            if (child.children.isEmpty()) {
                node.children.remove(child);
            }
        }
        for (Node child : node.children) {
            removeLeaves(child);
        }
    }

    // Linearize the tree
    private static void linearizeTree(Node node) {
        for (Node child : node.children) {
            linearizeTree(child);
        }
        while (node.children.size() > 1) {
            Node removeLast = node.children.remove(node.children.size() - 1);
            Node getCurrentLast = node.children.get(node.children.size() - 1);
            Node getTailOfLast = getTail(getCurrentLast);
            getTailOfLast.children.add(removeLast);
        }
    }

    private static Node getTail(Node node) {
        while (node.children.size() == 1) {
            node = node.children.get(0);
        }
        return node;
    }

    // Find in Generic Tree
    private static boolean findIntree(Node node, int data) {
        if (node.data == data) {
            return true;
        }
        for (Node child : node.children) {
            boolean fc = findIntree(child, data);
            if (fc) {
                return true;
            }
        }
        return false;
    }
    // Node to Root Path

    private static ArrayList<Integer> nodeToRootPath(Node node, int data) {
        if (node.data == data) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node.data);
            return list;
        }
        for (Node child : node.children) {
            ArrayList<Integer> ptc = nodeToRootPath(child, data);
            if (!ptc.isEmpty()) {
                ptc.add(node.data);
                return ptc;
            }
        }
        return new ArrayList<>();
    }

    // Lowest Comon Ancestor
    private static int LowestCommonAncestor(Node node, int d1, int d2) {
        ArrayList<Integer> p1 = nodeToRootPath(node, d1);
        ArrayList<Integer> p2 = nodeToRootPath(node, d2);
        int i = p1.size() - 1;
        int j = p2.size() - 1;
        while (i >= 0 && j >= 0 && p1.get(i) == p2.get(j)) {
            i--;
            j--;
        }
        i++;
        j++;
        return p1.get(i);
    }

    // Distance between 2 Nodes
    private static int DB2N(Node node, int n1, int n2) {
        ArrayList<Integer> p1 = nodeToRootPath(node, n1);
        ArrayList<Integer> p2 = nodeToRootPath(node, n2);
        int i = p1.size() - 1;
        int j = p2.size() - 1;
        while (i >= 0 && j >= 0 && p1.get(i) == p2.get(j)) {
            i--;
            j--;
        }
        i++;
        j++;
        return i + j;
    }

    // Check whether two roots are similar
    private static boolean areSimilar(Node node1, Node node2) {
        if (node1.children.size() != node2.children.size()) {
            return false;
        }
        for (int i = 0; i < node1.children.size(); i++) {
            Node child1 = node1.children.get(i);
            Node child2 = node2.children.get(i);
            if (areSimilar(child1, child2) == false) {
                return false;
            }
        }
        return true;
    }

	// Check whether two roots are mirror images or not
	private static boolean areMirror(Node node1,Node node2){
		if(node1.children.size()!=node2.children.size()){
			return false;
		}
		for(int i=0;i<node1.children.size();i++){
			int j=node2.children.size()-1-i;
			if(areMirror(node1.children.get(i), node2.children.get(i))==false){
				return false;
			}
		}
		return true;
	}

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node root = null;
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];
                if (!st.isEmpty()) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }
                st.push(t);
            }
        }
        int[] arr1 = {100, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 900, -1, -1, 46, 100, -1, -1, -1};
        Node root1 = null;
        Stack<Node> st1 = new Stack<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == -1) {
                st1.pop();
            } else {
                Node t = new Node();
                t.data = arr1[i];
                if (!st1.isEmpty()) {
                    st1.peek().children.add(t);
                } else {
                    root1 = t;
                }
                st1.push(t);
            }
        }
        display(root);
        // System.out.println(size(root));
        // System.out.println(maximum(root));
        // System.out.println(height(root));
        // traversal(root);
        // levelOrder(root);
        // levelOrderLineWise(root);
        // levelOrderLineWise4(root);
        // levelOrderLineWiseZigZag(root);
        // mirror(root);
        // System.out.println(".........");
        // linearizeTree(root);
        // display(root);
        // System.out.println(findIntree(root, 110));
        // System.out.println(nodeToRootPath(root, 110));
        // System.out.println(LowestCommonAncestor(root, 70, 80));
        // System.out.println(DB2N(root, 70, 110));
        // System.out.println(areSimilar(root, root1));
        System.out.println(areMirror(root, root1));
    }
}
