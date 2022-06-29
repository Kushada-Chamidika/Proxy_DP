package designpatternsday11proxypattern;

public class Test {

    public static void main(String[] args) {

    }

}

interface X {

    public abstract void m(int i);

}

class XReal implements X {

    @Override
    public void m(int i) {
        System.out.println("XReal");
    }

}

class XProxy implements X {

    private X xReal = new XReal();

    @Override
    public void m(int i) {
        System.out.println("XProxy");
        if (i == 10) {
            xReal.m(i);
        } else {
            System.out.println("Access Denied");
        }
    }

}
