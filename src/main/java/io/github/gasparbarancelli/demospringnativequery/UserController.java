package io.github.gasparbarancelli.demospringnativequery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

  @Autowired private UserNativeQuery userNativeQuery;
  
  @GetMapping()
  public List<UserTO> findUsers() {
    return userNativeQuery.findUsers();
  }
  
  @PostMapping("filter")
  public List<UserTO> findUsers(@RequestBody UserFilter filter) {
    return userNativeQuery.findUsersByFilter(filter);
  }
  
  @GetMapping("active")
  public List<UserTO> findUsers(
          @RequestParam(value = "page", defaultValue = "0", required = false) int page,
          @RequestParam(value = "size", defaultValue = "10", required = false) int size) {
    return userNativeQuery.findActiveUsers(PageRequest.of(page, size));
  }
  
  @GetMapping("activeWithPage")
  public Page<UserTO> findActiveUsersWithPage(
          @RequestParam(value = "page", defaultValue = "0", required = false) int page,
          @RequestParam(value = "size", defaultValue = "5", required = false) int size) {
    return userNativeQuery.findActiveUsersWithPage(PageRequest.of(page, size));
  }
  
  @GetMapping("{id}")
  public UserTO findUsers(@PathVariable("id") Number id) {
    return userNativeQuery.findUserById(id);
  }
  
  @GetMapping("ids")
  public List<Number> getIds() {
    return userNativeQuery.getUsersId();
  }
  
  @GetMapping("{id}/name")
  public String getUserName(@PathVariable("id") Number id) {
    return userNativeQuery.getUserName(id);
  }

}