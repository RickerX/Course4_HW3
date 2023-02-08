package org.example;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserService userService;
    @Test
    void userTest() {
        when(userRepository.getAllCollectionUser()).thenReturn(List.of(new User("Test","Test"),
                new User("Test","Test")));
        assertThat(userService.getAllCountUser()).
                isEqualTo("[Login Test Password Test, Login Test Password Test]");
    }
}
