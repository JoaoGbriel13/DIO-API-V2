package br.com.jg.DioApiV2.Service.impl;

import br.com.jg.DioApiV2.Model.User;
import br.com.jg.DioApiV2.Repository.UserRepository;
import br.com.jg.DioApiV2.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public ResponseEntity cadastrarUsuario(User user) {
        if (userRepository.existsByCardNumber(user.getCard().getNumber())){
            throw new IllegalArgumentException("Card number already exists");
        }
        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @Override
    public ResponseEntity findById(Long id) {
        var userFound = userRepository.findById(id);
        if (userFound.isPresent()){
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(userFound);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Não foi encontrado nenhum usuario com o ID informado.");
        }

    }
}
