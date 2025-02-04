
public class BSTIn {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        int[] inorder = {9, 12, 14, 17, 19, 23, 50, 54, 67, 72, 76};
        Node node=constructBST(inorder, 0, inorder.length);
		
    }

    static Node constructBST(int[] inorder, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (ei + si) / 2;
        Node node = new Node(inorder[mid]);
        node.left = constructBST(inorder, si, mid - 1);
        node.right = constructBST(inorder, mid + 1, ei);
        return node;
    }
}
