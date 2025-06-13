public class strings {
    public static void main(String[] args) {
        String a = "Hello world";
        String b = "Hello world";
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.length());
        System.out.println(a.contains("Hello"));
        System.out.println(a.equals(b));
        System.out.println(a.charAt(0));
        System.out.println(a.substring(0,3));
        System.out.println(a.replace("l","L"));
        System.out.println(a + " " + b);
         // String nullString = null meaning nullString => nothing
        // String emptyString = "" meaning emptryString => memory address => nothing is there
        String emptyString = "";
//        String nullString = null;
        System.out.println(emptyString.isEmpty());
    }
}
