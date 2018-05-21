package com.javafortesters.junit.chap003;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyFirstTest
{
   @Test
   public void Summ(){

      int answer = 2+2;
      assertEquals("2+2=4", 4, answer);
   }
}
