/**
 * @author David Ogunbanjo
 */

public class Main {
    public static void main(String[] args) {
        intLinkedList li = new intLinkedList();
        li.addToEnd(23);
        li.addToEnd(24);
        li.addToEnd(25);
        li.addToEnd(26);
        li.addToEnd(27);
        li.addToEnd(28);
        li.addToEnd(29);
        li.addToEnd(30);
        System.out.println(li);
        li.remove(26);
        System.out.println(li);

    }
}