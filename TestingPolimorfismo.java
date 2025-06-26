public class TestingPolimorfismo {
    public static void main(String[] args){
        
        FiguraGeometrica unaFigura = new FiguraGeometrica("Hexágono");
        unaFigura.setArea(48.5);
        unaFigura.setPerimetro(12.9);
        System.out.println("Datos de una Figura: " + unaFigura.toString());

        FiguraGeometrica otraFigura = new FiguraGeometrica("Pentágono", 25.12);
        System.out.println("Datos de otra figura: " + otraFigura.toString());

        Triangulo triangulo1 = new Triangulo("Triángulo 1", 10.2, 15.8);
        System.out.println("Datos del triángulo 1: " + triangulo1.toString());
        System.out.println("Área del triángulo 1: " + triangulo1.getArea());
        double perimetro = triangulo1.getPerimetro();
        System.out.println("Perímetro del triángulo 1: " + perimetro);
        triangulo1.setPerimetro(perimetro);
        System.out.println("Datos actualizados del triángulo 1: " + triangulo1.toString());

        Triangulo baseTriangulo = new Triangulo("Triángulo Base", 10, 8); 
        PrismaTriangular prisma = new PrismaTriangular("Prisma Triangular", 15, baseTriangulo); 

        prisma.calcularAreaBase();    
        prisma.calcularVolumen();      

        System.out.println("Área de la base: " + prisma.getArea());
        System.out.println("Volumen del prisma: " + prisma.getVolumen());

}
}