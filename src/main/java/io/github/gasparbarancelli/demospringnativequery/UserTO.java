package io.github.gasparbarancelli.demospringnativequery;

import java.math.BigDecimal;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserTO implements Serializable {

  private Integer id;
  private BigDecimal height;
  private String name;

}
