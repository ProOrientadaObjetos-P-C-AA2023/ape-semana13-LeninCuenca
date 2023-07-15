
package p1;
import p2.Matricula;

public class MatriculaCampamento extends Matricula{

    public MatriculaCampamento() {
    }

    public MatriculaCampamento(double tarifa) {
        super(tarifa);
    }

    @Override
    public void calcularTarifa() {
        double tarifa = 100.2 + 30.2 + 90.2;
        super.setTarifa(tarifa);
    }
}
