package online.ivandjoh.demogradle.repository;

import online.ivandjoh.demogradle.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> { }
