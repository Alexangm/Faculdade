import numpy

z = numpy.random.randint(low=0, high=1001, size=200)

print(f"Média = {numpy.mean(z)}")
print(f"Mediana = {numpy.median(z)}")
print(f"Maior = {numpy.max(z)}")
print(f"Menor = {numpy.min(z)}")