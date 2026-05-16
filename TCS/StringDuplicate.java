public class StringDuplicate {
    public static void main(String[] args) {
        String str = "Programming";

        str = str.toLowerCase();
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ans.indexOf(ch) == -1) {
                ans = ans + ch;
            }
        }

        System.out.println(ans);
    }
}
