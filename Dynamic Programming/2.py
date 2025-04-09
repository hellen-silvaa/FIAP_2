# levando em consideração que essa questão está repetida e que no exercicio 7 diz sobre "2. Atender os clientes do Exercício 2 (FIFO)", fizemos a questão como conseguimos

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