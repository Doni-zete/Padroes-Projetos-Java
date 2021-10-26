
import Singletons.SingletonEager;
import Singletons.SingletonLazy;
import Singletons.SingletonLazyHolder;
import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class Teste {

 public static void main(String[] args) {
    
  //Singleton
  {
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
     lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
     eager = SingletonEager.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);

    //Strategy

    Comportamento defensivo = new ComportamentoDefensivo(); 
    Comportamento normal = new ComportamentoNormal();
    Comportamento agressivo = new ComportamentoAgressivo();    

    Robo robo = new Robo();
    robo.setComportamento(normal);
    robo.mover();
    robo.mover();
    robo.setComportamento(defensivo);
    robo.mover();
    robo.mover();
    robo.setComportamento(agressivo);
    robo.mover();
    robo.mover();
  }

}
}
