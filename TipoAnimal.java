
public enum TipoAnimal{
	AVE {
		@Override
		public String gerar() {
			// TODO Auto-generated method stub
			return Bicho.imprimeAve();
		}
	},MAMIFERO {
		@Override
		public String gerar() {
			// TODO Auto-generated method stub
			return Bicho.imprimeMamifero();
		}
	};
	public abstract String gerar();
}
