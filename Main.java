class Main {
  public static void main(String[] args) {

      Animal seuDono = Animal.CACHORRO;

      System.out.println(seuDono.name() + " é o animal de " + seuDono.getDono());

      // usandoEnum();
  }

//   static void usandoEnum(){
//     Animal gato = Animal.GATO;
//     Animal cachorro = Animal.CACHORRO;
//     Animal papagaio = Animal.PAPAGAIO;
//     Animal peixe = Animal.PEIXE;
//     Animal hamster = Animal.HAMSTER;
//     Animal calopsita = Animal.CALOPSITA;
//     Animal tartaruga = Animal.TARTARUGA;

//     System.out.println("Ultilizando enum");
//     imprimeDono(gato);
//     imprimeDono(cachorro);
//     imprimeDono(papagaio);
//     imprimeDono(peixe);
//     imprimeDono(hamster);
//     imprimeDono(calopsita);
//     imprimeDono(tartaruga);
//   }

 
//   static void imprimeDono(Animal domestico ){
//     switch (domestico){
//       case GATO:
//         System.out.println("Jennifer");
//         break;
//       case CACHORRO:
//         System.out.println("Fagne");
//         break;
//       case PAPAGAIO:
//         System.out.println("Camila");
//         break;
//       case PEIXE:
//         System.out.println("Gorete");
//         break;
//       case HAMSTER:
//         System.out.println("João");
//         break;
//       case CALOPSITA:   
//         System.out.println("Maria");
//         break;
//       case TARTARUGA:
//         System.out.println("Fabricio");
//         break;            
//     }
//   }
  
}