package br.com.jg.DioApiV2.Repository;

import br.com.jg.DioApiV2.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByCardNumber(String cardNumber);
}
