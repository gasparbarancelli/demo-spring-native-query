package io.github.gasparbarancelli.demospringnativequery;

import io.github.gasparbarancelli.NativeQuery;
import io.github.gasparbarancelli.NativeQueryParam;
import io.github.gasparbarancelli.NativeQuerySql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface UserNativeQuery extends NativeQuery {

  List<UserTO> findUsers();

  @NativeQuerySql("SELECT cod as \"id\", full_name as \"name\" FROM USER")
  List<UserTO> findBySqlInline();

  List<UserTO> findWithMap(Map<String, Object> params);

  List<UserTO> findUsersByFilter(@NativeQueryParam(value = "filter", addChildren = true) UserFilter filter);
  
  List<UserTO> findActiveUsers(Pageable pageable);

  List<UserTO> findActiveUsersWithSort(Sort sort);

  Page<UserTO> findActiveUsersWithPage(Pageable pageable);
  
  UserTO findUserById(@NativeQueryParam(value = "codigo") Number id);
  
  List<Number> getUsersId();
  
  String getUserName(Number id);

  Optional<String> getOptionalUserName(Number id);

  Optional<UserTO> findOptionalUserById(@NativeQueryParam(value = "codigo") Number id);
  
}
