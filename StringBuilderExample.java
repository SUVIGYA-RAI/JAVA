public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); // Output: Hello World

        sb.insert(5, ",");
        System.out.println(sb); // Output: Hello, World

        sb.replace(6, 11, "Java");
        System.out.println(sb); // Output: Hello, Java

        sb.reverse();
        System.out.println(sb); // Output: avaJ ,olleH
    }
}
