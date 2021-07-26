/* 
 * This is a pet list class with utility methods
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;
import java.util.List;
import java.util.Enumeration;
import java.util.Arrays;

class PetList extends ArrayList<Pet>
{
     private HashMap<Pet.PetType, Integer> typeMap;

     public PetList() {
         typeMap = new HashMap<Pet.PetType, Integer>();

         for (Pet.PetType petType : Pet.PetType.values()) {
             typeMap.put(petType, 0); // init map
         }
         System.out.println(typeMap);
     }

     public void addPet(Pet pt) {
         Integer value;

         this.add(pt);

         /* organize the pet list */
         switch(pt.getPetType()) { /* unqualified name from the enumeration is used only */
             case DOG:
             /* Add three other pet types here */
             case CAT:
             case BIRD:
             case WOLF:
                 value = typeMap.get(pt.getPetType()); 
                 typeMap.put(pt.getPetType(), value+1); // add number of occurrences so far
                 break;
             default:
                 value = typeMap.get(Pet.PetType.OTHER);
                 typeMap.put(Pet.PetType.OTHER, value+1); // add number of occurrences so far
                 break;
         }
     }

     public void showPetList() {
         for (Pet petItem : this) {
             System.out.println("Name: " + petItem.getName() + ", " + "type: " + petItem.getPetType().ordinal());
         }
     }

     public void showPetSummary() {
         System.out.println(typeMap);
     }
}
