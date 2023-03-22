package com.design.pattern.state.demo;

public enum State {

    SMALL("1", "small"),
    SUPER("2", "super"),
    CAPE("3", "cape"),
    FIRE("4", "fire");
    private final String code;
    private final String state;


    State(String code, String state) {
        this.code = code;
        this.state = state;
    }


    public String code() {
        return this.code;
    }


    public String state() {
        return this.state;
    }
}
