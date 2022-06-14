import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double o = 0;
    double e = 0;
    double x = 0;
    double xX = 0;

    System.out.println("So you're too lazy to do this on your own? Well, don't worry. \nPlease enter the number of categories.");
    int cat = scan.nextInt();

    for (int i = 1; i <= cat; i++) {
      System.out.println("Please enter observed value #" + i);
      o = scan.nextDouble();
      System.out.println("Please enter expected value #" + i);
      e = scan.nextDouble();

      System.out.print("(o - e) = " + (o - e));
      System.out.print("\t(o - e)^2 = " + (Math.pow(o - e, 2)));
      System.out.println("\t(o - e)^2 / e = " + ((Math.pow(o - e, 2)) / e) + "\n");

      x = (Math.pow(o - e, 2)) / e;
      xX += x;
    }
    
    System.out.println("X^2 = " + xX);
  }
}
