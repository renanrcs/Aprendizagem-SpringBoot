package io.github.renanrcs.api.services;

import io.github.renanrcs.api.entities.Category;
import io.github.renanrcs.api.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        return categoryOptional.get();
    }
}
