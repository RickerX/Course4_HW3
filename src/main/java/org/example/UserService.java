package org.example;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(String userLogin, String userPassword) {
        User user = new User(userLogin, userPassword);
        if (userLogin == null || userLogin.isBlank()) {
            throw new IllegalArgumentException("User login should be defined");
        }
        boolean userExist = this.userRepository.
                getAllCollectionUser().
                stream().
                anyMatch(t -> equals(user));
        if (userExist) {
            throw new IllegalArgumentException("User already exist");
        }
        this.userRepository.addUser(user);
    }

    public String getAllCountUser() {
        return this.userRepository.getAllCollectionUser().
                stream().
                toString();
    }
}
