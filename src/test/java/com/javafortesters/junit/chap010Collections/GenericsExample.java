package com.javafortesters.junit.chap010Collections;

public class GenericsExample
{
   public class Box <T> {
      // T stands for "Type"
      private T t;

      public void set(T t) { this.t = t; }
      public T get() { return t; }
   }
}
