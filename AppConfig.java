// Java Configクラスの実装例
@Configuration
public class AppConfig {
  @Bean
  UserRepository userRepository() {
    return new UserRepositoryImpe();
  }
  
  @Bean
  PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
  
  @Bean
  UserService userService() {
    return new UserServiceImpl(userRepository(), passwordEncoder());
  }
}
