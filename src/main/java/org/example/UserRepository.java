package org.example;

import java.util.*;

public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        this.users.add(user);
    }

    public Collection<User> getAllCollectionUser() {
        return Collections.unmodifiableCollection(users);
    }

    public Optional<User> getUserByParameters(String login, String password) {
        return this.users.stream().filter(user -> user.getLogin().equals(login)).
                filter(user -> user.getPassword().equals(password)).findAny();}
    public Optional<User> getUserByLogin(String login) {
        return this.users.stream().filter(user -> user.getLogin().equals(login)).findAny();}
}
