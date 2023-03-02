package com.example.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    public static final String CORRECT_LOGIN = "Ivan";
    public static final String CORRECT_EMAIL = "ivan@mail.ru";

    public static final User CORRECT_USER = new User(CORRECT_LOGIN, CORRECT_EMAIL);
    public static final User USER_WITHOUT_PARAMETERS = new User();

    @Test
    public void shouldSetDataWhenObjectIsCreated() {
        assertEquals(CORRECT_USER, new User(CORRECT_LOGIN, CORRECT_EMAIL));
    }

    @Test
    public void shouldCreateAnObjectWithoutPassingParametersToIt() {
        assertEquals(USER_WITHOUT_PARAMETERS, new User());
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