package chapter2.item2;

public class Calzone extends Pizza {
    public final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    public static void main(String [] args) {
        Calzone calzone = new Calzone.Builder().addTopping(Topping.HAM).sauceInside().build();
    }
}
