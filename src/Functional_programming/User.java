package Functional_programming;

import java.util.function.Supplier;

public class User {

    private String name;
    private String phone;

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }


    public void printUserData() {
        Supplier<User> userSupplier = () -> new User("Tom", "555 123-8596");
        User user = userSupplier.get();
        user.printInfoUser();
    }

    public void printInfoUser() {
        System.out.println("User name is " + getName() + ", phone " + getPhone());
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}