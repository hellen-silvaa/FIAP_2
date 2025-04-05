'''Utilize a busca linear escreva uma função em Python que retorna duas listas:
- Uma lista com os códigos dos equipamentos que têm status pendente.
- Uma lista com os códigos dos equipamentos que têm status concluído.
codigos_equipamentos = [101, 102, 103, 104, 105, 106, 107, 108]
status_manutencao = [0, 1, 0, 1, 0, 1, 1, 0]
Sendo: 0 = pendente, 1 = concluído'''

codigos_equipamentos = [101, 102, 103, 104, 105, 106, 107, 108]
status_manutencao = [0, 1, 0, 1, 0, 1, 1, 0]

pendentes = []
concluidos = []

for i in range(len(codigos_equipamentos)):
    if status_manutencao[i] == 0:
        pendentes.append(codigos_equipamentos[i])
    else:
        concluidos.append(codigos_equipamentos[i])

print("    Seja bem-vindo à Manutenção em Ação! ")
print("Verifique abaixo os equipamentos pendentes e concluídos:")
print(f"🔧 Equipamentos pendentes: {pendentes}")
print(f"✅ Equipamentos concluídos: {concluidos}")