package br.com.renanucelli.aula.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.renanucelli.aula.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

		
}
