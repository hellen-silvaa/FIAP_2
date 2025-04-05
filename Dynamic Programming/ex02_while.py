produtos_aprovados = []
produtos_reprovados = []
produtos_pendentes = []

print("Seja bem-vindo(a) a inspeção de qualidade! Insira os números de série e o status de qualidade:")
print(" 1 = Aprovado \n 0 = Reprovado \n-1 = Pendente\n")
i = 0
while i < 10:
    numero_serie = input(f"Digite o número de série {i + 1}: ")
    if numero_serie.isdigit():
        numero_serie = int(numero_serie)
        while True:
            status = input(f"Digite o status {i + 1}  (1 = Aprovado  0 = Reprovado,  -1 = Pendente): ")
            if status == '1':
                produtos_aprovados.append(numero_serie)
                break
            elif status == '0':
                produtos_reprovados.append(numero_serie)
                break
            elif status == '-1':
                produtos_pendentes.append(numero_serie)
                break
            else:
                print("Status inválido. Tente novamente. ")
        i += 1
    else:
        print("O número de série deve ser um número válido. Tente novamente.")

print("✅ Produtos aprovados:", produtos_aprovados)
print("❌ Produtos reprovados:", produtos_reprovados)
print("⚠️ Produtos pendentes:", produtos_pendentes)
