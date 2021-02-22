
public class Bicho {
	
	private TipoAnimal tipoAnimal;
	private TipoAnimal Animal;
	@Override
	public String toString() {
		return "Animal [tipoAnimal=" + tipoAnimal + ", Animal=" + Animal + "]";
	}

	public Bicho(){
		super();
		// TODO Auto-generated constructor stub
	}
	public Bicho(TipoAnimal tipoAnimal){
		super();
		this.tipoAnimal= tipoAnimal;
		
	}
	public TipoAnimal getTipoAnimal(){
		return tipoAnimal;
	}
	public void setTipoAnimal(TipoAnimal tipoAnimal){
		this.tipoAnimal = tipoAnimal;
	}
	public static String imprimeAve() {
		return "Ave";
	}
	public static String imprimeMamifero() {
		return "Mamifero";
	}
}
