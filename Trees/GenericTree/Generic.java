
import java.util.ArrayList;
import java.util.Stack;

public class Generic {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
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
      int max=Integer.MIN_VALUE;
	  for(Node child:node.children){
		int m=maximum(child);
		if(m>max){
			max=m;
		}
	  }
	  max=Math.max(node.data, max);
	  return max;
    } 

	private static int height(Node node){
		int h=-1;
		for(Node child:node.children){
			int ch=height(child);
			h=Math.max(ch, h);
		}
		h+=1;
		return h;
	}

	private static void traversal(Node node){
		System.out.println("Node Pre "+node.data);
		for(Node child : node.children){
			System.out.println("Edge Pre"+node.data+"--"+child.data);
			traversal(child);
			System.out.println("Edge Post"+node.data+"--"+child.data);
		}
		System.out.println("Node Post"+node.data);
	}
	

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node root = null;
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
           
			if(arr[i]==-1){
				st.pop();
			}else{
				Node t=new Node();
				t.data=arr[i];
				if(!st.isEmpty()){
					st.peek().children.add(t);
				}else{
					root=t;
				}
				st.push(t);
			}
        }
        display(root);
        System.out.println(size(root));
        System.out.println(maximum(root));
		System.out.println(height(root));
		traversal(root); 
    }
}
