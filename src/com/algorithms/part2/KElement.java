package com.algorithms.part2;

public class KElement {

    public static void main(String[] args) {
        //Node n = new Node(5);
        //n.append(2);
    }



    public static Object kElem(int n) {



        return new Integer(5);
    }

    class Node {
        Node next = null;
        int data;

        public Node(int d) {
            data = d;
        }

        void append(int d) {
            Node end = new Node(d);
            Node n = this;
            while (n.next != null) {
                n = n.next;
            }
            n.next = end;
        }
    }

}
