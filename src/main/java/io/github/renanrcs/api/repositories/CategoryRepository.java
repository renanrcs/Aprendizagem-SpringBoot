package io.github.renanrcs.api.repositories;

import io.github.renanrcs.api.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
