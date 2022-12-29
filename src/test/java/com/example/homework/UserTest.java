package com.example.homework;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private User user1;
    private User user3;

    public UserTest() {
    }

    @BeforeEach
    public void setUp() {
        String login1 = "OlgaSm";
        String correctEmail = "hello@.world";
        user1 = new User(login1, correctEmail);
        String inCorrectEmail = "hello.world";
        String login2 = "OlegB";
        User user2 = new User(login2, inCorrectEmail);
        user3 = new User();
    }

    @After
    public void afterTest() {
        user3 = null;
    }
    @Test
    @DisplayName("Тест проверки корректности Email")
    public void inEmail(){
        assertTrue(user1.inEmail(user1.getEmail()));
    }

    @Test
    @DisplayName("Тест проверки неравентсва login и email")
    public void testFieldsUserAreNotEquals(){
        assertNotEquals( user1.getLogin(), user1.getEmail());
    }
    @Test
    @DisplayName("Тест создания объекта с двумя полями")
    public void testCreatingObjectWithTwoFields(){
        assertNotNull( user1.getLogin(), user1.getEmail());
    }
    @Test
    @DisplayName("Тест создания объекта без полей")
    public void testCreatingObjectWithoutFields(){
        assertNull( user3.getLogin(), user3.getEmail());
    }

}






