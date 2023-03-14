public class Point {
   private int x;
   private int y;
   private static int nbrPoints=0;

   public Point (int x, int y) {
      this.x = x;
      this.y = y;
      nbrPoints ++;
    
   }

   public Point() {

   }

   public int getX() {
      return x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int getY() {
      return y;
   }

   public void setY(int y) {
      this.y = y;
   }

   public void deplacer(int dx, int dy) {
      x = x + dx;
      y = y + dy;
   }

   public void afficher() {
      System.out.println("(" + x + "," + y + ")");
   }
   public static int getNbrPoints()
   {
   return nbrPoints;
}

}

