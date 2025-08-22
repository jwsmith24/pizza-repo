package com.example.pizza;

import com.example.pizza.entities.Pizza;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/pizza")
public class PizzaController {

    private final PizzaService pizzaService;

    public PizzaController(PizzaService service) {
        this.pizzaService = service;
    }

    @PostMapping()
    public Pizza createPizza(@RequestBody Pizza pizza) {
        return pizzaService.savePizza(pizza);
    }

    @GetMapping(params = "id")
    public Pizza getPizzaById(@RequestParam Long id) {
        return pizzaService.getPizza(id);
    }

    @GetMapping
    public List<Pizza> getAllPizzas() {
        return pizzaService.getAllPizzas();
    }



}
