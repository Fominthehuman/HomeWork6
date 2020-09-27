package Task6Part2Pack;

public class Main {
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        appleBox1.add(apple1).add(apple2);
        appleBox2.add(apple3).add(apple4).add(apple5);
        appleBox1.compare(appleBox2);
        System.out.println(appleBox2.getWeight());
        System.out.println(appleBox1.getWeight());

        appleBox2.mergeToBox(appleBox1);

        System.out.println(appleBox2.getWeight());
        System.out.println(appleBox1.getWeight());

    }
}
