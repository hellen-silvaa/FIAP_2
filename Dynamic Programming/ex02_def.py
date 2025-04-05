def busca_produto():
    produtos_aprovados = []
    produtos_reprovados = []
    produtos_pendentes = []

    print("Seja bem-vindo(a) à inspeção de qualidade! Insira os números de série e o status de qualidade:")
    print("1 = Aprovado \n0 = Reprovado \n-1 = Pendente\n")

    for i in range(10):
        numero_serie = input(f"Digite o número de série do produto {i + 1}: ")
        if numero_serie.isdigit():
            numero_serie = int(numero_serie)
            status = input(f"Digite o status do produto {i + 1} (1 = Aprovado, 0 = Reprovado, -1 = Pendente): ")
            if status == '1':
                produtos_aprovados.append(numero_serie)
            elif status == '0':
                produtos_reprovados.append(numero_serie)
            elif status == '-1':
                produtos_pendentes.append(numero_serie)
            else:
                print("Status inválido. Tente novamente.")
                continue
        else:
            print("O número de série deve ser um número válido. Tente novamente.")
            continue

    print("✅ Produtos aprovados:", produtos_aprovados)
    print("❌ Produtos reprovados:", produtos_reprovados)
    print("⚠️ Produtos pendentes:", produtos_pendentes)

busca_produto()
