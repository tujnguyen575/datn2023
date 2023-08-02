package com.handsmade.datn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.handsmade.datn.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
