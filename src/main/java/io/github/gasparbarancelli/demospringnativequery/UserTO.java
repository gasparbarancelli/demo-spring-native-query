package io.github.gasparbarancelli.demospringnativequery;

import lombok.*;

import java.io.Serializable;

@Data
public class UserTO implements Serializable {

  private Number id;
  private String name;

}
