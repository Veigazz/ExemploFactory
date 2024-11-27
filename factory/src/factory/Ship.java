package factory;

public class Ship implements Transport {
    @Override
    public void deliver() {
        // Implementação específica para transporte por navio
        System.out.println("Entregando carga por Navio");
    }
}




