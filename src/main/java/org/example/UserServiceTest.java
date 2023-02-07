package org.example;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserService userService;
    @Test
    void userTest() {
        assertThat(userService.getAllCountUser()).isEqualTo(null);
    }
}
