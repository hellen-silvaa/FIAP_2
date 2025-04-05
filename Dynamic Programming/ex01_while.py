codigos_equipamentos = [101, 102, 103, 104, 105, 106, 107, 108]
status_manutencao = [0, 1, 0, 1, 0, 1, 1, 0]

pendentes = []
concluidos = []

i = 0
while i < len(codigos_equipamentos):
    if status_manutencao[i] == 0:
        pendentes.append(codigos_equipamentos[i])
    else:
        concluidos.append(codigos_equipamentos[i])
    i += 1

print("    Seja bem-vindo à Manutenção em Ação! ")
print("Verifique abaixo os equipamentos pendentes e concluídos:")
print(f"🔧 Equipamentos pendentes: {pendentes}")
print(f"✅ Equipamentos concluídos: {concluidos}")
