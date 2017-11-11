
public class Troco {
  public static void main (String args [])
  {
    System.out.println("Selecione o produto");
    System.out.println("1 - COCA-COLA");
    System.out.println("2 - GUARANÁ");
    System.out.println("3 - PEPSI");
    System.out.println("4 - CHEETOS");
    System.out.println("5 - SKINI");
    System.out.println("6 - BACONZITOS");
    

    String escolha = Entrada.leiaEscolha("Entre com sua escolha: ");

    String coca = "1";
    String guarana = "2";
    String pepsi = "3";
    String cheetos = "4";
    String skini = "5";
    String baconzitos = "6";
   


    double dinheiro = Entrada.leiaDouble("Insira o dinheiro: ");


    if(escolha == coca){
        double troco = dinheiro - 2.50;
        System.out.println(troco); }

      if(escolha == guarana) {
        double troco = dinheiro - 2.00;
        System.out.println(troco); }

      if(escolha == pepsi) {
       double troco = dinheiro - 2.00;
        System.out.println(troco); }

      if(escolha == cheetos) {
        double troco = dinheiro - 2.00;
        System.out.println(troco); }

      if(escolha == skini) {
        double troco = dinheiro - 1.50;
        System.out.println(troco); }

      if(escolha == baconzitos) {
        double troco = dinheiro - 1.50;
        System.out.println(troco); }

    
  }
}
