
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
   public BufferedReader file =null;
   private FileReader open=null;
   public String privousname;
   public BinarySearchTree AccountBST = new BinarySearchTree ();     
   public fileReader()
   {
     // creates an object of the filereader class.
   }

   public void Instance(String name)
   {  
      //makes an instance of the open and file instance variable
      try // checks if file name (name) exists in directory
      {
         open=new FileReader(name);
         file= new BufferedReader(open);
      } 
      catch (IOException e)
      {
         System.out.print("No such file in directory ");}//tells user that the file does not exist .
     
   }
   
   public void runInstance()
   {
      String line;
      try {
         while ((line = file.readLine()) != null)// if there is a line in the file.
         {
            String sub1= line.substring(0,line.indexOf(" "));//gets key from the line of the file key can be(Create or Add)
            String sub2=line.substring(line.indexOf(" ")+1,line.length());//makes substring without the key
            String sub3=sub2.substring(0,sub2.indexOf(" "));//gets names from sub2
            String sub4=sub2.substring(sub2.indexOf(" ")+1); //get remain infomtion from sub2 can be a(post or bio)  
            if (sub1.equals("Create"))// check if sub1 is create
            {
               AccountBST.insert(new account(sub3,sub4));//insert new account of name=sub3 and bio=sub4 into binary search tree 
            }
            else if (sub1.equals("Add"))//checks if sub1 is add
            {  
               if (AccountBST.find(new account(sub3,""))!=null) // checks whether account name =sub3 is in binary tree
               {
                  AccountBST.find(new account(sub3,"")).data.addpost(sub4);}  /// if account exists a new post=sub4 is added for that account             }
            }
         }}
      catch(IOException e)
      {
          System.out.print("No such file file in directory");
      }
   }
   

}