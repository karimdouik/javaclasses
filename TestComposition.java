public class TestComposition{ 
 public static void main(String [] args){
    //pour le premier constructeur
   Cercle cercle1 = new Cercle(3, 4, 5.0);
   //pour le Deuxieme constructeur
   Point centre = new Point(3, 4);
   double rayon = 5.0;
   Cercle cercle2 = new Cercle(centre, rayon);
   cercle1.afficher();
   cercle2.afficher();
  }
}
   
