public class Cercle{
   private Point centre;
   private double rayon;
   public Cercle(int x,int y,double rayon){
     this.centre=new Point(x,y);
     this.rayon=rayon;
   }
   public Cercle(Point p,double rayon){
     this.centre=p;
     this.rayon=rayon;
   }
   public void deplacer(int dx,int dy){
   centre.deplacer(dx,dy);
   }
   public void setCentre(Point Centre){  
   this.centre=centre;
   }
   public void setRayon (double rayon){
   this.rayon=rayon;
   }
   public Point getCentre (){
   return centre;
   }
   public double getRayon (){
   return rayon;
   }
   public void afficher(){
   System.out.println("le centre est du cercle: ");
   centre.afficher();
   System.out.println("le rayon du cercle  : "+rayon);
   }
}  
   
