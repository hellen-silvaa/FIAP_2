while True:

    print("Escolha uma opção: \n"
        " 1. Ordenar a lista do Exercício 1 (busca binária). \n "
          "2. Atender os clientes do Exercício 2 (FIFO). \n "
          "3. Retirar os carros do Exercício 3 (LIFO).\n "
         "4. Sair")

    escolha = input("Digite o número da sua escolha: ")

    if escolha == '1':
        lista = [3, 5, 7, 8, 11, 14, 15]
        print("Lista ordenada para busca binária:", sorted(lista))

    elif escolha == '2':
        fila_clientes = []
        for i in range(5):
            cliente = input(f"Digite o nome do cliente para ser atendido {i + 1}: ")
            fila_clientes.append(cliente)

        print("Ordem de atendimento dos clientes (FIFO):")
        while fila_clientes:
            print(fila_clientes.pop(0))

    elif escolha == '3':
        pilha_carros = []
        for i in range(5):
            carro = input(f"Digite o modelo ou a placa do carro {i + 1}: ")
            pilha_carros.append(carro)

        print("\nSequencia de saida dos carros (LIFO):")
        while pilha_carros:
            print(pilha_carros.pop())

    elif escolha == '4':
        print("Saindo do programa.")
        break

    else:
        print("Escolha inválida. Tente novamente.")
