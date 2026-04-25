// public class StaticNonStatic {

//     void fun() {
//         System.out.println("In fun");
//     }

//     static void run() {
//         System.out.println("In run");
//     }

//     public static void main(String[] args) {
//         // StaticNonStatic obj = new StaticNonStatic();
//         obj.fun();
//         run();
//     }
// }

import java.lang.*;

public class StaticNonStatic {
    static {
        System.out.println(10);
    }

    public static void main(String[] args) {
        int x = 10;
    }
}