
public class Tester {
    Node head;
    int length;

    private static class Node {
        int exponents;
        int coefficient;
        Node next;
        public Node(int coef, int pow) {
        	coefficient = coef;
            exponents = pow;
            
        }
    }
    public void addLast(int c, int p) {
        Node node = new Node(c, p);
        if (head == null) {
            head = node;
            length++;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            length++;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println();
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(" [" + temp.coefficient + "," + temp.exponents + "] ->");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static Tester AddingTwoPolynomials(Tester n1, Tester n2) {
        Tester poly = new Tester();
        int i = 0, j = 0;
        int n = n1.length;
        int m = n2.length;
        Node p1 = n1.head;
        Node p2 = n2.head;
        while (i < n && j < m) {
            if (p1.exponents == p2.exponents) {
                int sum = p1.coefficient + p2.coefficient;
                poly.addLast(sum, p1.exponents);
                p1 = p1.next;
                p2 = p2.next;
                i++;
                j++;
            } else if (p1.exponents > p2.exponents) {
                int sum = p1.coefficient;
                poly.addLast(sum, p1.exponents);
                i++;
                p1 = p1.next;
            } else if (p1.exponents <p2.exponents) {

                int sum = p2.coefficient;
                poly.addLast(sum, p2.exponents);
                j++;
                p2 = p2.next;
            }

        }

        while (i < n) {
            int sum = p1.coefficient;
            poly.addLast(sum, p1.exponents);
            i++;
            p1 = p1.next;
        }
        while (j < m) {
            int sum = p2.coefficient;
            poly.addLast(sum, p2.exponents);
            j++;
            p2 = p2.next;
        }

        return poly;
    }

    public static void main(String[] args) {
        Tester t = new Tester();

        t.addLast(2, 3);
        t.addLast(1, 2);
        t.addLast(1, 1);
        t.addLast(7, 0);

        Tester t2 = new Tester();

        t2.addLast(5, 2);
//        t2.addLast(3, 1);
        t2.addLast(2, 0);

        Tester t3 = AddingTwoPolynomials(t, t2);
        t3.display();

    }

}
