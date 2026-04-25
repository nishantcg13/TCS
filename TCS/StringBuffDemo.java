public class StringBuffDemo {
    public static void main(String[] args) {
        String str = "Shashi";
        StringBuffer sbr = new StringBuffer("Shashya");
        System.out.println(sbr.capacity());
        System.out.println(System.identityHashCode(sbr));
        System.out.println(sbr);
        sbr = sbr.append("Master");
        System.out.println(sbr);
        System.out.println(System.identityHashCode(sbr));
    }
}
