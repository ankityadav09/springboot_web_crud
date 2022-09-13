package net.projava.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.projava.springboot.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
