package com.geekster.UserManagementSystem.Repository;

import com.geekster.UserManagementSystem.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User,Integer> {
}
