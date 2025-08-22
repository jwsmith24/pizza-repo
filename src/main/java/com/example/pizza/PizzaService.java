package com.example.pizza;

import com.example.pizza.entities.Pizza;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public Pizza savePizza(Pizza pizza) {
       return pizzaRepository.save(pizza);
    }

    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    public Pizza getPizza(Long id) {
        return pizzaRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
    }


}
