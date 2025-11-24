package Programs;


public class stringReverser {

    public static String reverseStringPreservingSpaces(String str) {
        char[] charArray = str.toCharArray();
        char[] result = new char[charArray.length];

        // Store space positions in the result array
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        int j = charArray.length - 1; // Pointer for the original string (from end)
        // Fill the result array with reversed non-space characters
        for (int i = 0; i < charArray.length; i++) { // Pointer for the result array (from start)
            if (charArray[i] != ' ') { // If current character in original is not a space
                // Find the next non-space character from the end of the original string
                while (j >= 0 && charArray[j] == ' ') {
                    j--;
                }
                if (j >= 0) { // If a non-space character is found
                    result[i] = charArray[j];
                    j--;
                }
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String original = "internship at geeks for geeks";
        String reversed = reverseStringPreservingSpaces(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed); // Expected: skee g rof skeeg ta pihsnretni
    }
}
