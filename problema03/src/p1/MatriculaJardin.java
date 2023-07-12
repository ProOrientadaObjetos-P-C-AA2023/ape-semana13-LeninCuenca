
package p1;

import p2.Matricula;

public class MatriculaJardin extends Matricula{

    public MatriculaJardin() {
    }

    public MatriculaJardin(double tarifa) {
        super(tarifa);
    }

    @Override
    public void calcularTarifa() {
        // tarifa = costo desayunos + costo libros + costo paseos
        double tarifa = 50.2 + 140.2 + 40;
        super.setTarifa(tarifa);
    }

}