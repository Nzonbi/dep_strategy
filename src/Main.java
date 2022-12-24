import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Context context = new Context();

        boolean fin = false;
        Scanner scanner = new Scanner(System.in);
        while (!fin){
            System.out.println("Donner la strategie:  ");
            String strategiuClassName = scanner.nextLine();
            IStrategy strategy = (IStrategy) Class.forName(strategiuClassName).newInstance();
            context.setStrategy(strategy);
            System.out.println("-----------------------");
            context.process();
        }
        /*context.process();
        System.out.println("-----------------------");
        context.setStrategy(new StrategyImpl1());
        context.process();
        System.out.println("-----------------------");
        context.setStrategy(new IStrategyImpl2());
        context.process();
        System.out.println("-----------------------");
        context.setStrategy(new IStrategyImpl3());
        context.process();
        System.out.println("-----------------------");*/

    }
}