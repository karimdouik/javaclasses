public class Test2 {
   public static void main(String[] args) {
      Point p1, p2, p3, p4;
      p1 = new Point(3, 2);
      p3 = new Point(5, 10);
      p4 = new Point(5, 10);
      p2 = p1;
      p1.afficher();
      p2.afficher(); 
      System.out.println(p1 == p2);
      System.out.println(p3 == p4); 
      System.out.println(p1.equals(p2));
      System.out.println(p3.equals(p4));
      Point p5 = new Point();
      System.out.println(Point.getNbrPoints());
   }
}




