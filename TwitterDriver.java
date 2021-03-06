/**
 * Twitter Driver and Client
**/
import twitter4j.TwitterException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

   public class TwitterDriver
   {
      private static PrintStream consolePrint;
   
      public static void main (String []args) throws TwitterException, IOException
      {
         // set up classpath and properties file
             
         Twitterer bigBird = new Twitterer(consolePrint);

         // Problem 1         
         // Create and set a String called message here
      
         String message = "This is a test of Twitter APIs using Twitter4j in Java.";
         // bigBird.tweetOut(message);

         // Problem 2
         // Choose a public Twitter user's handle
         // and analyze their tweets
         
   
         Scanner scan = new Scanner(System.in);
         System.out.print("Please enter a Twitter handle, do not include the '@' symbol (or 'done' to quit.)\n");
         String twitter_handle = scan.next();
         while (!"done".equals(twitter_handle))
         {
            bigBird.queryHandle(twitter_handle);
            System.out.print("Please enter a Twitter handle, do not include the '@' symbol (or 'done' to quit.)\n");
            twitter_handle = scan.next();
             
         }
         
         // Problem 3
         System.out.println("Enter a term you want to search for: ");
         String searchTerm = scan.next();
         bigBird.saQuery(searchTerm);

      }//main         
         
   }//class    
         
   