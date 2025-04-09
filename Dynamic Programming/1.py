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


lista = [3, 5, 7, 8, 11, 14, 15]
alvo = 11
indice = busca_binaria(lista, alvo)
