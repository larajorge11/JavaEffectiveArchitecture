package chapter2.item3;

public class Elvis {
   public static final Elvis INSTANCE = new Elvis();

   private Elvis() {

   }

   public static Elvis getInstance() {
       return INSTANCE;
   }

   private Object readResolve() {
       return INSTANCE;
   }
}

