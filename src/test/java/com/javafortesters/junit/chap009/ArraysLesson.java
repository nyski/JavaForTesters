package com.javafortesters.junit.chap009;

import static org.junit.Assert.assertEquals;

import domainentites.User;
import org.junit.Test;
import java.util.Arrays;


public class ArraysLesson
{
   @Test
   public void simpleArrayExample()
   {
      String[] numbers0123 = { "zero", "one", "two", "three" };
      for (String numberText : numbers0123)
      {
         System.out.println(numberText);
      }
      assertEquals("zero", numbers0123[0]);
      assertEquals("three", numbers0123[3]);
   }

   @Test
   public void CreationArrayExample()
   {

      int[] array = new int[10];
      int[] array1 = { 1, 2, 10 };
      String[] workdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

      String days = "";
      for (String workday : workdays)
      {
         days = days + "|" + workday;
      }
      assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
   }

   @Test
   public void CreationArrayUsers()
   {
      String[] users = { "Muminek", "Migotka", "MałaMi" };

      for (String user : users)
      {
         user = user + " z krainy Muminków";
         System.out.println("User: " + user);
      }
   }

   // lasa user jest w domainentities import domainentites.User;
   @Test
   public void exerciseCreateAnArrayOf100Users()
   {
      User[] users = new User[100];

     for (int userIndex = 0; userIndex <100; userIndex ++){
        int userId = userIndex + 1;
        users[userIndex] =  new User("user" + userId, "password" + userId);
     }
      for (User aUser : users)
      {
         System.out.println(aUser.getUsername() +
               ", " +
               aUser.getPassword());
      }
   }

   @Test
   public void ArrayUsefulMethodes()
   {
      String[] users = { "Muminek", "Migotka", "MałaMi" };
      String [] mumins = Arrays.copyOf(users, 5);

      assertEquals(null, mumins[4]);

      mumins[3] = "TataMuminka";
      mumins[4] = "MamaMuminka";
      String [] muminsCrew = Arrays.copyOfRange(mumins,3,5);

      assertEquals("TataMuminka", mumins[3]);
      assertEquals(5, mumins.length);

      muminsCrew = Arrays.copyOfRange(mumins,2, 5);
      System.out.println("Mumins crew: " +muminsCrew);
   }

   @Test
   public void PopulateArrayWithData(){
   int[] liczby = new int [30];
   Arrays.fill(liczby,4,10,2);
   assertEquals(liczby[5], 2);
   }


}



