package org.ruralcamp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzUnitTest {

    FizzBuzz juego = new FizzBuzz();

    @Test
    public void decir_un_numero() {

        assertThat(juego.playNumber(1), equalTo("1"));
        assertThat(juego.playNumber(17), equalTo("17"));
    }

    @Test
    @DisplayName("si le pasamos un múltiplo de tres, debe decir Fizz")
    public void multiples_of_three(){

        assertThat(juego.playNumber(3), equalTo("Fizz"));
        assertThat(juego.playNumber(12), equalTo("Fizz"));
    }

    @Test
    @DisplayName("si le pasamos un múltiplo de cinco, debe decir Buzz")
    public void multiples_of_five(){
        assertThat(juego.playNumber(5),equalTo("Buzz"));
    }

    @Test
    @DisplayName("si le pasamos un múltiplo de cinco y de tres, debe decir FizzBuzz")
    public void multiples_of_three_and_five(){
        assertThat(juego.playNumber(15),equalTo("FizzBuzz"));
    }

}
