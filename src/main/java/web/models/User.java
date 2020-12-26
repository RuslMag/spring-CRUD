package web.models;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @NotEmpty(message = "Поле 'Имя' не должно быть пустым!")
    @Size(min = 3, max = 30, message = "Имя должно быть от 3 до 30 символов!")
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 150, message = "Age should not be greater than 150")
    @Column(name = "age", nullable = false, length = 3)
    private int age;

    @NotNull
    @Column(name = "city", nullable = false)
    @NotEmpty(message = "Поле 'Город' не должно быть пустым!")
    @Size(min = 2, max = 30, message = "Введите название города правильно!")
    private String city;

    @NotNull
    @Column(name = "email", nullable = false)
    @NotEmpty(message = "Поле 'Email' не должно быть пустым!")
    @Email(message = "Введите правильный Email!")
    private String email;

    public User() {
    }

    public User(int id, String name, int age, String city, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
