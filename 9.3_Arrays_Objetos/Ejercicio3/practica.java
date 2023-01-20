public class practica{
    public static void main(String[] args) {
        MyObject<String> object1 = new MyObject<>("Object one");
        MyObject<Integer> object2 = new MyObject<>(2);

        System.out.println("Object 1: " + object1.getValue());
        System.out.println("Object 2: " + object2.getValue());

        Pair <Integer,String> pair1 = new Pair<>(1, "Pair one");
        Pair <String,MyObject<Integer>> pair2 = new Pair<>("key two", new MyObject<>(2));

        System.out.println("Pair 1: " + pair1.getValue() + " " + pair1.getKey());
        System.out.println("Pair 2: " + pair2.getValue().getValue() + " " + pair2.getKey());
    }
}