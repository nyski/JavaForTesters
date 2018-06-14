package com.javafortesters.junit.chap010Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import domainentites.User;
import org.junit.Assert;
import org.junit.Test;

public class Lists
{
   @Test
   public void removeAnElementAtAnIndex()
   {

      List<String> days = new ArrayList<String>();

      days.add("Monday");
      days.add("Tuesday");
      days.add("Wednesday");

   }

   @Test
   public void Maps(){
      User user1 = new User("migotka","asd123");
      User user2 = new User("muminek","qwe123");
      User user3 = new User("Tatamuminka","qwe123");

      Map <String, User> usersGroup = new HashMap<>();
      usersGroup.put("key1",user1);
      usersGroup.put("key2", user2);
      usersGroup.put("key2", user3);

      Collection<User> values = usersGroup.values();
      Set<String> keys = usersGroup.keySet();

      Set<Map.Entry<String, User>> entries = usersGroup.entrySet();

      Assert.assertEquals(user3,usersGroup.get("key2"));

   }
}