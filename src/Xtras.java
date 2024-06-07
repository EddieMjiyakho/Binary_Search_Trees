// ayanda phaketsi
// phkaya003

import java.io.*;
import java.util.*;
class Xtras
{
   BinarySearchTree db;
   public Xtras(BinarySearchTree n)
   {
      db=n;
   }
   
   
   public Post mostLiked(account acc)
   {    Post p= null;
        if( db.find(acc) !=null)
        {   int n=0;
            for (Post P :db.find(acc).data.posts)
            {
               if (Integer.parseInt(P.likes)>n)
               {
                  p=P;
                  n=Integer.parseInt(P.likes);
               }
               
            }
        }
        return p;
   }
   
   public int followers(account acc)
   {
      return db.getSize(db.find(acc));
   }
   
   public void ListFollowers(account acc)
   {
      db.preOrder(db.find(acc).left);
      db.preOrder(db.find(acc).right);
   }
   
}