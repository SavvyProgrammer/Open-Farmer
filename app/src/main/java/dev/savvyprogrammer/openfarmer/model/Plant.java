package dev.savvyprogrammer.openfarmer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Plant {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("optimal_sun")
    @Expose
    private String optimalSun;
    @SerializedName("optimal_soil")
    @Expose
    private String optimalSoil;
    @SerializedName("planting_considerations")
    @Expose
    private String plantingConsiderations;
    @SerializedName("when_to_plant")
    @Expose
    private String whenToPlant;
    @SerializedName("growing_from_seed")
    @Expose
    private String growingFromSeed;
    @SerializedName("transplanting")
    @Expose
    private String transplanting;
    @SerializedName("spacing")
    @Expose
    private String spacing;
    @SerializedName("watering")
    @Expose
    private String watering;
    @SerializedName("feeding")
    @Expose
    private String feeding;
    @SerializedName("other_care")
    @Expose
    private String otherCare;
    @SerializedName("diseases")
    @Expose
    private String diseases;
    @SerializedName("pests")
    @Expose
    private String pests;
    @SerializedName("harvesting")
    @Expose
    private String harvesting;
    @SerializedName("storage_use")
    @Expose
    private String storageUse;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOptimalSun() {
        return optimalSun;
    }

    public void setOptimalSun(String optimalSun) {
        this.optimalSun = optimalSun;
    }

    public String getOptimalSoil() {
        return optimalSoil;
    }

    public void setOptimalSoil(String optimalSoil) {
        this.optimalSoil = optimalSoil;
    }

    public String getPlantingConsiderations() {
        return plantingConsiderations;
    }

    public void setPlantingConsiderations(String plantingConsiderations) {
        this.plantingConsiderations = plantingConsiderations;
    }

    public String getWhenToPlant() {
        return whenToPlant;
    }

    public void setWhenToPlant(String whenToPlant) {
        this.whenToPlant = whenToPlant;
    }

    public String getGrowingFromSeed() {
        return growingFromSeed;
    }

    public void setGrowingFromSeed(String growingFromSeed) {
        this.growingFromSeed = growingFromSeed;
    }

    public String getTransplanting() {
        return transplanting;
    }

    public void setTransplanting(String transplanting) {
        this.transplanting = transplanting;
    }

    public String getSpacing() {
        return spacing;
    }

    public void setSpacing(String spacing) {
        this.spacing = spacing;
    }

    public String getWatering() {
        return watering;
    }

    public void setWatering(String watering) {
        this.watering = watering;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    public String getOtherCare() {
        return otherCare;
    }

    public void setOtherCare(String otherCare) {
        this.otherCare = otherCare;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getPests() {
        return pests;
    }

    public void setPests(String pests) {
        this.pests = pests;
    }

    public String getHarvesting() {
        return harvesting;
    }

    public void setHarvesting(String harvesting) {
        this.harvesting = harvesting;
    }

    public String getStorageUse() {
        return storageUse;
    }

    public void setStorageUse(String storageUse) {
        this.storageUse = storageUse;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}