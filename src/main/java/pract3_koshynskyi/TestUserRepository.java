package pract3_koshynskyi;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class TestUserRepository {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository(List.of(new User("www"), new User("qqq")));
        String email = "qq";

        try {
            System.out.println(userRepository.findByEmail(email).orElseThrow(() -> new NoSuchElementException("студента з поштою -" + email + "не знайшли")));
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }
        String email2 = "ww";
        System.out.println(userRepository.findByEmail(email2).orElseGet(() -> new User("Guest")));

        System.out.println("Optional не слід використовувати в параметрахgit  тому що це впливає не ефективність програми, бо перед кожним викликом методу доведеться обгортати параметри \n" +
                "Також якщо розробник розуміє що може прийти null, нічого не заважає зробити просто == null перевірку \n" +
                "Також Optional в методах має проблему, що можуть прийти данні 3 станів (Optional.of(value),\n +" +
                "Optional.empty() і null), що є незручно." +
                "\nЩодо полів це також має проблеми з пам'яттю, також Optional не підтримує серіалізацію і буде проблемно зберігати дані в Optional обгортці");
    }
}
