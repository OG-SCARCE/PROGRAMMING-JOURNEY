interface A {
    void showA();
}

interface B {
    void showB();
}

interface C extends A, B { }

class D implements C {
    public void showA() {
        System.out.println("Interface A");
    }
    public void showB() {
        System.out.println("Interface B");
    }
}

public class programme_5 {
    public static void main(String[] args) {
        D obj = new D();
        obj.showA();
        obj.showB();
    }
}
