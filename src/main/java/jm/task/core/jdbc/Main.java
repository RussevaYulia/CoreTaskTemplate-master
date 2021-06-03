package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();

        userService.cleanUsersTable();
        userService.createUsersTable();
        userService.saveUser("Mary", "Brown", (byte) 56);
        userService.saveUser("Steve", "Adamson", (byte) 25);
        userService.saveUser("Smite", "Walter", (byte) 45);

        System.out.println(userService.getAllUsers());


    }
}
