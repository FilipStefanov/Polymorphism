public class Main {
    public static void main(String[] args) {

        getInstanceOfLong("String");
    }

    private static void getInstanceOfLong(Object value) {

        System.out.println(value instanceof String);
    }
}
