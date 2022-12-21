package CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (weight == 0 && engine.getDisplacement() == 0) {
            return String.format("%s:%n%s:%nPower: %s%nDisplacement: n/a%nEfficiency: %s%nWeight: n/a%nColor: %s",
                    model, engine.getModel(), engine.getPower(), engine.getEfficiency(), color);
        } else if (weight == 0 && engine.getDisplacement() != 0) {
            return String.format("%s:%n%s:%nPower: %s%nDisplacement: %d%nEfficiency: %s%nWeight: n/a%nColor: %s",
                    model, engine.getModel(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency(),
                    color);
        } else if (weight != 0 && engine.getDisplacement() == 0) {
            return String.format("%s:%n%s:%nPower: %s%nDisplacement: n/a%nEfficiency: %s%nWeight: %d%nColor: %s",
                    model, engine.getModel(), engine.getPower(), engine.getEfficiency(), weight, color);
        }
        return String.format("%s:%n%s:%nPower: %s%nDisplacement: %d%nEfficiency: %s%nWeight: %d%nColor: %s",
                model, engine.getModel(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency(), weight, color);
    }
}
