package builder;

public class Pizza {
    private String name;
    private Size size;
    private Dough dough;
    private boolean tomatoTopping;
    private boolean onionTooping;
    private boolean oliveTopping;
    private boolean mozzarelaTopping;
    private boolean pepperoniTopping;

    public void eat(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", dough=" + dough +
                ", tomatoTopping=" + tomatoTopping +
                ", onionTooping=" + onionTooping +
                ", oliveTopping=" + oliveTopping +
                ", mozzarelaTopping=" + mozzarelaTopping +
                ", pepperoniTopping=" + pepperoniTopping +
                '}';
    }

    public static class Builder {
        private Pizza pizza = new Pizza();

        public Pizza build()    {
            return this.pizza;
        }

        public Builder(String name) {
            pizza.name = name;
        }

        public Builder withSize(Size size)  {
            pizza.size = size;
            return this;
        }

        public Builder withBlat(Dough dough)  {
            pizza.dough = dough;
            return this;
        }

        public Builder withTomatoTopping(boolean topping) {
            pizza.tomatoTopping = topping;
            return this;
        }

        public Builder withOnionTopping(boolean topping) {
            pizza.onionTooping = topping;
            return this;
        }

        public Builder withOliveTopping(boolean topping) {
            pizza.oliveTopping = topping;
            return this;
        }

        public Builder withMozzarellaTopping(boolean topping) {
            pizza.mozzarelaTopping = topping;
            return this;
        }

        public Builder withPepperoniTopping(boolean topping) {
            pizza.pepperoniTopping = topping;
            return this;
        }
    }
}
