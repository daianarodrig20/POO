import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private int numero;
	private Date fechaEntrega;
	private String cliente;

	private List<Articulo> articulos = new ArrayList<Articulo>();
	private List<Remito> remitos = new ArrayList<Remito>();

	public int getNumero(){
		return numero;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public Date getFechaEntrega(){
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega){
		this.fecha = fecha;
	}

	public void getCliente(String cliente){
		this.cliente = cliente;
	}
	public String setCliente(){
		return cliente;
	}

	public void agregarNuevoArticulo(Articulo a){
		articulos.add(a)
	}
}
