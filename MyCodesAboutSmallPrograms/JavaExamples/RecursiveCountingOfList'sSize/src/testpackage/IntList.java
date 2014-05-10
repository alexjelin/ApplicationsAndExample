package testpackage;

public class IntList extends List {

    private ListNode firstNode = getFirstNode();
    private ListNode lastNode = getLastNode();
    private int counter = 0;
    private ListNode oldNode;
    private int result = 0;

    public IntList(String listName) {
        super(listName);
        this.firstNode = this.lastNode = new ListNode(0);
    }

    public int totalList() {
        if (counter == 0) {
            this.oldNode = firstNode;
        } else {
            if (oldNode != lastNode) {
                result += (int) oldNode.data;
                oldNode = this.oldNode.getNext();
                this.totalList();
            } else {
            }
        }
        counter++;
        return result;
    }

    public boolean contains(Object someObject) {
        boolean cond = false;
        if (this.isEmpty()) {
            return cond;
        } else {
            if (counter == 0) {
                this.oldNode = firstNode;
            } else {
                if (oldNode != lastNode) {
                    if (oldNode.data == someObject) {
                        cond = true;
                    } else {
                        oldNode = this.oldNode.getNext();
                        this.totalList();
                    }
                } else {
                }
            }
            counter++;
            return cond;
        }
    }
}
