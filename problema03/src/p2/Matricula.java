package p2;

public abstract class Matricula {

    private double tarifa;

    public Matricula() {
    }

    public Matricula(double tarifa) {
        this.tarifa = tarifa;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public double getTarifa() {
        return tarifa;
    }
    public abstract void calcularTarifa();

    @Override
    public String toString() {
        return "Matricula{" + "tarifa=" + tarifa + '}';
    }

}