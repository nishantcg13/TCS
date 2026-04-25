public class StringMethods {
    public static void main(String[] args) {
        String str1 = new String("Ashish");
        String str2 = new String("Ashish");
        String str3 = str2;
        System.out.println(str1 == str2);
        System.out.println(str3 == str2);
    }
}
