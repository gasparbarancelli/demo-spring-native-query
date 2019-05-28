package io.github.gasparbarancelli.demospringnativequery;

import io.github.gasparbarancelli.NativeQueryOperator;
import io.github.gasparbarancelli.NativeQueryParam;
import lombok.*;

@Data
public class UserFilter {
  private Number id;
  
  /*
    Custom operator, when add parameter value in query and jwitg, the paramter is transformed
  */
  @NativeQueryParam(value = "name", operator = NativeQueryOperator.CONTAINING)
  private String name;
}