import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank implements ShowContent {

    private final String name;

    public static  List<User> userList = new ArrayList<>();

    public static List<User> getUserList() {
        return userList;
    }

    public Bank(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String showContent() {
        return "Bank name: " + this.name + "\n" +
                ("---------------------------------");
    }


    public void addUser(User user) {
        userList.add(user);
    }
}

