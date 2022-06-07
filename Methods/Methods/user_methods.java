package Methods;

public class user_methods {
    public boolean isTrue() {
        boolean a = true;
        return a;
    }

    public static void main(String args[]) {
        user_methods ob = new user_methods();
        System.out.println(ob.isTrue() ? "Yup" : "Nah");
    }
}
