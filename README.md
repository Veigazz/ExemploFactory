# Exemplo: Padrão de Projeto Factory Method

Este projeto foi desenvolvido como parte de uma apresentação acadêmica para a disciplina de **Fundamentos de Desenvolvimento de Sistemas Computacionais** da **Turma 3A (2024/2)**, no **IFSUL - Campus Sapucaia do Sul**.

## Descrição
O padrão **Factory Method** é um padrão de criação que fornece uma interface para instanciar objetos, permitindo que subclasses definam qual classe será instanciada. Ele reduz o acoplamento entre o código que usa os objetos e suas implementações concretas.

### Exemplo Implementado: Sistemas de Transporte
O sistema foi desenvolvido para gerenciar diferentes tipos de transporte, como caminhões e navios, permitindo a criação de novos meios de transporte sem alterar o código principal.

**Caminhão** (Truck): Transporte terrestre.

**Navio** (Ship): Transporte marítimo.

### Estrutura do Projeto
**Interface base** (Transport): Define o contrato para os meios de transporte.

**Classes concretas**: Representam diferentes tipos de transporte (Truck e Ship).

**Fábrica** (TransportFactory): Método responsável por criar os objetos com base no tipo de transporte.

**Classe principal** (MainTeste): Demonstra o uso do padrão Factory Method.

### Benefícios do Padrão
Reduz o acoplamento entre o criador e os produtos concretos.

Segue os princípios **Aberto/Fechado** e **Responsabilidade Única**.
