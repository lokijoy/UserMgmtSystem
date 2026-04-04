package com.system.mgmt.user.repository;

import com.system.mgmt.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Repository:User.
 */
@Repository
public interface UserRepository extends JpaRepository <User, Long>{
}
