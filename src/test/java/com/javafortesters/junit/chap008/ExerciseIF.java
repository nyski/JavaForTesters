package com.javafortesters.junit.chap008;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExerciseIF
{
   @Test
   public void truthyIsTrue1()
   {
      boolean truthy = false;
      boolean falsy = true;

      if (truthy)
      {

         if (!falsy)
         {
            if (truthy && !falsy)
            {
               if (falsy || truthy)
               {
                  assertFalse(falsy);
               }
            }
            assertTrue(truthy);
         }
         else
         {
            assertFalse(falsy);
         }
         assertTrue(truthy);
      }
      else
      {
         if (!truthy)
         {
            if (falsy)
            {
               assertTrue(falsy);
               assertFalse(truthy);
            }
            else
            {
               assertFalse(falsy);
               assertFalse(truthy);
            }
         }
      }
   }
}