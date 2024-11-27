package factory;

public class TransportFactory {

    // Método de Fábrica: Cria um método de transporte com base na entrada
    public static Transport createTransport(String transportType) {
        if (transportType == null || transportType.isEmpty()) {
            throw new IllegalArgumentException("O tipo de transporte não pode ser nulo ou vazio");
        }
        
        switch (transportType.toLowerCase()) {
            case "truck":
                return new Truck();
            case "ship":
                return new Ship();
            default:
                throw new IllegalArgumentException("O tipo de transporte '" + transportType + "' não é suportado.");
        }
    }
}







