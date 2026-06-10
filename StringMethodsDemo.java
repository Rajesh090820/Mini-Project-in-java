public class StringMethodsDemo {
    public static void main(String[] args) {

        String str = "   Hello World   ";
        String trimmed = str.trim();
        System.out.println("Trimmed String: " + trimmed);

        char ch = trimmed.charAt(1);
        System.out.println("Character at index 1: " + ch);

        int pos = trimmed.indexOf("W");
        System.out.println("Index of 'W': " + pos);
    }
}