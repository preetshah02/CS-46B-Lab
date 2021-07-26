public class Pet
{
    enum PetType {
        DOG,
        CAT,
        BIRD,
        HAMSTER,
        SNAKE,
        FISH,
        LIZARD,
        TURTLE,
        HORSE,
        SPIDER,
        WOLF,
        TIGER,
        DUCK,
        DOLPHIN,
        OTHER 
    }

    private String  name;
    private PetType type;

    public Pet(String petName, PetType petType) {
        /* Using the "this" reference, assign the class variables */
        this.name = petName;
        this.type = petType;
    }

    public String getName() {
        return this.name;
    }

    public PetType getPetType() {
        return this.type;
    }

    public static PetType getPetType(int value) {
        switch(value) {
            case 0:
                return PetType.DOG;
            case 1:
                return PetType.CAT;
            case 2:
                return PetType.BIRD;
            case 3:
                return PetType.HAMSTER;
            case 4:
                return PetType.SNAKE;
            case 5:
                return PetType.FISH;
            case 6:
                return PetType.LIZARD;
            case 7:
                return PetType.TURTLE;
            case 8:
                return PetType.HORSE;
            case 9:
                return PetType.SPIDER;
            case 10:
                return PetType.WOLF;
            case 11:
                return PetType.TIGER;
            case 12:
                return PetType.DUCK;
            case 13:
                return PetType.DOLPHIN;
            default:
                return PetType.OTHER;
        }
    }
}
