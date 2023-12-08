package com.example.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Entity, Type id> 
public interface FoodRepository extends JpaRepository<Food, Long> {
}
