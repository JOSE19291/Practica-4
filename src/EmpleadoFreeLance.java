public class EmpleadoFreeLance extends Empleado implements Beneficiable{

    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoFreeLance() {
    }

    public EmpleadoFreeLance(int horasTrabajadas, double tarifaHora,String nombre, String id, double  salarioBase) {
        super(nombre, id, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double calcularBonificacion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double aplicarDescuentoSeguro() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
