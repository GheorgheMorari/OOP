
class A{
    protected String a;
    protected X x;
    A(){
        this.a = "";
    }
    A(String a){
        this.a = a;
        this.x = new X("A's X");
    }
    A(String a, X x){
        this.a = a;
        this.x = x;
    }
    public void print(){
        System.out.println("A " + this.a);
        x.print();
    }
}
class B extends A {
    protected String b;
    B(String b){
        super("B-AAA");
        this.b = b;
    }
    public void print(){
        super.print();
        System.out.println("B " + this.b);
        x.print();
    }
}
class C extends B {
    protected String c;
    C(String c){
        super("C-BBB");
        this.c = c;
    }
    public void print(){
        super.print();
        System.out.println("C " + this.c);
        x.print();
    }
}
class D extends C {
    protected String d;
    protected X x;
    D(String d){
        super("D-CCC");
        this.d = d;
        this.x = new X("D's X");
    }
    public void print(){
        super.print();
        System.out.println("D " + this.d);
        x.print();
    }
}
class E extends D {
    protected String e;
    E(String e){
        super("E-DDD");
        this.e = e;
    }
    public void print(){
        super.print();
        System.out.println("E " + this.e);
        x.print();
    }
}
class F extends E {
    protected String f;
    F(String f){
        super("F-EEE");
        this.f = f;
    }
    public void print(){
        super.print();
        System.out.println("F " + this.f);
        x.print();
    }
}
class G extends F {
    protected String g;
    G(String g){
        super("G-FFF");
        this.g = g;
    }
    public void print(){
        super.print();
        System.out.println("G " + this.g);
        x.print();
    }
}
class H extends G {
    protected String h;
    H(String h){
        super("H-GGG");
        this.h = h;
    }
    public void print(){
        super.print();
        System.out.println("H " + this.h);
        x.print();
    }
}
class I extends H {
    protected String i;
    private X x;
    I(String i){
        super("I-HHH");
        this.i = i;
        this.x = new X("I's private X");
    }
    public void print(){
        super.print();
        System.out.println("I " + this.i);
        x.print();
    }
}
class J extends I {
    protected String j;
    protected X x;
    J(String j){
        super("J-III");
        this.j = j;
        this.x = new X("J's protected x");
    }
    public void print(){
        super.print();
        System.out.println("J " + this.j);
        x.print();
    }
}
class X extends A {
    protected String x;
    X(String x){
        //super(x);
        this.x = x;
    }
    public void print(){
        //System.out.println("X ");
        System.out.println(this.x);
    }
}