//account class
// ayanda phaketsi
// phkaya003

import java.util.*;

class account
{
   private String name; // user name
   private String description; // user description
   public List<Post> posts = new ArrayList<>();// list of all post user has posted
     
   public account(String Name , String bio)// creates a new acount instance using and and bio which is the description.
   {
      name =Name;
      description= bio;
                    
   }
   public void addpost(String post)// adds a post  to the posts array list. 
   {
      posts.add(new Post(post));
   }

   public String allPosts() 
   {   
   /* 
      checks when array list is zero 
      if it is zero return "There are no posts to display for this account yet."
      else use a for each loop intarates of over each post .
   */
      if (this.posts.size()==0)
      {
         return "There are no posts to display for this account yet.";}
      else
      {
         String POSTS = "";
         for (Post post:posts)
         {  
            //make like string of all user post
            POSTS=post.toString() +POSTS;
         
         }
         return POSTS;
      }
   }
   public String toString()
   {
      return name;//rerturn account name
   }
   public void printAccount()
   {
     // prints out account information (name and description)
      System.out.println( "Enter the account name:" + this.name +"\nThe profile description is:"+ this.description);      
   }
      
}