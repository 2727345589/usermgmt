package com.ibm.usermgmt.daos;

import com.ibm.usermgmt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}