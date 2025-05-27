import java.lang.reflect.Method;
public class Exercise39 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Exercise38");
        Method[] methods = cls.getDeclaredMethods();

        System.out.println("Methods in Exercise38:");
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }
    }
}
