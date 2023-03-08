public class Principal{
  public static void main(String args[]){
    int aux=1;
    Pilha p = new Pilha(5); // construtor substitui initialize
    while(!p.isFull()){
      p.push(aux);
      aux++;
    }
    while(!p.isEmpty()){
      System.out.println(p.pop());
    }
  }
}
