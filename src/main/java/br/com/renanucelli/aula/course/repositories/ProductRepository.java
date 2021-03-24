package br.com.renanucelli.aula.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.renanucelli.aula.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

		
}
