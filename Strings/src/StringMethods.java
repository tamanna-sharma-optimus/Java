public class StringMethods {

    public static void main(String[] args) {
        String myString = "Hi Tamanna, How are you doing today";
        System.out.println("Original string: " + myString);
        System.out.println("Length of the string: " + myString.length());
        System.out.println("Uppercase: " + myString.toUpperCase());
        System.out.println("Lowercase: " + myString.toLowerCase());
        System.out.println("Capitalized: " + capitalizeString(myString));
        String substring = "l";
        System.out.println("Count of '" + substring + "' in the string: " + countOccurrences(myString, substring));
        String prefix = "Hi";
        System.out.println("Does the string start with '" + prefix + "'? " + myString.startsWith(prefix));
        String suffix = "Tamanna";
        System.out.println("Does the string end with '" + suffix + "'? " + myString.endsWith(suffix));
        String searchSubstring = "Tamanna";
        System.out.println("Index of '" + searchSubstring + "' in the string: " + myString.indexOf(searchSubstring));
        String newString = myString.replace("Tamanna", "Java");
        System.out.println("After replacement: " + newString);
        String[] words = myString.split(", ");
        System.out.print("Splitting into words: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
        String joinedString = String.join("-", words);
        System.out.println("Joining with '-' separator: " + joinedString);
    }
    public static String capitalizeString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
    public static int countOccurrences(String str, String substring) {
        if (str == null || str.isEmpty() || substring == null || substring.isEmpty()) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }
}