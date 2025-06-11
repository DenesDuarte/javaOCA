public class TestaConta {
    public static void main(String[] args) {

        Conta [] minhasContas ;
        minhasContas = new Conta [10];

        // System.out.println(minhasContas[0].saldo);
        
        
        Conta contaNova = new Conta();
        contaNova.saldo = 1000.0;
        minhasContas[0] = contaNova;
        
        // Isso pode ser feito diretamente
        minhasContas[1] = new Conta();
        minhasContas[1].saldo = 3200.0;
        
        System.out.println(minhasContas[0].saldo);
        System.out.println(minhasContas[1].saldo);
    }
}
