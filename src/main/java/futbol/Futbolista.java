package futbol;

public abstract class Futbolista implements Comparable{
	private String nombre;
	private String posicion;
	private int edad;
	

	public Futbolista() {
		this("Maradona",30,"delantero");
	}
	public Futbolista(String nombre,int edad,String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	public String toString() {
		String output = String.format("El futbolista %s tiene %d, y juega de %s", this.getNombre(),this.getEdad(),this.getPosicion());
		return output;
	}
	public boolean equals(Futbolista f) {
		if (this == f) {
			return true;
		}
		return false;
	}
	public abstract boolean jugarConLasManos();
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
