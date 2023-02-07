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

}
