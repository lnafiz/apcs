// Nafiz Labib
// APCS
// HW 08 - Refactor Freshie Zero
// 2021-10-01

public class Greet {

      public static void greet(String name){
       System.out.println("Why, hello there, " + name + ", how do you do?");
      }

      public static void main(String[] args){
          greet("Bob");
          greet("Tom");
          greet("Sally");
      }

  }

//Strangely enough, running the original program without any of today's changes doesn't work.
//I think it was because the class didn't match the file.
//Now I get a new error saying "Editor does not contain a main type"
//In a different file, I get an error with "Exception in thread "main" java.lang.Error: Unresolved compilation problem:" 
//Might be due to the platform I'm trying to test this on (Eclipse).

//Everything was fixed with some git pulling, code runs perfectly well now. Also, I used Git Bash instead, for simplicity.

