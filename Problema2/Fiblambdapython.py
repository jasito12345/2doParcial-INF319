from functools import reduce
def fibo1(count):
   listA = [0, 1, 1]

   any(map(lambda _:listA.append(sum(listA[-3:])),range(3, count)))

   return listA[:count]

  
fiboRec = lambda n: reduce(lambda x, _: x+[x[-1]+x[-2]+x[-3]],
                                 range(n-3), [0, 1, 1])
n = input("Cantidad de terminos de la serie \n")
serie = int(n)
print("fibonacci Estructurado\n")
print(fibo1(serie))
print("fibonacci Recursivo\n")
print(fiboRec(serie))
input()