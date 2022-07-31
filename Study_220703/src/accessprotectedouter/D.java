package accessprotectedouter;

import accessprotected.A;

public class D extends A {
    public D() {
        super();                //O
        this.field = "value";   //O
        this.method();          //o
    }
}
