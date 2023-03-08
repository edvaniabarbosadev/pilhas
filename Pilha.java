public class Pilha{
  private int[] vetor;
  private int topo;

  public Pilha(int tam){
    vetor = new int[tam];
    topo = -1;
  }

  public void push(int valor){
    if(topo==vetor.length-1)
      System.out.println("Pilha Cheia!");
    else{
      topo++;
      vetor[topo]=valor;
    }
  }

  public int pop(){
    int aux = topo;
    if(topo>=0){
      topo--;
      return vetor[aux];
    } else{
      System.out.println("Pilha Vazia!");
      return -99999;
    }
  }

  public boolean isFull(){
    return (topo == vetor.length-1);
  }

  public boolean isEmpty(){
    return (topo == -1);
  }
}
