package org.saiteja.simpleblog.UserRegistration;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
