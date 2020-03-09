package br.com.rd.ecommerce.models.repositories;

import br.com.rd.ecommerce.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findbyId(Long id);
    List<User> findByFirstName(String fistName);
    List<User> findByLastName(String lastName);
    List<User> findByLastAge(Integer age);
}
