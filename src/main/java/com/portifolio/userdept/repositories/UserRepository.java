package com.portifolio.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portifolio.userdept.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

	
}
