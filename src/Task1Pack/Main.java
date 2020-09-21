package Task1Pack;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayRealisation myArrayList = new ArrayRealisation();
        myArrayList.add("ArrayList 1");
        myArrayList.add("ArrayList 2");
        myArrayList.add("ArrayList 3");
        myArrayList.print();
        System.out.println("Размер массива: " + myArrayList.size());
        myArrayList.remove(0);
        System.out.println(myArrayList.get(0));
        myArrayList.print();
        myArrayList.clear();
        System.out.println("И очистка...");
        myArrayList.print();
        System.out.println("\n");

        LinkedList<String> myLinkedList = new LinkedList();
        myLinkedList.add("list 1");
        myLinkedList.add("list 3");
        myLinkedList.add("list 5");
        System.out.println(myLinkedList);
        System.out.println("Размер лист-коллекции " + myLinkedList.size());
        System.out.println(myLinkedList.get(1));
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        myLinkedList.clear();
        System.out.println(myLinkedList);
    }
}
