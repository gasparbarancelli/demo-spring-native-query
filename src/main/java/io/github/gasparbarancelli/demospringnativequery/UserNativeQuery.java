package io.github.gasparbarancelli.demospringnativequery;

import io.github.gasparbarancelli.NativeQuery;
import io.github.gasparbarancelli.NativeQueryParam;
import io.github.gasparbarancelli.NativeQuerySql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Map;

public interface UserNativeQuery extends NativeQuery {

  List<UserTO> findUsers();

  @NativeQuerySql("SELECT cod as \"id\", full_name as \"name\" FROM USER")
  List<UserTO> findBySqlInline();

  List<UserTO> findWithMap(Map<String, Object> params);
  
  /*
    Add fields children of parameter
  */
  List<UserTO> findUsersByFilter(@NativeQueryParam(value = "filter", addChildren = true) UserFilter filter);
  
  /*
    Add pagination
  */
  List<UserTO> findActiveUsers(Pageable pageable);

  /*
    Ordering
   */
  List<UserTO> findActiveUsersWithSort(Sort sort);

  /*
    Add pagination and return object with values for the pagination (count, page, size)
  */
  Page<UserTO> findActiveUsersWithPage(Pageable pageable);
  
  /*
    Custom parameter name
  */
  UserTO findUserById(@NativeQueryParam(value = "codigo") Number id);
  
  List<Number> getUsersId();
  
  String getUserName(Number id);
  
}
