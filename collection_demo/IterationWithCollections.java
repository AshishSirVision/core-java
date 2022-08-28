/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterationWithCollections {
  public static void main(String[] args) {
		 List<String> topCompanies = new ArrayList<String>();

	        // Check if an ArrayList is empty
	        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

	        topCompanies.add("Google");
	        topCompanies.add("Apple");
	        topCompanies.add("Microsoft");
	        topCompanies.add("Amazon");
	       
	        topCompanies.add("Facebook");
	        
	        
	   //     System.out.println(topCompanies);
	        //what is the return type of method
                //inside in which class method is available
//	       Iterator it=topCompanies.iterator();
//	       while(it.hasNext())
//	       {
//	       System.out.println(it.next());
//	       }
//	       
//	        
	        
///////////////////////////////////////////////////////////////////////////////	
                
            /**    
               ListIterator it=topCompanies.listIterator();
              int i=0;
	       while(it.hasNext())
	       {
                   if(i==topCompanies.size()-1)
                   {
                       it.add("somthing new");
                   }
                   i++;
	       System.out.println(it.next());
	       }
                **/
////////////////////////////////////////////////////////////////////////////////////////               
	     /*  ListIterator it=topCompanies.listIterator(topCompanies.size());
	       System.out.println(it.previous());
               System.out.println(it.previous());
               System.out.println(it.previous());
               System.out.println(it.previous());
               System.out.println(it.previous());
               */
////////////////////////////////////////////////////////////////////////////////////////////
               
	      
	        
	        
	        
///////////////////////////////  while loop///////////////////////////////////////////
	    /*    int i = 0;
	        while ( i < topCompanies.size()) {
                    System.out.println(topCompanies.get(i));
                    i++;
                }
	        */
	        
///////////////////////////////  for loop  ///////////////////////////////////////////
	    /*    for (int i = 0; i < topCompanies.size(); i++) {
				System.out.println(topCompanies.get(i));
			} 
	        
	        */

///////////////////////////////  for loop iterator ///////////////////////////////////////////                
          /*      for (Iterator i = topCompanies.iterator(); i.hasNext();) {
			
				System.out.println(i.next());
			}
                \8/
/////////////////////////////////////////////////////////////////////////////////////////////////	        
	    /*    Iterator it = topCompanies.iterator();
	        while (it.hasNext()) {
				String d = (String) it.next();	
				System.out.println(d);
			}
	        */
////////////////////////////////////////do while loop/////////////////////////////////////////////////////	        
	        Iterator it1 = topCompanies.iterator();
	        do {
				String d = (String) it1.next();	
				System.out.println(d);
			}while (it1.hasNext());
	        
	        
/////////////////////////////////////////////////////////////////////////////////////	        
	        //FOR EACH LOOP
	        for (String string : topCompanies) {
				System.out.println(string);
			}
//	        
////////////////////________`1.7////////////////////////////////////////////////////////////        
	   /*     Iterator it = topCompanies.iterator();
	        it.forEachRemaining((elem)->{
	        	System.out.println(elem);
	        });
	     */
////////////////////////////////////////////////////////////////////////////////////               
	        
	  /*      topCompanies.forEach((elem)->{
	        	System.out.println(elem);
	        });
                  */
	        
	        for (String elem : topCompanies) {
				System.out.println(elem);
			}
	 
                
}
}