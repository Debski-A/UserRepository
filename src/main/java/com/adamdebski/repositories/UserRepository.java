package com.adamdebski.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adamdebski.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

    public List<User> findAll();
    
    @SuppressWarnings("unchecked")
    public User save(User user);
    
    public void delete(User user);
    
}
