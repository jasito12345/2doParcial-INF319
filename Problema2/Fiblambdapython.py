from functools import reduce
def tribo1(count):
   listA = [0, 1, 1]

   any(map(lambda _:listA.append(sum(listA[-3:])),range(3, count)))

   return listA[:count]

  
triboRec = lambda n: reduce(lambda x, _: x+[x[-1]+x[-2]+x[-3]],
                                 range(n-3), [0, 1, 1])
n = input("Cantidad de terminos de la serie \n")
serie = int(n)
print("Tribonacci de forma estructurada\n")
print(tribo1(serie))
print("Tribonacci de forma recursiva\n")
print(triboRec(serie))
input()
