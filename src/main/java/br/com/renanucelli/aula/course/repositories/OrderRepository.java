package br.com.renanucelli.aula.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.renanucelli.aula.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

		
}
