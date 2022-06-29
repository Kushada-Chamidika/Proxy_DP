package designpatternsday11proxypattern;

public class RealImplementatin {

    public static void main(String[] args) {

        Windows11Trail trail = new Windows11Trail();

        trail.accessFullVersion("Q43FJ05");

        trail.accessFullVersion("dsfd33223");

    }

}

interface Windows11 {

    public abstract void accessFullVersion(String key);

}

class Windows11Genuine implements Windows11 {

    @Override
    public void accessFullVersion(String key) {
        System.out.println("Windows 11 Genuine");
    }

}

class Windows11Trail implements Windows11 {

    private Windows11Genuine windows11Genuine = new Windows11Genuine();

    @Override
    public void accessFullVersion(String key) {
        System.out.println("Windows 11 Trial");

        if (key.equals("Q43FJ05")) {
            windows11Genuine.accessFullVersion(key);
        } else {
            System.out.println("Access Denied");
        }

    }

}
