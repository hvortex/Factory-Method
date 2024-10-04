public class App {
    public static void main(String[] args) {
        
        FabricaBolo fabricaBoloChocolate = new FabricaBoloChocolate();
        fabricaBoloChocolate.fazerBolo();
        
        FabricaBolo fabricaBoloMorango = new FabricaBoloMorango();
        fabricaBoloMorango.fazerBolo();
        
        FabricaBolo fabricaBoloCenoura = new FabricaBoloCenoura();
        fabricaBoloCenoura.fazerBolo();
        
        FabricaBolo fabricaBoloAbacaxi = new FabricaBoloAbacaxi();
        fabricaBoloAbacaxi.fazerBolo();
    }

}