package org.factoriaf5;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

public class AppTest 
{
    static App app = new App();
    @Test
    public void deberiaDevolverFizz()
    {
        assertThat(app.fizzBuzz(3), is("Fizz"));
        assertThat(app.fizzBuzz(13), is("Fizz"));
    }

    @Test
    public void deberiaDevolverBuzz()
    {
        assertThat(app.fizzBuzz(5), is("Buzz"));
        assertThat(app.fizzBuzz(52), is("Buzz"));
    }

    @Test
    public void deberiaDevolverFizzBuzz()
    {
        assertThat(app.fizzBuzz(15), is("FizzBuzz"));
        assertThat(app.fizzBuzz(51), is("FizzBuzz"));
        assertThat(app.fizzBuzz(35), is("FizzBuzz"));
        assertThat(app.fizzBuzz(353), is("FizzBuzz"));
    }

    @Test
    public void deberiaDevolverElParametroComoString()
    {
        assertThat(app.fizzBuzz(11), is("11"));
    }
}
