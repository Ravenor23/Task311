package spring.kata.task311.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.kata.task311.springbootdemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
