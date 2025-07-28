package String;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);

        // methods :

        // // // 1. append() :
        // str.append("Java");
        // System.out.println(str);

        // // // 2. delete(),deleteCharAt() :
        // str.delete(0, 2);
        // System.out.println(str);
        // str.deleteCharAt(5);
        // System.out.println(str);

        // // 3. insert(index,char) :
        // str.insert(5, "v");
        // System.out.println(str);

        // 1. append(): Concatenates the given argument to the end of the StringBuilder. 
        // 2. insert(): Inserts a string or other data type at a specified position.
        // 3. delete(): Removes characters within a specified range.
        // 4. replace(): Replaces a substring with another string.
        // 5. reverse(): Reverses the sequence of characters.
        // 6. toString(): Converts the StringBuilder content back to a String object.

        str.append(" World"); // Appends " World"
        System.out.println(str);
        str.insert(6, "Java "); // Inserts "Java " at index 6
        System.out.println(str);
        str.delete(0, 6); // Deletes "Hello"
        System.out.println(str);
        str.replace(0, 4, "Greetings"); // Replaces "Java" with "Greetings"
        System.out.println(str);
        String finalString = str.toString(); // Converts to String
        System.out.println(finalString);
    }
}
