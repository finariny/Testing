package com.example.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    public static final String CORRECT_LOGIN = "Ivan";
    public static final String CORRECT_EMAIL = "ivan@mail.ru";
    public static final String DEFAULT_LOGIN = "Stranger";
    public static final String DEFAULT_EMAIL = "stranger@mail.ru";

    @Test
    public void shouldSetDataWhenObjectIsCreated() {
        User correctUser = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertEquals(CORRECT_LOGIN, correctUser.getLogin());
        assertEquals(CORRECT_EMAIL, correctUser.getEmail());
    }

    @Test
    public void shouldCreateAnObjectWithoutPassingParametersToIt() {
        User userWithDefaultParameters = new User();
        assertEquals(DEFAULT_LOGIN, userWithDefaultParameters.getLogin());
        assertEquals(DEFAULT_EMAIL, userWithDefaultParameters.getEmail());
    }

    @Test
    public void shouldCheckIfTheEmailIsCorrect() {
        assertThrows(IllegalArgumentException.class, () -> new User(CORRECT_LOGIN, "ivan@mailru"));
        assertDoesNotThrow(() -> new User(CORRECT_LOGIN, "ivan@mail.ru"));
    }

    @Test
    public void shouldCheckIfLoginAndEmailAreEqual() {
        assertThrows(IllegalArgumentException.class, () -> new User(CORRECT_LOGIN, CORRECT_LOGIN));
    }
}