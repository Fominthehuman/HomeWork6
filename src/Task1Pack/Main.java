package Task1Pack;

public class Main {

    public static void main(String[] args) {

        ArrayRealisation myArrayList = new ArrayRealisation();
        myArrayList.add("ArrayList 1");
        myArrayList.add("ArrayList 2");
        myArrayList.add("ArrayList 3");
        myArrayList.print();
        myArrayList.remove(0);
        System.out.println(myArrayList.get(0));
        myArrayList.print();
        myArrayList.clear();
        System.out.println("И очистка...");
        myArrayList.print();

        LinkedRealisation myLinkedList = new LinkedRealisation();
        myLinkedList.add("list 1");
        myLinkedList.add("list 3");
        myLinkedList.add("list 5");
        myLinkedList.add("list 2");
        myLinkedList.add("list 4");
        System.out.println("Размер лист-коллекции " + myLinkedList.size());
        System.out.println(myLinkedList);

    }
}
