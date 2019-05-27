package pl.sda;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Pet> petPlaces;

    public Zoo() {
        this.petPlaces = new ArrayList<Pet>();
    }

    public void GiveHomelessPet(Pet pet){
        this.petPlaces.add(pet);
    }

    public void TakePet(Pet pet){
        this.petPlaces.remove(pet);
    }

    public String GetPetNames(){
        String aggregator = "";
        for (Pet pet:
                petPlaces) {
            aggregator += pet.getName();
        }

        return aggregator;
    }
}

