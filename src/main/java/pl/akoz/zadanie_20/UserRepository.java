package pl.akoz.zadanie_20;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> usersList;

    public UserRepository(List<User> usersList) {
        this.usersList = createUserList();
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }
    public void add(User user){
        usersList.add(user);
}
    private List<User> createUserList() {
        List<User> createUserList = new ArrayList<>();

        User user1 = new User("Aleksandra", "Nowak", 20);
        User user2 = new User("Dominik", "Kawka", 30);
        User user3 = new User("Alicja", "Kowalska", 35);
        User user4 = new User("Anna", "Klimek", 18);

        createUserList.add(user1);
        createUserList.add(user2);
        createUserList.add(user3);
        createUserList.add(user4);

        return createUserList;

        }
    }

