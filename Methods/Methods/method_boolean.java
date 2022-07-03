package Methods;

public class method_boolean {
    public boolean isTrue() {
        boolean a = true;
        return a;
    }

    public static void main(String args[]) {
        method_boolean ob = new method_boolean();
        System.out.println(ob.isTrue() ? "Yup" : "Nah");
    }
}
