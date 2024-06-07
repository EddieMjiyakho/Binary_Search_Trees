// Toktik main file
// ayanda phaketsi
// phkaya003

import java.io.*;
import java.util.*;
class TokTik
{
   public static void main(String ... args)
   {
   
      fileReader FR = new fileReader();
   
      while(true)
      {
         Scanner input =new Scanner(System.in);
         System.out.println(   "\n1. Find the profile description for a given account"+
                               "\n2. List all accounts"+
                               "\n3. Create an account"+
                               "\n4. Delete an account"+
                               "\n5. Display all posts for a single account"+
                               "\n6. Add a new post for an account"+
                               "\n7. Load a file of actions from disk and process this"+
                               "\n8. most liked post of account"+
                               "\n9. Account followers"+
                               "\n10. List account followers"+
                               "\n11. Quit"
                               );
            
         System.out.print("Enter your choice:");
         String userValue=input.nextLine();
            
         if(userValue.equals("1"))// if option entered is 1
         {   
          /*
            check if the  root has initiated yet
            if root has not been initiated  tell user the accounts yet
            else Prompts  user to enter account name 
            checks account name exists 
            if account prints out acount description
            
         */
            if (FR.AccountBST.root==null){System.out.println("The are no accounts yet.");}
            
            else{
               System.out.println("Enter Acount:");
               userValue=input.nextLine();
               if ( FR.AccountBST.find(new account(userValue,""))!=null)
               {
                  account user=FR.AccountBST.find(new account(userValue,"")).data;
                  user.printAccount();
               }
               else
               {System.out.println("The acount you have enter does not exist.");}
            }
         }
         else if (userValue.equals("2")) //if option entered is 2
         {
            if ((FR.AccountBST.root!=null) )
            {FR.AccountBST.preOrder();} //checks if root is null  before before printing the accounts
            else{System.out.println("The are no accounts yet." );}//else the root is null  mean there are no accounts in binary tree
         }
            
         else if (userValue.equals("3"))// if option entered is 3
         {
            // asks use for account name and destription and creates a new account//
            System.out.println("Enter the Acount name:"); 
            userValue=input.nextLine();
            System.out.println("Enter Account description:");
            String userValue2=input.nextLine();
            if(FR.AccountBST.find(new account(userValue,""))==null)
            {
               FR.AccountBST.insert(new account(userValue,userValue2));
               FR.AccountBST.find(new account(userValue,""));}
            else{System.out.println("Acount name already exists");}
         }
         else if (userValue.equals("4"))// if option entered is 4
         {
            /* asks user for user name then checks if user the name entered is in the binary tree
               if the name is in the tree  the account is deleted
               else prints out does not exist
            */
            System.out.println("Enter the account name:");
            userValue=input.nextLine(); 
            if (FR.AccountBST.find(new account(userValue,""))!=null)
            {
               FR.AccountBST.delete(new account(userValue,""));
               System.out.println("Account has been deleted.\n");
            }
            else{System.out.println("The account name you entered does not exit");}
         }
            
         else if (userValue.equals("5"))// if option entered is 5
         {
            /**
             *prompts user to enter the acount their searching for
             *then checks if name is in the binary tree 
             *if it in the binarytree it prints all the post of the that account 
             *else it tells the user that "The Account name you entered does not exist".
             */
            System.out.println("Enter the Acount name:");
            userValue=input.nextLine();
               
            BinaryTreeNode user=FR.AccountBST.find(new account(userValue,""));
            if  (user != null)
            {
               System.out.println(user.data.allPosts());  
            }
            else{System.out.println("The Account name you entered does not exist.");}
            
         }
            
         else if (userValue.equals("6"))// if option entered is 6
         {
         /*
           prompts user to enter the the account they want to enter  post
           the checks if account is in the binary tree
           if account exists prompts user to enter title,video,and number likes
           else it tells user the account does not exist.
           
            
         */
            System.out.println("Enter the Acount name:");
            userValue=input.nextLine();
            BinaryTreeNode user=FR.AccountBST.find(new account(userValue,""));
            if (user!= null )
            { 
               System.out.println("Enter the Post Title:");
               String Title=input.nextLine();
               System.out.println("Enter video:");
               String video=input.nextLine();
               System.out.println("Enter post likes:");
               String likes=input.nextLine();
               
               user.data.addpost(video+" "+likes+" "+Title);
               System.out.print("Post has been added.\n");
            }
            else{System.out.println("User does not exist");}
         }
            
         else if (userValue.equals("7")) // if option entered is 7
         {
            /*
               Prompts user to enter thee name they want to load 
               check whether the is such file in the directory 
               if the file exist the file is proccessed by the FileReader class
               else FileReader class prints "no succh file in directory" 
            */
            System.out.println("Enter the file name:");
            userValue=input.nextLine();
            FR.Instance(userValue);
            if (FR.file!=null){
               FR.runInstance();
               System.out.println("file has been loaded.\n");
            }   
            
         }
         else if (userValue.equals("11"))// if option entered is 11
         { 
            break;// ends the program.
         }
        
                   
         else if(userValue.equals("8"))// if option entered is 8
         {   

               System.out.println("Enter Acount:");
               userValue=input.nextLine();
               if ( FR.AccountBST.find(new account(userValue,""))!=null)
               {
                  account user=FR.AccountBST.find(new account(userValue,"")).data;
                  Xtras x=new Xtras(FR.AccountBST);
                  System.out.println(x.mostLiked(user));
               }
               else
               {System.out.println("The acount you have enter does not exist.");}
           
         }
         else if(userValue.equals("9"))// if option entered is 9
         {   

               System.out.println("Enter Acount:");
               userValue=input.nextLine();
               if ( FR.AccountBST.find(new account(userValue,""))!=null)
               {
                  account user=FR.AccountBST.find(new account(userValue,"")).data;
                  Xtras x=new Xtras(FR.AccountBST);
                  System.out.println(x.followers(user));
               }
               else
               {System.out.println("The acount you have enter does not exist.");}
          }
         else if(userValue.equals("10"))// if option entered is 8
         {   

               System.out.println("Enter Acount:");
               userValue=input.nextLine();
               if ( FR.AccountBST.find(new account(userValue,""))!=null)
               {
                  account user=FR.AccountBST.find(new account(userValue,"")).data;
                  Xtras x=new Xtras(FR.AccountBST);
                  x.ListFollowers(user);
               }
               else
               {System.out.println("The acount you have enter does not exist.");}
           
         }         
         else{System.out.print("Please enter a valid input.\n");}
         
      }
        
      System.out.println("\n\n\nBye!");
        
   }

}