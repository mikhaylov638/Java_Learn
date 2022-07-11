package ru.stqa.sandbox.MyFirstProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {

    @Test
    public void testArea () {
        Square s = new Square(10);
        Assert.assertEquals(s.area(),100);
    }
}
