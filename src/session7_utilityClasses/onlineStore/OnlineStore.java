package session7_utilityClasses.onlineStore;

import java.time.LocalDateTime;

public class OnlineStore {

    public static void main(String[] args) {
        User user = new User();

        user.setFirstName("John");
        user.setLastName("Jones");
        user.setAge(23);
        user.setCreateAt(LocalDateTime.now());
        System.out.println(user);
    }
}