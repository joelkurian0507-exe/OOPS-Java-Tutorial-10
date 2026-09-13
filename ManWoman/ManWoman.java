class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayMe() {
        System.out.println("Man's Name: " + name + ",Age: " + age);
    }
}

class Woman {
    private String name;
    private int age;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayMe() {
        System.out.println("Woman's Name: " + name + ",Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Man m = new Man("Smith", 40);
        Woman w = new Woman("Jane", 35);

        m.displayMe();
        w.displayMe();
    }
}
