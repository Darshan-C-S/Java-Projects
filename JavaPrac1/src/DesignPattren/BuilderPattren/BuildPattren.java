package DesignPattren.BuilderPattren;

public class BuildPattren{
    public static void main(String[] args) {
        House house = new House.Builder()
                .setRoof("Big Roof")
                .setFoundation("Deep and strong Foundation")
                .setStructure("Strong and Beautiful structure")
                .setSwimmingPool(true)
                .build();

        System.out.println("The details of the house : "+house.toString());
    }
}
