package com.javafortesters.junit.chap010Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import domainentites.User;
import org.junit.Assert;
import org.junit.Test;

public class Collections
{
   @Test
   public void simpleCollectionExample()
   {
      String[] numbers0123Array = { "zero", "one", "two", "three" };
      List<String> numbers0123 = Arrays.asList(numbers0123Array);
      for (String numberText : numbers0123)
      {
         System.out.println(numberText);
      }
      assertEquals("zero", numbers0123.get(0));
      assertEquals("three", numbers0123.get(3));
   }

   @Test
   public void simpleDynamicCollectionExample()
   {
      List<String> numbers0123 = new ArrayList<String>();
      numbers0123.add("zero");
      numbers0123.add("one");
      numbers0123.add("two");
      numbers0123.add("three");
      for (String numberText : numbers0123)
      {
         System.out.println(numberText);
      }
      assertEquals("zero", numbers0123.get(0));
      assertEquals("three", numbers0123.get(3));
   }

   @Test
   public void LoopsConfirmation()
   {
      String[] someDays = { "Tuesday", "Thursday", "Wednesday", "Monday", "Saturday", "Sunday", "Friday" };
      List<String> days = Arrays.asList(someDays);

      int count = 0;
      while (!days.get(count).equals("Monday"))
      {
         count++;
      }
      assertEquals("Monday is at position 3", 3, count);

      int doCounter = -1;
      do
      {
         doCounter++;
      }
      while (!days.get(count).equals("Monday"));
   }

   @Test
   public void useAForLoopInsteadOfAWhile()
   {

      String[] someDays = { "Tuesday", "Thursday", "Friday",
            "Wednesday", "Monday",
            "Saturday", "Sunday",
            "Monday" };

      List<String> days = Arrays.asList(someDays);

      int forwhile;
      for (forwhile = 0; !days.get(forwhile).equals("Monday"); forwhile++)
      {
      }
      assertEquals("Monday is at position 4", 4, forwhile);
   }

   @Test
   public void Collection()
   {
      Collection <String> workdays = new <String> ArrayList();
      Collection <String> daysOff = new <String> ArrayList();


      workdays.add("Monday");
      workdays.add("Tuesday");
      workdays.add("Wednesday");
      workdays.add("Thursday");
      workdays.add("Friday");

      daysOff.addAll(workdays);

      Object [] daysOfWeekArray = workdays.toArray();
   }

   @Test
   public void CollectionExercise(){

      Collection<User> users = new <User> ArrayList();
      Assert.assertTrue(users.isEmpty()); assertEquals(0,users.size());
      User bob = new User("bob", "Passw0rd");
      User eris = new User("eris", "Cha0sTime");
      users.add(bob); users.add(eris);
      Assert.assertFalse(users.isEmpty()); assertEquals(2,users.size());

      Collection<User> usersNext = new <User> ArrayList();
      User burt = new User("burt", "wd123s");
      User tanzou = new User("tanzou", "tibet");
      usersNext.add(burt); usersNext.add(tanzou);

      usersNext.addAll(users);
      assertTrue(usersNext.containsAll(users));
      assertEquals(4,usersNext.size());




   }
}
