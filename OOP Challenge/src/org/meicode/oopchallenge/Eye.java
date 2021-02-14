package org.meicode.oopchallenge;

public class Eye extends Organ{
    private String Color;
    private boolean isOpened;

    public Eye(String name, String medicalCondition, String color, boolean isOpened) {
        super(name, medicalCondition);
        Color = color;
        this.isOpened = isOpened;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.getColor());
        System.out.println(this.getName() + "Opened");
    }
    public void open(){
        this.setOpened(true);

    }
    public void close (){
        this.setOpened(false);
        System.out.println(this.getName() + " Closed");
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}
