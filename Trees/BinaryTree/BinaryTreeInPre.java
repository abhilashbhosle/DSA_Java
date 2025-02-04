
public class BinaryTreeInPre {

    public static class Node {

        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        int[] preorder = {0, 1, 3, 7, 8, 4, 9, 10, 2, 5, 11, 6};
        int[] inorder = {7, 3, 8, 1, 9, 4, 10, 0, 11, 5, 2, 6};
        Node ans = buildTree(preorder, inorder, 0, preorder.length, 0, inorder.length);
    }

    public static Node buildTree(int[] preorder, int[] inorder, int psi, int pei, int isi, int iei) {
        if (isi > iei) {
            return null;
        }
        int idx = isi;
        while (inorder[isi] != preorder[psi]) {
            idx++;
        }
        int li = idx - isi;
        Node node = new Node(preorder[psi]);
        node.left = buildTree(preorder, inorder, psi + 1, psi + li, isi, idx - 1);
        node.right = buildTree(preorder, inorder, psi + li + 1, pei, idx + 1, iei);
        return node;
    }

}
