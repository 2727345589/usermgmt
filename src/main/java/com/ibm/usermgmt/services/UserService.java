package com.ibm.usermgmt.services;

import com.ibm.usermgmt.entity.User;

public interface UserService {
    User getUserById(Long id);
    User saveUser(User user);
}
