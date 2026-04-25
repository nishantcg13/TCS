public class Constr {

    private Constr() {
        this(10);
        System.out.println("in def const");
    }

    Constr(int x) {

        super();
        System.out.println(x);
    }

    public static void main(String[] args) {
        Constr cns = new Constr();
    }

}
