public class O6_UC5 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        if (args.length == 0) {
            result.append("World");
        } else {

            boolean first = true;
            for (String name : args) {
                if (!first) {
                    result.append(", ");
                }
                result.append(name);
                first = false;
            }
        }
        System.out.println("Hello, " + result.toString() + "!");
    }
}
