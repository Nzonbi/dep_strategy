public class Context {

    private IStrategy strategy;

    public Context() {
       this.strategy = new DefaultIStrategyImpl();
    }

    public void process(){
        System.out.println("Etape1 de l'algorithme");
        strategy.applyStrategie();
        System.out.println("Etape final de l'algorithme");
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
