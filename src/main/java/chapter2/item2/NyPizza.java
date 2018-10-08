package chapter2.item2;

import java.util.Objects;

import static chapter2.item2.NyPizza.Size.SMALL;

public class NyPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE};
    public final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    public static void main(String [] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(Topping.SAUSAGE).addTopping(Topping.ONION).build();
        System.out.println(pizza);
    }
}
