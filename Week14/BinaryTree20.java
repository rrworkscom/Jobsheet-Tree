package Week14;

public class BinaryTree20 {

    Node20 root;

    public BinaryTree20() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Student20 data) {
        if (isEmpty()) {
            root = new Node20(data);
        } else {
            Node20 current = root;
            while (true) {
                if (data.ipk < current.data.ipk) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node20(data);
                        break;
                    }
                } else if (data.ipk > current.data.ipk) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node20(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
}