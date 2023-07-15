package paquete02;

import java.util.ArrayList;
import paquete01.Televisor;
import paquete03.VentasTvs;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Televisor> tvs = new ArrayList<>();
        tvs.add(new Televisor("LG-14 pulgadas",300.2));
        tvs.add(new Televisor("SAMSUMG-21 pulgadas",1300.2));
        tvs.add(new Televisor("RIVIERA-29 pulgadas",2300.5));
        System.out.println("-----------------");
        for (Televisor televisor: tvs){
            System.out.println(televisor);
        }
        System.out.printf("Precio Total: %.2f\n", new VentasTvs(tvs).establecerPrecioTotal());
        System.out.println("Precio mas caro: "+ new VentasTvs(tvs).televisorMasCaro());
        System.out.println("-----------------");
    }
}
