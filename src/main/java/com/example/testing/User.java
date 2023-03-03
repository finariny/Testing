package com.example.testing;

import java.util.Objects;

public class User {
    private final String login;
    private final String email;

    public User() {
        this.login = "Stranger";
        this.email = "stranger@mail.ru";
    }

    public User(String login, String email) {
        if (login.equals(email)) {
            throw new IllegalArgumentException("Логин и e-mail не могут быть одинаковыми");
        }
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("E-mail введён некорректно");
        }
        this.login = login;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return login.equals(user.login) && email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}
