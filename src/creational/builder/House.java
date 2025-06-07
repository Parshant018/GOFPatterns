package creational.builder;

public class House {

    private String foundation;
    private String roof;
    private String floor;
    private boolean hasGarden;
    private boolean hasSwimmingPool;

    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.roof = builder.roof;
        this.floor = builder.floor;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    public String toString() {
        return "House (" + this.foundation + "," + this.roof + "," + this.floor +
                "," + this.hasGarden + "," + this.hasSwimmingPool + ")";
    }

    public static class HouseBuilder {
        private String foundation;
        private String roof;
        private String floor;
        private boolean hasGarden;
        private boolean hasSwimmingPool;

        public HouseBuilder(String foundation, String roof, String floor) {
            this.foundation = foundation;
            this.roof = roof;
            this.floor = floor;
        }

        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setHasSwimminPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
