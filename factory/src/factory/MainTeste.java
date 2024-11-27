package factory;

public class MainTeste {
    public static void main(String[] args) {
        // Criando transporte por caminhão
        Transport truck = TransportFactory.createTransport("truck");
        truck.deliver();  // Saída: Entregando carga por Caminhão
        
        // Criando transporte por navio
        Transport ship = TransportFactory.createTransport("ship");
        ship.deliver();  // Saída: Entregando carga por Navio
        
        // Tentando um tipo de transporte não suportado
        try {
            Transport unsupported = TransportFactory.createTransport("plane");
            unsupported.deliver();
        } catch (IllegalArgumentException e) {
            // Exibe mensagem de erro se o tipo de transporte não for suportado
            System.out.println(e.getMessage());  // Saída: O tipo de transporte 'plane' não é suportado.
        }
    }
}





