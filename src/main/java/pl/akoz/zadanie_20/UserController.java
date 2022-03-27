package pl.akoz.zadanie_20;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @ResponseBody
    @RequestMapping("/users")
        public String usersList() {
            List<User> userList = userRepository.getUsersList();

            String result = "";
            for (User user1 : userList) {
                result += user1.getFirstName() + "|| " + user1.getLastName() + "|| " + user1.getAge() + "<br/>";

            }
            return  result;
    }

    @ResponseBody
    @RequestMapping("/add")
    public String addUser(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age) {
        if(firstName != "") {
            User user = new User(firstName, lastName, age);
            userRepository.add(user);
            return "success.html";
    } else {
            return "err.html";
        }
    }
}



