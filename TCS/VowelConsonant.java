public class VowelConsonant {
    public static void main(String[] args) {
        String str = "Nishant";

        str = str.toLowerCase();
        int vowels = 0;
        int consonant = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println(vowels);
        System.out.println(consonant);
    }
}
