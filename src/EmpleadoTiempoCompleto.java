public class EmpleadoTiempoCompleto extends Empleado implements Beneficiable{

    private int antiguedad;
    private String departamento;

    public EmpleadoTiempoCompleto() {
    }

    public EmpleadoTiempoCompleto(int antiguedad, String departamento, String nombre, String id, double  salarioBase) {
        super(nombre, id, salarioBase);
        this.antiguedad = antiguedad;
        this.departamento = departamento;
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

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
