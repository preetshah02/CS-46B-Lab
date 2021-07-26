import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;

/* modify this class such that it becomes Iterable */
public class PetCollection implements Iterable<Pet>
{
    private HashSet<Pet> otherList;
    private HashSet<Pet> dogList;
    private HashSet<Pet> catList;
    private HashSet<Pet> birdList;
    private HashSet<Pet> wolfList;
    /* add three other pet lists here */
    /* these should be ArrayList types */

    public PetCollection() {
        /* add in the initialization of the above member collection types */
        /* uncomment the line below, and add in the other missing init lines */
        otherList = new HashSet<Pet>();
        dogList = new HashSet<Pet>();
        catList = new HashSet<Pet>(); 
        birdList = new HashSet<Pet>();
        wolfList = new HashSet<Pet>();
    }

    public Iterator<Pet> iterator() {
        /* uncomment the line below */
        return new PetListIterator();
    }

    /* Inner Iterator class */
    private class PetListIterator implements Iterator<Pet> {
        private int index;
        private ArrayList<Pet> allPets;

        public PetListIterator() {
            index = 0;
            allPets = combinedLists();
        }

        public boolean hasNext() {
            /* determine the logic to see if you have a next item               */
            /* Hint: There are two member variables in this inner class         */
            /*       Think about how you can use index to determine if you have */
            /*       more indices to go through                                 */
        	if (index + 1 < allPets.size())
        	{
        		return true;
        	}
        	return false;
        }

        public Pet next() {
            /* add code here so that you can get a single pet instance for the method */
            /* to return                                                              */
            /* Hint: notice the ArrayList member variable                             */
            Pet singlePet = null;
            if (hasNext() == true)
            {
            	index++;
            	singlePet = allPets.get(index);
            }
        	return singlePet; // returns a Pet object
        }

    }

    private ArrayList<Pet> combinedLists() {
        ArrayList<Pet> allPets = new ArrayList<Pet>();

        /* Look at the PetListIterator constructor in the inner class */
        /* You should notice that this is the only place where this method is called */
        /* TO DO: Look at the member variables at the very of the outer class. */
        /*        Only the dogList and otherList is declared. You need to add your new pets */
        /*        pet lists there as ArrayList types */
        allPets.addAll(dogList);

        /* add your three new pet lists to the allPets ArrayList */
        allPets.addAll(catList);
        allPets.addAll(birdList);
        allPets.addAll(wolfList);
        allPets.addAll(otherList);

        return allPets;
    }

    public void categorizePets(PetList pl) {
        for (Pet pt : pl) {
            if (pt.getPetType() == Pet.PetType.DOG) {
                dogList.add(pt);
            }
            else if (pt.getPetType() == Pet.PetType.CAT) {
                catList.add(pt);
            }
            else if (pt.getPetType() == Pet.PetType.BIRD) {
                birdList.add(pt);
            }
            else if (pt.getPetType() == Pet.PetType.WOLF) {
                wolfList.add(pt);
            }
            else {
                otherList.add(pt);
            }
        }
    }


}
