// 1. Basic Node Structure
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

// 2. Custom Circular Queue using Array (No built-in Java collections)
class ArrayQueue {
    Node[] queue;
    int front, rear, size, capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new Node[capacity];
        this.front = 0;
        this.size = 0;
        this.rear = capacity - 1;
    }

    void enqueue(Node item) {
        if (size == capacity) return; // Queue full
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    Node dequeue() {
        if (size == 0) return null; // Queue empty
        Node item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    boolean isEmpty() {
        return (size == 0);
    }
}

// 3. Binary Tree Implementation
public class BinaryTree {
    Node root;

    // INSERTION: Uses Level-Order to find the first empty spot
    void insert(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }

        ArrayQueue q = new ArrayQueue(100);
        q.enqueue(root);

        while (!q.isEmpty()) {
            Node temp = q.dequeue();

            if (temp.left == null) {
                temp.left = new Node(data);
                return;
            } else {
                q.enqueue(temp.left);
            }

            if (temp.right == null) {
                temp.right = new Node(data);
                return;
            } else {
                q.enqueue(temp.right);
            }
        }
    }

    // DELETION: Replace target with deepest rightmost node
    void delete(int key) {
        if (root == null) return;

        // Case for tree with only one node
        if (root.left == null && root.right == null) {
            if (root.data == key) root = null;
            return;
        }

        ArrayQueue q = new ArrayQueue(100);
        q.enqueue(root);

        Node targetNode = null;
        Node lastNode = null;

        // Traverse to find the target node and the deepest node
        while (!q.isEmpty()) {
            lastNode = q.dequeue();
            if (lastNode.data == key) {
                targetNode = lastNode;
            }
            if (lastNode.left != null) q.enqueue(lastNode.left);
            if (lastNode.right != null) q.enqueue(lastNode.right);
        }

        if (targetNode != null) {
            int x = lastNode.data; // Value of deepest node
            removeDeepest(root, lastNode); // Remove the deepest leaf
            targetNode.data = x; // Overwrite target node with deepest node's value
        }
    }

    // Helper to remove the deepest node reference
    void removeDeepest(Node root, Node dNode) {
        ArrayQueue q = new ArrayQueue(100);
        q.enqueue(root);

        while (!q.isEmpty()) {
            Node temp = q.dequeue();
            if (temp == dNode) {
                root = null;
                return;
            }
            if (temp.right != null) {
                if (temp.right == dNode) {
                    temp.right = null;
                    return;
                } else q.enqueue(temp.right);
            }
            if (temp.left != null) {
                if (temp.left == dNode) {
                    temp.left = null;
                    return;
                } else q.enqueue(temp.left);
            }
        }
    }

    // In-order traversal to display the tree (Left, Root, Right)
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // --- MAIN FUNCTION ---
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Testing Insertion
        System.out.println("Inserting: 10, 20, 30, 40, 50");
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);

        System.out.print("In-order after insertion: ");
        tree.inorder(tree.root);
        System.out.println("\n");

        // Testing Deletion
        int keyToDelete = 20;
        System.out.println("Deleting node: " + keyToDelete);
        tree.delete(keyToDelete);

        System.out.print("In-order after deletion: ");
        tree.inorder(tree.root);
        System.out.println();
    }
}