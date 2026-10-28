public class Main {

   public static void main(String []args) {
   
      int z = Math.abs(-45);
      System.out.println(z);
      
      double y = (int) Math.abs(-75.5);
      System.out.println(y);

      /* POWER METHOD
      Double Math.pow(double base, double power
      */
      double base = 3;
      double power = 4;
      double result = Math.pow(base,power);
      System.out.println(result);

      // WE can reset these functions together
      double combined = Math.pow(5, Math.abs(-3));

      /* SQUARE ROOT
      double Math.sqrt (double x)
      */
     //postive number
     double pos = Math.sqrt(5);
     System.out.println(pos);

     // What if we gave a negative number
     double neg = Math.sqrt(-16);
     System.out.println(neg);
     // NAN means "not a number"

     /* RANDOM METHOD
     double Math.random() 
     gives us a random number between 0.0 and 1.0 NOT INCLUSIVE
      */
     double rand = Math.random();
     System.out.println(rand);

     /*FORMULA FOR CHANGE IN RANGE 
     (int)(Math.random()*range) + min moves the random number into a range starting from a minimum number.
     The range of possible values is: (max - min + 1).
     */ 
    double other_rand = (int) (Math.random() * 9) + 1;
    System.out.println(other_rand);



    // testing out our pizza object
    // initalize an object from our class
    Pizza firstPizza = new Pizza();
    System.out.println(firstPizza.isBaked);
   
   }

}
