package io.github.gasparbarancelli.demospringnativequery;

import io.github.gasparbarancelli.NativeQueryOperator;
import io.github.gasparbarancelli.NativeQueryParam;

public class UserFilter {

    private Number id;

    @NativeQueryParam(value = "name", operator = NativeQueryOperator.CONTAINING)
    private String name;

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}