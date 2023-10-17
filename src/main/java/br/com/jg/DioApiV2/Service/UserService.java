package br.com.jg.DioApiV2.Service;

import br.com.jg.DioApiV2.Model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity cadastrarUsuario(User user);
    ResponseEntity findById(Long id);
}
