package dev.savvyprogrammer.openfarmer.model;


public class Crop {

    private final int cropImage;
    private final String text;

    public Crop(int cropImage, String text) {
        this.cropImage = cropImage;
        this.text = text;
    }

    public int getCropImage() {
        return cropImage;
    }

    public String getText() {
        return text;
    }


}
