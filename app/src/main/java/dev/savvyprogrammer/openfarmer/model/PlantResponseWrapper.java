package dev.savvyprogrammer.openfarmer.model;

import java.util.List;

public class PlantResponseWrapper {

    private List<Plant> plantList;

    public PlantResponseWrapper(List<Plant> plantList) {
        this.plantList = plantList;
    }

    public List<Plant> getPlantList() {
        return plantList;
    }
}
