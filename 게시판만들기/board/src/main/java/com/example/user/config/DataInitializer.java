//package com.example.user.config;
//
//import com.example.user.entity.Role;
//import com.example.user.entity.User;
//import com.example.user.repository.UserRepository;
//import com.example.user.repository.RoleRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import java.util.Set;
//
//@Component
//public class DataInitializer implements CommandLineRunner {
//
//    private final UserRepository userRepository;
//    private final RoleRepository roleRepository;
//    private final PasswordEncoder passwordEncoder;
//
//    public DataInitializer(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.roleRepository = roleRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public void run(String... args) {
//        // Role이 이미 존재하는지 확인
//        Role userRole = roleRepository.findByName("ROLE_USER")
//                .orElseGet(() -> {
//                    Role newRole = new Role();
//                    newRole.setName("ROLE_USER");
//                    return roleRepository.save(newRole);
//                });
//
//        // User가 이미 존재하는지 확인
//        if (!userRepository.existsByUsername("testuser")) {
//            User user = new User();
//            user.setUsername("testuser");
//            user.setPassword(passwordEncoder.encode("password"));
//            user.setRoles(Set.of(userRole));
//            userRepository.save(user);
//        }
//    }
//}