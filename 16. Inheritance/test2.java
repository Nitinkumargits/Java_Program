class Parent {

    public Parent() {
        System.out.println("Non-param of Parent constructor");

    }

    public Parent(int x) {
        System.out.println("Param of parent constructor " + x);
    }
}

class Child extends Parent {

    public Child() {
        System.out.println("Non-param of Chlid constructor");
    }

    public Child(int y) {
        System.out.println("Param of child constructor " + y);
    }

    public Child(int x, int y) {
        super(x);
        System.out.println("2 param of child " + y);
    }
}

class GrandChild extends Child {

    public GrandChild() {
        System.out.println("GrandChild class");
    }
}

/**
 * test2
 */
public class test2 {

    public static void main(String[] args) {

        Child c = new Child(10, 20);
    }
}