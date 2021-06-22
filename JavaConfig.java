import org.springframework,context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// その他のimportは省略

@Configuration
public class JavaConfig {
    @Bean
    UserRepository userRepository() {
        return new UserRepositoryimpl();
    }
    
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    UserService userService {
        return new UserServiceImpl(userRepository(), passwordEncoder());
    }
}
