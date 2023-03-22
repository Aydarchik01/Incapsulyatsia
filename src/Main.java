public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setHabitat("earth");
        d.setAge("2");
        d.setColor("black");

        Parrot p = new Parrot();
        p.setHabitat("sky");
        p.setAge("3");
        p.setColor("oreng");

        Fish f  =new Fish();
        f.setHabitat("water");
        f.setAge("2");
        f.setColor("colorful");

        System.out.println(d);
        System.out.println("==============");
        System.out.println(p);
        System.out.println("==============");
        System.out.println(f);
    }
}