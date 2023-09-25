package com.geekster.UserManagementSystem.Service;

import com.geekster.UserManagementSystem.Model.User;
import com.geekster.UserManagementSystem.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public String addUserDetails(List<User> newUser) {
        userRepo.saveAll(newUser);
        return "user added";
    }

    public User getUserDetails(Integer id) {
        Optional<User> optionalUser= userRepo.findById(id);
        if(optionalUser.isPresent()){
            return optionalUser.get();
        }else{
            return null;
        }
       // return userRepo.findById(id).orElse(new User());
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepo.findAll();
    }

    public String updateUserByPhoneNumber(Integer id, String phoneNumber) {
        User presentPhoneNumber = userRepo.findById(id).orElse(null);
        if(presentPhoneNumber != null){
            presentPhoneNumber.setPhoneNumber(phoneNumber);
            userRepo.save(presentPhoneNumber);
            return "updated";
        }else{
            return "user id not found";
        }
    }

    public String deleteUserById(Integer id) {
         userRepo.deleteById(id);
         return "deleted";
    }
}
