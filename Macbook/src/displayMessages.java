import java.io.*;
import java.util.*;

import com.ibm.as400.access.*;  

public class displayMessages extends Object
{

   public static void main(String[] parameters)  
   {
      displayMessages me = new displayMessages();
      me.Main(parameters);  

      System.exit(0);  
   } 


   void displayMessage()
   {
   }


   void Main(String[] parms)
   { 
	   try
	      {
	         AS400 system = new AS400();

	         if (parms.length > 0)
	            system.setSystemName(parms[0]);

	         MessageQueue queue = new MessageQueue(system, MessageQueue.CURRENT);  


	                  Enumeration e = queue.getMessages();  

	                  while (e.hasMoreElements())
	                  {

	                      QueuedMessage message = (QueuedMessage) e.nextElement();  
	                      System.out.println(message.getText()); 
	                   }
	              }
	              catch (Exception e)
	              {
	                 e.printStackTrace();
	              }
	         }
   }
