
import java.util.ArrayDeque;
import java.util.ArrayList;
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
       private  Node node;
        private int level;
        Pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    private static void levelOrderLineWise4(Node node) {
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(node,1));
		int level=1;
		while(!q.isEmpty()){
			Pair p=q.remove();
			if(p.level>level){
				level=p.level;
			   System.out.println("");
			}
			System.out.print(p.node.data + " ");
			for(Node child : p.node.children){
				Pair cp=new Pair(child, p.level+1);
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
        // display(root);
        // System.out.println(size(root));
        // System.out.println(maximum(root));
        // System.out.println(height(root));
        // traversal(root);
        // levelOrder(root);
        levelOrderLineWise(root);
        levelOrderLineWise4(root);
        // levelOrderLineWiseZigZag(root);
    }
}
