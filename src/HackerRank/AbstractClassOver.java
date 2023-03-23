package HackerRank;

abstract class SuperClass {

    public static void method1() {
        System.out.println("It's a static method.");
    }

    public void method2() {
        System.out.println("It's not a static method.");
    }

    public abstract void method3();
}

class CreateInstance {

    public static SuperClass create() {

        SuperClass instance = new SuperClass(){
            @Override
            public void method2() {
                System.out.println("method2");
            }

            @Override
            public void method3() {
                System.out.println("method3");
            }
        };
        instance.method2();
        instance.method3();


        return instance;
    }
}


public class AbstractClassOver {
    public static void main(String[] args) {
        System.out.println("hoa");
        CreateInstance instance=new CreateInstance();
        instance.create();

    }
}
