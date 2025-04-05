codigos_equipamentos = [101, 102, 103, 104, 105, 106, 107, 108]
status_manutencao = [0, 1, 0, 1, 0, 1, 1, 0]


def busca_equipamentos(codigos_equipamentos, status_manutencao):
    pendentes = []
    concluidos = []

    for i in range(len(codigos_equipamentos)):
        if status_manutencao[i] == 0:
            pendentes.append(codigos_equipamentos[i])
        else:
            concluidos.append(codigos_equipamentos[i])
    return pendentes, concluidos

pendentes, concluidos = busca_equipamentos(codigos_equipamentos, status_manutencao)

print("    Seja bem-vindo à Manutenção em Ação! ")
print("Verifique abaixo os equipamentos pendentes e concluídos:")
print(f"🔧 Equipamentos pendentes: {pendentes}")
print(f"✅ Equipamentos concluídos: {concluidos}")