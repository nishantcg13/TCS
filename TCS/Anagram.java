import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String str3 = str1.toLowerCase();
        String str4 = str2.toLowerCase();

        int arr[] = new int[26];

        if (str3.length() == str4.length()) {

            for (int i = 0; i < str3.length(); i++) {
                char ch = str3.charAt(i);
                arr[ch - 'a']++;

                char ch1 = str4.charAt(i);
                arr[ch1 - 'a']--;
            }
        } else {
            System.out.println("Not Anagram");
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                System.out.println("Not Anaggram");
                return;
            }

        }
        System.out.println("Anagram");
    }
}