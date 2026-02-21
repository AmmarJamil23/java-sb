//Non static method needs an object meaning the method works on object state
public class St {
    String name;

    St(String name) {
        this.name = name;
    }


    String getName() {
        return name;
    }
}
