package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}

	
	public int compareTo(Object i) {
		Portero temp  = (Portero) i;
		int difGoles = temp.golesRecibidos - this.golesRecibidos;
		return difGoles;
	}
	
	public String toString() {
		String output = String.format("El futbolista %s tiene %d, y juega de %s con el dorsal %d. Le han marcado %d", this.getNombre(),this.getEdad(),this.getPosicion(),this.dorsal,this.golesRecibidos);
		return output;
	}
	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return true;
	}
}
