package com.javafortesters.junit.chap003;

import static java.lang.Integer.toHexString;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerExamplesTest
{
   @Test
   public void integerExploration(){
      Integer four = new Integer(4);
      assertEquals("intValue return 4", 4, four.intValue());
   }

   @Test
   public void integerStringConstructor(){
      Integer five = new Integer("5");
      assertEquals("intValue return 5", 5, five.intValue());
   }

   @Test
   public void elevenToB(){
      int integer = 11;
      assertEquals("Integer become b","b", toHexString(integer));
      //assertEquals("Integer become b",3, toHexString(integer));
      assertEquals("MIX_VALUE is -2147483648", -2147483648, Integer.MIN_VALUE);
   }


}
