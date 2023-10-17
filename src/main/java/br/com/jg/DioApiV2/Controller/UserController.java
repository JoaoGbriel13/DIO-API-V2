package br.com.jg.DioApiV2.Controller;

import br.com.jg.DioApiV2.Model.User;
import br.com.jg.DioApiV2.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/{id}")
    public ResponseEntity getUserById(@PathVariable("id") Long id){
        return userService.findById(id);
    }
    @PostMapping
    public ResponseEntity createUser(@RequestBody User user){
        return userService.cadastrarUsuario(user);
    }
}
