import java.util.Random;

class PetRunner 
{
     public static void main(String args[]) {
         int min = Pet.PetType.DOG.ordinal();
         int max = Pet.PetType.DOLPHIN.ordinal();
         final int MAX_PETS = 100;

         Random random = new Random();
         PetList pl = new PetList();        

         /**
          * Build pet list
          **/
         for(int ix=0; ix < MAX_PETS; ix++) {
             int petNumber = ix+1;
             String name = "Pet #" + petNumber;
             pl.addPet(new Pet(name, Pet.getPetType(random.nextInt(max - min) + min))); 
         }

         //pl.showPetList();

         /**
          * Create pet collection
          **/
         PetCollection pc = new PetCollection();
         pc.categorizePets(pl);

         PetList petListCombined = new PetList();
         for(Pet p : pc) {
             petListCombined.addPet(p);
         }

         //petListCombined.showPetList();
         petListCombined.showPetSummary();

     }
}
