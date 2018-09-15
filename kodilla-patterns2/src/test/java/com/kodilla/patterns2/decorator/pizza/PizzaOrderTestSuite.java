package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15), cost);

    }

    @Test
    public void testBasicPizzaOrderGetIngredients() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String ingredients = pizzaOrder.getIngredients();

        //Then
        assertEquals("Pizza ingredients: dough, tomato sauce, cheese", ingredients);
    }

    @Test
    public void testPizzaWithBaconGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(19), cost);
    }

    @Test
    public void testPizzaWithBaconGetIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);

        //When
        String ingredients = pizzaOrder.getIngredients();

        //Then
        assertEquals("Pizza ingredients: dough, tomato sauce, cheese, bacon", ingredients);

    }

    @Test
    public void testPizzaWithAllIngredientsGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(30), cost);
    }

    @Test
    public void testPizzaWithAllIngredientsGetIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);

        //When
        String ingredients = pizzaOrder.getIngredients();

        //Then
        assertEquals("Pizza ingredients: dough, tomato sauce, cheese, bacon, mushrooms, ham, extra cheese", ingredients);
    }
}
