/**
 * Created by Roberto on 03/03/2016.
 */
public class Inheritance2 {
    public static void main(String[] argh) {
        Arithmetic X = new Adder();
        System.out.println("My superclass is: " + X.getClass().getSuperclass().getName());
        System.out.print(X.add(10, 32) + " " + X.add(10, 3) + " " + X.add(10, 10) + "\n");

    }
}

class Adder extends Arithmetic implements Ari {


    public String add(int i, int j) {
        return String.valueOf(i + j);
    }

    @Override
    public String mult(int i, int j) {
        return String.valueOf(i * j);
    }
}

abstract class Arithmetic {

    private String name = "name";

    public abstract String add(int i, int j);

    public String rest(int i, int j) {
        System.out.println(name);
        return String.valueOf(i - j);
    }
}

interface Ari {
    public String mult(int i, int j);


}
