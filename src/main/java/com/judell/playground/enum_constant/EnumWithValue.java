package com.judell.playground.enum_constant;

import lombok.Getter;

@Getter
public enum EnumWithValue {
    STUDENT("student"),
    PARENT("parent"),
    TUTOR("tutor");

    private final String userType;

    EnumWithValue(String userType) {
        this.userType = userType;
    }
}
