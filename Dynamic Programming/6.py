def estacionamento():
    pilha_carros = []

    for i in range(10):
        carro = input(f"Digite o modelo ou a placa do carro {i + 1}: ")
        pilha_carros.append(carro)

    print("Ordem de entrada dos carros:")
    print(pilha_carros)

    print("Sequencia de saida dos carros:")
    while pilha_carros:
        print(pilha_carros.pop())


estacionamento()
