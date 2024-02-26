package org.ruralcamp;

public class FizzBuzz {

    public void play() {
        for( int i = 1; i< 101; i++) {
            System.out.println(playNumber(i));
        }
    }

    public static void main(String[] args) {
        var juego = new FizzBuzz();
        juego.play();
    }

    public String playNumber(Integer number) {
        if (isMultipleOfFive(number) && isMultipleOfThree(number)) {
            return "FizzBuzz";
        }

        if (isMultipleOfThree(number)) {
            return "Fizz";
        }

        if (isMultipleOfFive(number)) {
            return "Buzz";
        }

        
        return number.toString();
    }

    private boolean isMultipleOfFive(Integer n) {
        return n % 5 == 0;
    }

    private Boolean isMultipleOfThree(Integer n) {
        return n % 3 == 0;
    }
}