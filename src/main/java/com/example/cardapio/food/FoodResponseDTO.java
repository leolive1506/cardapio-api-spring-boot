package com.example.cardapio.food;

// record -> representa dados que vão ser estáticos
// não cria dados get set ou manuseio
public record FoodResponseDTO(Long id, String title, String image, Integer price) {
  public FoodResponseDTO(Food food) {
    this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
  }
}
