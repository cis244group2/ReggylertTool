package applicationReggylerTool_V2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class KeywordSearch_RT 
{
   public static void main(String[] args) throws IOException 
   {
      File f1=new File("input.txt"); //Creation of File Descriptor for input file
      String[] words=null;  //Initialize the word Array - ALIGN THIS TO WORDS ENTERED BY USER
      FileReader fr = new FileReader(f1);  //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
      String s;     
      String input="Java";   // Input word to be searched
      int count=0;   
      while((s=br.readLine())!=null)   //Reading Content from the file
      {
         words=s.split(" ");  //Split the word using space
          for (String word : words) 
          {
                 if (word.equals(input))   //Search for the given word
                 {
                   count++;    //If Present increase the count by one
                   				
                 }
          }
      }
      if(count!=0)  //Check for count not equal to zero
      {
         System.out.println("The given keyword is present for "+count+ " Times in the file");
         // ADD CODE FOR ENTERING SEARCH FOUND INTO DATABASE AND SENDING NOTIFICATION HERE
      }
      else
      {
         System.out.println("The given keyword is not present in the file");
      }
      
         fr.close();
   }
}