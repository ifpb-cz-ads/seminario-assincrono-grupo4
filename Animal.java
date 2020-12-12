public enum Animal{
  GATO("Jennifer"), CACHORRO("Fagne"), PAPAGAIO("Camila"), PEIXE("Gorete"), HAMSTER("João"), CALOPSITA("Maria"), TARTARUGA("Fabricio");

  private String dono;

  Animal(String dono){
    this.dono = dono;
  }
  
  public String getDono(){
      return this.dono;
  }
}
