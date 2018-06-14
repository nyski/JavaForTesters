package domainentites;

public class User
{
   private String username; //field
   private String password; //field

   public User(){
     this("username", "password");
   }

   public User(String username, String password)
   {
      this.username = username;
      setPassword(password);
   }

   public String getUsername()
   {
      return username;
   }

   public String getPassword()
   {
      return password;
   }

   public void setPassword(String password)
   {
      if (password.length()<7){
         throw new IllegalArgumentException("Password must be > 6 chars");

      }

      this.password = password;
   }
}

