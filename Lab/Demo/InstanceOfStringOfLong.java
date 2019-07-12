package Lab.Demo;

public class InstanceOfStringOfLong {
    public static void main(String[] args) {

        getInstanceOfLong("String");
    }

    private static void getInstanceOfLong(Object value) {

        System.out.println(value instanceof String);
    }
}
