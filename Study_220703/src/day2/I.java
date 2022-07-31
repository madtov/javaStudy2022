package day2;

import day4.G;

public class I {
    public I() {
        G g = new G();
        g.field1 = 1;   //(o)
//        g.field2 = 1;   //(x)
//        g.field3 = 1;   //(x)

        g.method1();    //(o)
//        g.method2();    //(x)
//        g.method3();    //(x)
    }
}
