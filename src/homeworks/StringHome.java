package homeworks;

/**
 * Created by Shaddowrunner on 22.04.2017.
 */
public class StringHome {

    private String hello;

    public StringHome(String hello) {
        this.hello = hello;
    }


    public String replaceFirst(String regex, String replacement) {
        return hello.replace(regex, replacement);
    }

    public static void main(String[] args) {
        StringHome stringHome = new StringHome("Hello world");
        System.out.println(stringHome.replaceFirst("world", "friend"));
    }
}
