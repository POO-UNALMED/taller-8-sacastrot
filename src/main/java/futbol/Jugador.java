package futbol;

public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	public Jugador(String nombre,int edad,String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public int compareTo(Object i) {
		Jugador temp  = (Jugador) i;
		int difEdad = this.getEdad() - temp.getEdad();
		return difEdad;
	}
	public String toString() {
		String output = String.format("El futbolista %s tiene %d, y juega de %s con el dorsal %d. Ha marcado %d", this.getNombre(),this.getEdad(),this.getPosicion(),this.dorsal,this.golesMarcados);
		return output;
	}
	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}

}
