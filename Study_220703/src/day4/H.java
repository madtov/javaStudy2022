package day4;

public class H {
    public H() {
        G g = new G();
        g.field1 = 1; //(o)
        g.field2 = 1; //(o)
//        g.field3 = 1; //(x)

        g.method1();  //(o)
        g.method2();  //(o)
//        g.method3();  //(x)
        }
    }
