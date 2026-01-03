import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public List<User> findAll() {
        return Collections.unmodifiableList(users);
    }

  
}
