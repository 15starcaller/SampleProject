package lesson8.littleApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {//map идеален для бд, когда ключ маленький и value большой
    // логин добавить удалить просмотреть всех редактировать = 5 (crud) create read u delete
    private Map<String, User> users;
    private final String PATH_TO_FILE="src\\main\\java\\lesson8\\littleApp\\user";//const=final

    public UserService() {
        users = FileHelper.readFromFile(PATH_TO_FILE);// new HashMap<>();
        //User adminUser = new User("admin", "admin", "Tolya");
        //users.put("admin", adminUser);
    }

    public void saveData() {
        FileHelper.saveToFile(PATH_TO_FILE, users);
    }

    public User getByLogin(String login) {

        return users.get(login);
    }

    public boolean addUser(User user) {
        if (users.containsKey(user.getLogin())) {
            return false;
        }
        users.put(user.getLogin(), user);//Map - ассоциативный массив
        return true;
    }

    public boolean deleteByLogin(String login) {
        if (users.containsKey(login)) {
            users.remove(login);
            return true;
        } else {
            return false;
        }

    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());//список всех значений
    }

    public boolean editUser(User user) {
        if (users.containsKey(user.getLogin())) {
            users.put(user.getLogin(), user);
            return true;
        } else {
            return false;
        }
    }

    public boolean auth(String login, String password) {
        if (users.containsKey(login)) {
            User user = users.get(login);
            if (user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}


