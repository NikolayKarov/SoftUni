package JarT;

public class Main {
    public static void main(String[] args) {

        Jar<Integer> jar = new Jar<>();

        jar.add(13);
        jar.add(42);
        jar.add(69);
        jar.add(73);

        System.out.println(jar.remove());
        System.out.println(jar.remove());
    }
}
