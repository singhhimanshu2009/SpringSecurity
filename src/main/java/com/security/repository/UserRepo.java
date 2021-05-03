package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.security.model.Users;
import java.util.*;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{
	
	Optional<Users> findByUserName(String userName);

}
