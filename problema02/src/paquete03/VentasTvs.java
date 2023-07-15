package paquete03;
import java.util.ArrayList;
import paquete01.Televisor;

public class VentasTvs {
    ArrayList<Televisor> televisores;
    public VentasTvs(ArrayList<Televisor> televisores) {
        this.televisores = televisores;
    }

    public double establecerPrecioTotal(){
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();
        }
        return s;
    }
    public double televisorMasCaro(){
        double s = televisores.get(0).obtenerPrecio();
        for (int i = 1; i < televisores.size(); i++) {
            if (televisores.get(i).obtenerPrecio() > s) {
                s = televisores.get(i).obtenerPrecio();
            }
        }
        return s;
    }
}