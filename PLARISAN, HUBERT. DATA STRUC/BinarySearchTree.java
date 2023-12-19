class BinarySearchTree extends BTClass {

    public BinarySearchTree() {
        super();
    }

    public BinarySearchTree(BTNode root) {
        super(root);
    }
public boolean search(String key, BTNode node) {
        if (node == null)
            return false;

        int comparisonResult = key.compareTo(node.info);

        if (comparisonResult == 0)
            return true;
        else if (comparisonResult < 0)
            return search(key, node.tlink);
        else
            return search(key, node.rlink);
    }

    public boolean search(String key) {
        return search(key, root);
    }

 public BTNode insert(String key, BTNode node) {
        if (node == null)
            return new BTNode(null, key, null);

        int comparisonResult = key.compareTo(node.info);

        if (comparisonResult < 0)
            node.tlink = insert(key, node.tlink);
        else if (comparisonResult > 0)
            node.rlink = insert(key, node.rlink);

        return node;
    }

    public void insert(String key) {
        root = insert(key, root);
    }

  private BTNode delete(String key, BTNode node, Result result) {
        if (node == null) {
            result.message = "The name was not found";
            return null;
        }

        int comparisonResult = key.compareTo(node.info);

        if (comparisonResult < 0)
            node.tlink = delete(key, node.tlink, result);
        else if (comparisonResult > 0)
            node.rlink = delete(key, node.rlink, result);
        else {
            result.message = "The name was deleted";

            if (node.tlink == null)
                return node.rlink;
            else if (node.rlink == null)
                return node.tlink;

            node.info = minValue(node.rlink);
            node.rlink = delete(node.info, node.rlink, result);
        }

        return node;
    }
    private String minValue(BTNode node) {
        String minValue = node.info;
        while (node.tlink != null) {
            minValue = node.tlink.info;
            node = node.tlink;
        }
        return minValue;
    }

   public void delete(String key) {
        Result result = new Result();
        root = delete(key, root, result);
        System.out.println("Result: " + result.message);
    }
    public int leavesCount(BTNode node) {
        if (node == null)
            return 0;
        if (node.tlink == null && node.rlink == null)
            return 1;

        return leavesCount(node.tlink) + leavesCount(node.rlink);
    }

    public int leavesCount() {
        return leavesCount(root);
    }
    class Result {
    String message;

    public Result() {
        this.message = "";
    }
}
}
