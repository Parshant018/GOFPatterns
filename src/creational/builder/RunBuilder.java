package creational.builder;

public class RunBuilder {

    public void run() {
        House house = new House.HouseBuilder("wood", "cement", "tile")
                .setHasGarden(true)
                .setHasSwimminPool(true)
                .build();
        System.out.println(house);
    }
}
