package io.github.gasparbarancelli.demospringnativequery;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class UserTO {

  private Integer id;
  private BigDecimal height;
  private String name;

}