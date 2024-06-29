public class StringBufferEx {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hi");
        stringBuffer.append(" Tamanna");
        System.out.println("After append: " + stringBuffer);
        stringBuffer.insert(6, "Great ");
        System.out.println("After insert: " + stringBuffer);
        stringBuffer.delete(5, 10);
        System.out.println("After delete: " + stringBuffer);
        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer);
    }
}