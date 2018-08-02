package com.app.demo.service;

import com.app.demo.model.User;
import com.app.demo.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRespository userRespository;

    public List<User> getAllUsers() {
        return userRespository.findAll();
    }

    public User addUser(User user) {
        return userRespository.save(user);
    }

    public User updateUser(Long id, User user) {

        Optional<User> updatedUser = userRespository.findById(id);

        if(updatedUser.isPresent()){
            if(user.getName() != null){
                updatedUser.get().setName(user.getName());
            }
            if(user.getEmail() != null){
                updatedUser.get().setEmail(user.getEmail());
            }
            return userRespository.save(updatedUser.get());
        }
        return null;
    }

    public void removeUser(Long id) {
        userRespository.deleteById(id);
    }
}
