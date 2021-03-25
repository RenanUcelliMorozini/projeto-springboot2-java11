package br.com.renanucelli.aula.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.renanucelli.aula.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

		
}
