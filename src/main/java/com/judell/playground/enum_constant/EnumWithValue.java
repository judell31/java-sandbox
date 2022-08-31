package com.judell.playground.enum_constant;

public enum EnumWithValue {
    STUDENT("student"),
    PARENT("parent"),
    TUTOR("tutor");

    private final String userType;

    EnumWithValue(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return this.userType;
    }
}
