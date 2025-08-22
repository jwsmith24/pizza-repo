package com.example.pizza;

import com.example.pizza.entities.Pizza;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class PizzaService {

    private final List<Pizza> pizzaList = new ArrayList<>();


    public Pizza savePizza(Pizza pizza) {
        pizzaList.add(pizza);

        return pizza;
    }

    public List<Pizza> getAllPizzas() {
        return pizzaList;
    }

    public Pizza getPizzaById(Long id) {
        return pizzaList
                .stream()
                .filter((pizza -> Objects.equals(pizza.getId(), id)))
                .findFirst().orElseThrow();
    }


}
