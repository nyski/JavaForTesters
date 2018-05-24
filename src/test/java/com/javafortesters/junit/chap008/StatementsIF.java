package com.javafortesters.junit.chap008;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StatementsIF
{
   @Test
   public void moreTernary(){
      String url = "www.eviltester.com";

      url = url.startsWith("http") ? url : addHttp(url);

      assertTrue(url.startsWith("http://"));
      assertEquals("http://www.eviltester.com", url);
   }

   @Test
   public void ifAddHttp(){
      String url = "www.seleniumsimplified.com";

      if(!url.startsWith("http")){
         url = addHttp(url);
      }

      assertTrue(url.startsWith("http://"));
      assertEquals("http://www.seleniumsimplified.com", url);
   }

   @Test
   public void ifTruthyIsTrue(){
      boolean truthy = false;

      if(truthy) assertTrue(truthy); assertFalse(truthy);
   }


   private String addHttp(String url)
   {
     return "http://" + url ;
   }

   @Test
   public void ifElseAddHttp(){
      String url = "www.seleniumsimplified.com";
      if(url.startsWith("http")){
         // do nothing the url is fine
      }else{
         url = addHttp(url);
      }
      assertTrue(url.startsWith("http://"));
      assertEquals("http://www.seleniumsimplified.com", url);
   }

   @Test
   public void truthyIsTrue(){
      boolean truthy = false;

      if (truthy) assertTrue(truthy);
      else assertFalse(truthy);
   }

   @Test
   public void truthyIsTrue1(){
      boolean truthy = false;

      if (truthy) {
         assertTrue(truthy);
         assertFalse(!truthy);
         } else { assertFalse(truthy);
      }
   }

   @Test
   public void ifElseNestedAddHttp(){
      String url = "seleniumsimplified.com";
      if(url.startsWith("http")){
         // do nothing the url is fine
      }else{
         if(!url.startsWith("www")){
            url = "www." + url;
         }
         url = addHttp(url);
      }
      assertTrue(url.startsWith("http://"));
      assertEquals("http://www.seleniumsimplified.com", url);
   }
}
