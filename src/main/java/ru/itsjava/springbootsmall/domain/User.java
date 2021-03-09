package ru.itsjava.springbootsmall.domain;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class User {
    private final String name;
    private final Email email;
    private final Dog dog;
}
