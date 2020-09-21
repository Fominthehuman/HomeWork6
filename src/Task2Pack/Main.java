package Task2Pack;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        Collection orangeBox = Box.createOrangeBox();
        Collection appleBox = Box.createAppleBox();

        System.out.println("Коробка с апельсинами");
        for (Object o : orangeBox) {
            System.out.println(o);
        }
        Box.getWeight(orangeBox);

        System.out.println("\nКоробка с яблоками");
        for (Object o : appleBox) {
            System.out.println(o);
        }

        Box.getWeight(appleBox);

    }

}
