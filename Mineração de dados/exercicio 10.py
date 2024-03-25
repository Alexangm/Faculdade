import pandas

from matplotlib import pyplot

dados = pandas.read_csv('titanic.csv')

classeCor = {0: 'red', 1: 'blue'}
cores = [classeCor[nome] for nome in dados.Survived]

dados.plot(kind='scatter', x='Name', y='Age', c=cores)
pyplot.show()