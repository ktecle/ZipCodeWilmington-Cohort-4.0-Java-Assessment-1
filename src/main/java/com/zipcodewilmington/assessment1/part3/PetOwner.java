package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {


    String owner;
    Map<String, ArrayList<Pet>>petOwner;
    ArrayList<Pet>pet = new ArrayList<>();
    Pet[]pets;

    public PetOwner(){
        this.petOwner = new TreeMap<String,ArrayList<Pet>>();
    }


    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */


    public PetOwner(String name, Pet... pets) {
        this.pets=pets;
        this.owner = name;



    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pets = Arrays.copyOf(pets,pets.length+1);
        pets[pets.length-1]=pet;

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        Pet[]petsRemaining = new Pet[0];
        int petsRemainingIndex=0;
        for (int i=0;i<pets.length;i++) {

            if(!pets[i].equals(pet)){
                petsRemaining=Arrays.copyOf(petsRemaining,petsRemaining.length+1);
                petsRemaining[petsRemainingIndex]=pets[i];
                petsRemainingIndex++;
            }
        }
        pets = petsRemaining;

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        return null;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngest = pets[0].getAge();
        for (Pet youngestPet:pets) {
            if(youngestPet.getAge()<youngest){
                youngest=youngestPet.getAge();
            }
        }
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest = pets[0].getAge();
        for (Pet oldestPet:pets)
        {
            if(oldestPet.getAge()>oldest){
                oldest=oldestPet.getAge();
            }

        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float sum = 0F;
        for (Pet petsInArray:pets) {
            sum+=petsInArray.getAge();
        }
        return sum/pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.owner;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
