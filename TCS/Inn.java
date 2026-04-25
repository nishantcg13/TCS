public class Inn {
    Inn() {
        System.out.println("Outer Constructor");
    }

    int x = 10;

    void fun() {

        class Inner1 {
            int x = 30;

            Inner1() {
                System.out.println("Inner1 constructor");
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(Inn.this.x);
            }

        }
    }

    void run() {

        class Inner1 {
            Inner1() {
                System.out.println("Inner2 Constructor");
            }
        }
    }

    public static void main(String[] args) {
        Inn inner = new Inn();

    }
}