public class StringBuilderEx {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hi");
        System.out.println("After append: " + stringBuilder);
        stringBuilder.append(" Tamanna");
        System.out.println("After append: " + stringBuilder);
        stringBuilder.insert(6, "Great ");
        System.out.println("After insert: " + stringBuilder);
        stringBuilder.delete(5, 10);
        System.out.println("After delete: " + stringBuilder);
        stringBuilder.reverse();
        System.out.println("After reverse: " + stringBuilder);
    }
}