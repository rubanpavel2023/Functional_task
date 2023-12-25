package Functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise #1");
        Main names = new Main();
        names.createAndPrintNamesList();

        System.out.println();

        System.out.println("Exercise #2");
        User user = new User("John", "555 987-6543");
        user.printUserData();


    }

    public void createAndPrintNamesList() {

        List<String> names = Arrays.asList("Tom", "Alice", "Bob", "Lucy");
        Consumer<String> printName = name -> System.out.println("Name is " + name + ";");
        names.forEach(printName);

    }
}
      

