public class FiguraGeometrica{

private String nombre;
private double area;
private double perimetro;



public FiguraGeometrica(String nombre){

    this.nombre = nombre;
 }

public FiguraGeometrica(String nombre,double area){

    this.nombre = nombre;

    this.area = area;
}

 public String getNombre() {

    return nombre;

}

 public void setNombre(String nombre) {

     this.nombre = nombre;
 }



 public double getArea() {

     return area;

 }



 public void setArea(double area) {

     this.area = area;

 }



 public double getPerimetro() {

     return perimetro;

 }



 public void setPerimetro(double perimetro) {

     this.perimetro = perimetro;

 }

 

 

 //

 @Override

 public String toString() {

    return "FiguraGeometrica [nombre=" + nombre + ", area=" + area + ", perimetro=" + perimetro + "]";

 }

}