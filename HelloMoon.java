public class HelloMoon {
    public static void main(String[] args) {
        String phrase = "Hello Moon";

        // 1. charAt()
        char thirdChar = phrase.charAt(2);  // 0-based index
        System.out.println("Character at index 2: " + thirdChar);  // 'l'

        // 2. indexOf()
        int indexOfM = phrase.indexOf('M');
        System.out.println("Index of 'M': " + indexOfM);  // 6

        // 3. toUpperCase()
        String upper = phrase.toUpperCase();
        System.out.println("Uppercase: " + upper);  // "HELLO MOON"

        // 4. toLowerCase()
        String lower = phrase.toLowerCase();
        System.out.println("Lowercase: " + lower);  // "hello moon"

        // 5. substring(3, 6)
        String sub = phrase.substring(3, 6);  // characters at index 3,4,5
        System.out.println("Substring (3,6): " + sub);  // "lo "

        // 6. (3 - phrase.charAt('x')) — Interpreted as subtraction using index
        // First, find the index of 'x' (will be -1 since 'x' is not in "Hello Moon")
        int indexOfX = phrase.indexOf('x');
        System.out.println("Index of 'x': " + indexOfX);  // -1

        // Do the subtraction: 3 - (-1)
        int result = 3 - indexOfX;
        System.out.println("3 - indexOf('x') = " + result);  // 4

        // 7. Check if "yes" is in the phrase
        int yes = phrase.indexOf("yes");  // will return -1 (not found)
        System.out.println("In yes is " + yes);  // Output: "In yes is -1"
    }
}