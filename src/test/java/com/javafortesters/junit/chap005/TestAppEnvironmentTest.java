package com.javafortesters.junit.chap005;

import static org.junit.Assert.assertEquals;
import dominobject.TestAppEnv;
import org.junit.Test;

public class TestAppEnvironmentTest
{
   @Test
   public void canGetUrlStatically()
   {
      assertEquals("Returns Hard Coded URL",
            "http://192.123.0.3:67",
            TestAppEnv.getUrl());
   }

   @Test
   public void canGetDomainAndPorstStatically()
   {
      assertEquals("Just the domain", "192.123.0.3", TestAppEnv.DOMAIN);
      assertEquals("just the port", "67", TestAppEnv.PORT);
   }
}
