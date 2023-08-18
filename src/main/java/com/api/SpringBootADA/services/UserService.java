package com.api.SpringBootADA.services;

import com.api.SpringBootADA.entity.UserEntity;
import com.api.SpringBootADA.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<UserEntity> userEntityList(){
            return userRepository.findAll();
    }

    public UserEntity userEntityOne(long id) {
        return userRepository.findById(id).orElse( new UserEntity() );
    }

    public UserEntity userEntitySave(UserEntity user) {
        return userRepository.save(user);
    }

    public UserEntity userEntityUpdate(long id, UserEntity user) {
        Optional<UserEntity> optional = userRepository.findById(id);

        if (optional.isPresent()) {
            UserEntity userBD = optional.get();
            userBD.setEmail( user.getEmail() );
            userBD.setName( user.getName() );
            userBD.setPassword( user.getPassword() );

            return userRepository.save(userBD);
        }
        else {
            return new UserEntity();
        }
    }

    public void delete(long id) {
        userRepository.deleteById(id);
    }
}
