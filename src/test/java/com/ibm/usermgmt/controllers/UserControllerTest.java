package com.ibm.usermgmt.controllers;

import com.ibm.usermgmt.entity.User;
import com.ibm.usermgmt.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;  // 改为 JUnit 5 的断言
import static org.junit.jupiter.api.Assertions.assertNull;   // 改为 JUnit 5 的断言
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    private User testUser;

    @BeforeEach  // 改为 JUnit 5 的 BeforeEach
    public void setUp() {
        testUser = new User();
        testUser.setId(123L);
        testUser.setName("tom");
        testUser.setBirth(LocalDate.parse("2020-01-01"));
        testUser.setGender("male");
        testUser.setRole("user");
    }

    @Test
    public void testSaveUser() {
        when(userService.saveUser(any(User.class))).thenReturn(testUser);

        ResponseEntity<Map<String, Long>> response = userController.saveUser(testUser);

        verify(userService).saveUser(testUser);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(123L, response.getBody().get("id").longValue());
    }

    @Test
    public void testGetUserById() {
        when(userService.getUserById(123L)).thenReturn(testUser);

        ResponseEntity<User> response = userController.getUserById(123L);

        verify(userService).getUserById(123L);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(testUser, response.getBody());
    }

    @Test
    public void testGetUserById_NotFound() {
        when(userService.getUserById(2L)).thenReturn(null);

        ResponseEntity<User> response = userController.getUserById(2L);

        verify(userService).getUserById(2L);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNull(response.getBody());
    }
}