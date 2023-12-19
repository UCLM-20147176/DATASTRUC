class BTClass {
    protected BTNode root;

    public BTClass() {
        this.root = null;
    }

    public BTClass(BTNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void inOrderTraversal(BTNode node) {
        if (node != null) {
            inOrderTraversal(node.tlink);
            System.out.print(node.info + " ");
            inOrderTraversal(node.rlink);
        }
    }

    public void postOrderTraversal(BTNode node) {
        if (node != null) {
            postOrderTraversal(node.tlink);
            postOrderTraversal(node.rlink);
            System.out.print(node.info + " ");
        }
    }

    public void preOrderTraversal(BTNode node) {
        if (node != null) {
            System.out.print(node.info + " ");
            preOrderTraversal(node.tlink);
            preOrderTraversal(node.rlink);
        }
    }

    public int height(BTNode node) {
        if (node == null)
            return 0;

        int leftHeight = height(node.tlink);
        int rightHeight = height(node.rlink);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    private int nodeCount(BTNode node) {
        if (node == null)
            return 0;

        return 1 + nodeCount(node.tlink) + nodeCount(node.rlink);
    }

    public int getNodeCount() {
        return nodeCount(root);
    }
}
