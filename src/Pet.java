import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 */
public abstract class Pet {

    public enum Species {
        DOG, CAT, BIRD, OTHER
    }

    /**
     * The name of the Pet
     */
    private String name;

    /**
     * Species of the Pet
     *      Species is read-only (which has not setter)
     */
    private Species species;

    /**
     * Returns the name of the pet
     * @return the name string
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the pet
     * @param name   a new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the species of the pet
     * @return      a species enum
     */
    public Species getSpecies() {
        return species;
    }


    /**
     * Set the specie of the pet (visible only to )
     * @param species
     */
    protected void setSpecies(Species species) {
        this.species = species;
    }

    /**
     * Returns the sound of the pet
     * @return      a sound the pet would make
     */
    public void Say() {
        throw new NotImplementedException();
    }

    public abstract float VetAppointment();


}
