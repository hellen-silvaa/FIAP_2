
while True:
    opcao = int(input("Digite qual estrutura deseja utilizar: \n 1 - Busca Binária \n 2 - FIFO \n 3 - LIFO \n 4 - Nenhum: "))

    if opcao == 1:
        quantidade = int(input("Digite a quantidade de números que você quer colocar na array: "))
        lista = []

        for i in range(quantidade):
            lista.append(int(input(f"Digite o {i+1}º número: ")))

        alvo = int(input("Escolha um número alvo para a busca binária: "))
        lista_ordenada = sorted(lista)
        print(lista_ordenada)


        def busca_binaria(lista, alvo):
            l, h = 0, len(lista) - 1
            iteracao = 0

            while l <= h:
                iteracao += 1
                m = (l + h) // 2
                print(f"Iteração {iteracao}: l={l}, h={h}, m={m}, valor_m={lista[m]}")

                if lista[m] == alvo:
                    print(f"Alvo {alvo} encontrado no índice {m}.")
                    return m
                elif lista[m] < alvo:
                    l = m + 1
                else:
                    h = m - 1

            print(f"Alvo {alvo} não encontrado na lista.")
            return -1

        resultado = busca_binaria(lista_ordenada, alvo)
        print(f"Índice do alvo: {resultado}")



    elif opcao == 2:
        clientes = []

        print("------------------")
        print("ENTRADA DE CLIENTES")
        print("------------------")

        for i in range(10):
            cliente = input("Qual o seu nome? ")
            clientes.append(cliente)
            print(f"Cliente entrando na fila: ", cliente )
            print(f"Fila: ", clientes)

        print("------------------")
        print("CLIENTES ATENDIDOS")
        print("------------------")

        while clientes:
            print(f"Fila: ", clientes)
            cliente_saida = clientes.pop(0)
            print(f"cliente saindo:", cliente_saida)
        print("fila vazia")

    elif opcao == 3:
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
    
    elif opcao == 4:
        print("Saindo...")
        break
    
    else:
        print("Opcão inválida")
