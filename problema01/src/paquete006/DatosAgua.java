package paquete006;


public class DatosAgua  {
    public DatosAgua() {}
    public static double[][] datosComerciales(){
        double[][] informacion = {
                {2.20, 100.2, 0.2},
                {2.30, 50.2, 0.4},
                {3.30, 100.3, 0.1},
        };
        return informacion;
    }

    public static double[][] datosCasas(){
        double[][] informacion = {
                {1.20, 80.2, 0.3},
                {1.40, 70.2, 0.3},
                {1.60, 90.3, 0.3},
        };
        return informacion;
    }

}