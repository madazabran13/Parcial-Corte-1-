
/**
 *
 * @author Miguel Andrés
 */
public class Pedido {
    private int numpedido;
    private int nmesa;
    private String descripcion;
    private double costo;
    private int nmaxpedido;

    public Pedido(int numpedido, String descripcion, double costo, int nmaxpedido) {
        this.numpedido = numpedido;
        this.descripcion = descripcion;
        this.costo = costo;
        this.nmaxpedido = nmaxpedido;
       
    }

    public Pedido(int numpedido, int nmesa, String descripcion, double costo, int nmaxpedido) {
        this.numpedido = numpedido;
        this.nmesa = nmesa;
        this.descripcion = descripcion;
        this.costo = costo;
        this.nmaxpedido = nmaxpedido;
    }

    public int getNumpedido() {
        return numpedido;
    }

    public void setNumpedido(int numpedido) {
        this.numpedido = numpedido;
    }

    public int getNmesa() {
        return nmesa;
    }

    public void setNmesa(int nmesa) {
        this.nmesa = nmesa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getNmaxpedido() {
        return nmaxpedido;
    }

    public void setNmaxpedido(int nmaxpedido) {
        this.nmaxpedido = nmaxpedido;
    }
    
    
    
    
}
