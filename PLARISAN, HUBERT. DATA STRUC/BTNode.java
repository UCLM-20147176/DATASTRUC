class BTNode {
    String info;
    BTNode rlink, tlink;

    public BTNode() {
        this.info = "";
        this.rlink = null;
        this.tlink = null;
    }

    public BTNode(BTNode rlink, String info, BTNode tlink) {
        this.info = info;
        this.rlink = rlink;
        this.tlink = tlink;
    }
}



