import pandas

from pandas.plotting import scatter_matrix
from matplotlib import pyplot

dados = pandas.read_csv('iris.csv')

classeCor = {'Iris-setosa': 'red', 'Iris-virginica': 'blue', 'Iris-versicolor': 'green'}
cores = [classeCor[nome] for nome in dados.clas]

# no arquivo csv, foi a coluna class foi alterada para clas por ser uma palavra reservada

dados.plot(kind='scatter', x='sepallength', y='sepalwidth', c = cores)
pyplot.show()