package Task6Part1Pack;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("ArrayList 1");
        arrayList.add("ArrayList 2");
        arrayList.add("ArrayList 3");
        System.out.println("Размер массива: " + arrayList.size());
        arrayList.print();
        arrayList.remove(0);
        System.out.println(arrayList.get(0));
        arrayList.print();
        arrayList.clear();
        arrayList.print();
        System.out.println("\n");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("LinkedList 1");
        linkedList.add("LinkedList 2");
        linkedList.add("LinkedList 3");
        System.out.println("Размер листа-коллекции: " + linkedList.size());
        //linkedList.printList();
        linkedList.remove(2);
        System.out.println(linkedList.get(2));
        linkedList.clear();



    }
}
