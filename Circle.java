package Hinh;
public class Circle {
   double radius;
   String color;
   public Circle(double radius,String color){
       this.radius=radius;
       this.color=color;
   }
   public double getradius(){
       return radius;
   }
   public void setradius(double radius){
       this.radius=radius;
   }
   public String getcolor(){
       return color;
   }
   public void setcolor(String color){
       this.color=color;
   }
   public Double getarea(){
       return null;
   }

    @Override
    public String toString() {
        return this.radius+"and"+this.color;
    }
    public class Cylinder extends Circle{
    private double height;

        public Cylinder(double radius, String color double ) {
            super(radius, color);
        }
  
    public double getheight(){
        return height;
    }
    public void setheight(double height){
        this.height=height;
    }
    public double getvolume(){
        double volume = 0;
        return volume ;
    }

    @Override
    public String toString() {
        return this.radius+"and"+this.color+"and"+this.height;
    
}   }
}

   

