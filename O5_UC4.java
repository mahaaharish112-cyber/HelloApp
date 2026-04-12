public class O5_UC4 {
    public static void main(String[] args) {

        String name;

        if (args.length > 0) {
            name = String.join(", ", args);
        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}