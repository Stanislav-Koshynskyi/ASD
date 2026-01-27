package pract3_koshynskyi;

import java.util.List;
import java.util.Optional;

public class UserRepository {
    List<User> users;
    public Optional<User> findByEmail(String email) {
        return  users.stream().filter(u -> u.getEmail().equals(email)).findFirst();
    }
    UserRepository(List<User> users) {
        this.users = List.copyOf(users);
    }
}
