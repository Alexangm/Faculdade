####### Para imprimir na tela algo -------------------- std::cout << "Hello Nairon" << std::endl;

####### Salvar uma imagem em uma variavel ------------- std::string img = "outraspessoas.jpg";
####### Ler a imagem com uma funcao CV ---------------- Mat image = imread(img);
    
###### Condicional para conferir se foi possivel ler a imagem ou nao
    if (!image.data) {
        std::cout << "Erro ao abrir a imagem" << std::endl;
        return 1;
    }
    
###### Mostrar a imagem na tela ------------------------ imshow("Imagem sem edicao", image);

###### Criar um circulo --------------------------------   circle(image, Point(60, 112), 18, Scalar(0, 0, 255), 2, 8);
## circle(image, Point(110, 123), 18, Scalar(0, 0, 255), 2, 8);
## Especificando = Imagem, Coordenadas, Raio, Cor, Não sei


##### Salvar a imagem como um arquivo ------------------ imwrite("Pessoas Circuladas.jpg", image);
#### Necessario para escala de cinza ------------------- Mat image_gray;
### Seguido por ---------------------------------------- image_gray = imread(imgatt, IMREAD_GRAYSCALE);
