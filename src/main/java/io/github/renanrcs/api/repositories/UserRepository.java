package io.github.renanrcs.api.repositories;

import io.github.renanrcs.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
