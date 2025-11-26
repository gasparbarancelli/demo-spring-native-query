package io.github.gasparbarancelli.demospringnativequery;

import java.math.BigDecimal;

public class UserTO {

  private Integer id;
  private BigDecimal height;
  private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
