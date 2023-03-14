public class Test1 {
     public static void main (String[] args){
      int x; 
      int y;
      x=Integer.parseInt(args[0]);
      y=Integer.parseInt(args[1]); 
      Point p1 = new Point (x,y); 
      p1.afficher();
}}
