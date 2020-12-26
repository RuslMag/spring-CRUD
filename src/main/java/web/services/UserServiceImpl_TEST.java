package web.services;

import org.springframework.stereotype.Service;
import web.models.User;

import java.util.ArrayList;
import java.util.List;

/*//@Service
public class UserServiceImpl_TEST implements UserService {

    private static int USER_COUNT;
    private List<User> userList;

    {
        userList = new ArrayList<>();

        userList.add(new User(++USER_COUNT, "Владимир", 30, "Москва", "vladimir@mail.ru"));
        userList.add(new User(++USER_COUNT, "Алексей", 19, "Казань", "aleksei@mail.ru"));
        userList.add(new User(++USER_COUNT, "Анна", 22, "Уфа", "anna@mail.ru"));
        userList.add(new User(++USER_COUNT, "Тимур", 26, "Волгоград", "timur@mail.ru"));
        userList.add(new User(++USER_COUNT, "Виктория", 33, "Сочи", "vika@mail.ru"));
    }

    @Override
    public List<User> listUsers() {
        return userList;
    }

    @Override
    public User show(int id) {
        return userList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    @Override
    public void save(User user) {
        user.setId(++USER_COUNT);
        userList.add(user);
    }

    @Override
    public void update(User updatedUser) {
        User userUpdate = show(updatedUser.getId());
        userUpdate.setName(updatedUser.getName());
        userUpdate.setAge(updatedUser.getAge());
        userUpdate.setCity(updatedUser.getCity());
        userUpdate.setEmail(updatedUser.getEmail());
    }

    @Override
    public void delete(int id) {
        userList.removeIf(user -> user.getId() == id);
    }
}*/
