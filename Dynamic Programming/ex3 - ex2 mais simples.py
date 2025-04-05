'''Em uma linha de produção, cada produto tem um número de série, e o status
de qualidade é armazenado em uma lista separada. O objetivo é criar três listas:
uma com os produtos aprovados, outra com os produtos reprovados, e outra com produtos pendentes.
Crie uma estrutura com input para o usuário a qual seja possível o usuário inserir
 10 números de série e os respectivos status de qualidade para cada número de série.

Exemplo para número de série = 1001, 1002, 1003....Exemplo para status = aprovado,
reprova, pendente,...,
Sendo 1 = aprovado, 0 = reprovado, -1 = pendente.'''

produtos_aprovados = []
produtos_reprovados = []
produtos_pendentes = []
for i in range(10):
    numero = int(input(f"Digite a série do { i + 1 }º produto: "))
    status = int(input("Digite o status Sendo 1 = aprovado, 0 = reprovado, -1 = pendente: "))
    if status == 1:
        produtos_aprovados.append(numero)
    elif status == 0:
        produtos_reprovados.append(numero)
    else:
        produtos_pendentes.append(numero)

print("------------------------------")
print("      Qualidade em Ação")
print("------------------------------")
print(f"Produtos com status aprovado: {produtos_aprovados}")
print("------------------------------")
print(f"Produtos com status reprovado: {produtos_reprovados}")
print("------------------------------")
print(f"Produtos com status pendente: {produtos_pendentes}")
print("------------------------------")