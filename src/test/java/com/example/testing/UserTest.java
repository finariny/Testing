package com.example.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    public static final String CORRECT_LOGIN = "Ivan";
    public static final String CORRECT_EMAIL = "ivan@mail.ru";
    public static final String DEFAULT_LOGIN = "Stranger";
    public static final String DEFAULT_EMAIL = "stranger@mail.ru";

    public static final User CORRECT_USER = new User(CORRECT_LOGIN, CORRECT_EMAIL);

    @Test
    public void shouldSetDataWhenObjectIsCreated() {
        assertEquals(CORRECT_USER, new User(CORRECT_LOGIN, CORRECT_EMAIL));
    }

    @Test
    public void shouldCreateAnObjectWithoutPassingParametersToIt() {
        User userWithDefaultParameters = new User(DEFAULT_LOGIN, DEFAULT_EMAIL);
        assertEquals(userWithDefaultParameters, new User());
    }

    @Test
    public void shouldCheckIfTheEmailIsCorrect() {
        assertTrue(CORRECT_USER.isCorrectEmail(CORRECT_EMAIL));
    }

    @Test
    public void shouldCheckIfLoginAndEmailAreEqual() {
        assertNotEquals(CORRECT_LOGIN, CORRECT_EMAIL);
    }
}