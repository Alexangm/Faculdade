#include <iostream>
#include <opencv2/opencv.hpp>

using namespace cv;

int main(int argc, char** argv)
{
    std::cout << "Hello, Nairon!" << std::endl;
    Vec3b pixel;
    int verde = 0, amarelo = 0, vermelho = 0;
    Mat imagem1 = imread("Imagens\\semaforo1.jpg");
    if (!imagem1.data) {
        std::cout << "\aErro ao abrir a primeira imagem" << std::endl;
        return 1;
    }
    Mat imagem2 = imread("Imagens\\semaforo2.jpg");
    if (!imagem2.data) {
        std::cout << "\aErro ao abrir a segunda imagem" << std::endl;
        return 1;
    }
    Mat imagem3 = imread("Imagens\\semaforo3.jpg");
    if (!imagem3.data) {
        std::cout << "\aErro ao abrir a terceira imagem" << std::endl;
        return 1;
    }

    for (int i = 0; i < imagem1.rows; i++) {
        for (int j = 0; j < imagem1.cols; j++) {
            pixel = imagem1.at<Vec3b>(i, j);
            if ((pixel[0] <= 800) && (pixel[1] >= 175) && (pixel[2] <= 80)) {
                verde++;
            }
            if ((pixel[0] <= 50) && (pixel[1] >= 160) && (pixel[2] >= 160)) {
                amarelo++;
            }
            if ((pixel[0] <= 80) && (pixel[1] <= 80) && (pixel[2] >= 175)) {
                vermelho++;
            }
        }
    }
    if ((verde > amarelo) && (verde > vermelho)) {
        std::cout << "Imagem 1: Cor Verde" << std::endl;
    }
    else if (amarelo>vermelho) {
        std::cout << "Imagem 1: Cor Amarelo" << std::endl;
    }
    else {
        std::cout << "Imagem 1: Cor Vermelho" << std::endl;
    }
    verde = amarelo = vermelho = 0;

    for (int i = 0; i < imagem2.rows; i++) {
        for (int j = 0; j < imagem2.cols; j++) {
            pixel = imagem2.at<Vec3b>(i, j);
            if ((pixel[0] <= 800) && (pixel[1] >= 175) && (pixel[2] <= 80)) {
                verde++;
            }
            if ((pixel[0] <= 50) && (pixel[1] >= 160) && (pixel[2] >= 160)) {
                amarelo++;
            }
            if ((pixel[0] <= 80) && (pixel[1] <= 80) && (pixel[2] >= 175)) {
                vermelho++;
            }
        }
    }
    if ((verde > amarelo) && (verde > vermelho)) {
        std::cout << "Imagem 2: Cor Verde" << std::endl;
    }
    else if (amarelo > vermelho) {
        std::cout << "Imagem 2: Cor Amarelo" << std::endl;
    }
    else {
        std::cout << "Imagem 2: Cor Vermelho" << std::endl;
    }
    verde = amarelo = vermelho = 0;

    for (int i = 0; i < imagem3.rows; i++) {
        for (int j = 0; j < imagem3.cols; j++) {
            pixel = imagem3.at<Vec3b>(i, j);
            if ((pixel[0] <= 800) && (pixel[1] >= 175) && (pixel[2] <= 80)) {
                verde++;
            }
            if ((pixel[0] <= 50) && (pixel[1] >= 160) && (pixel[2] >= 160)) {
                amarelo++;
            }
            if ((pixel[0] <= 80) && (pixel[1] <= 80) && (pixel[2] >= 175)) {
                vermelho++;
            }
        }
    }
    if ((verde > amarelo) && (verde > vermelho)) {
        std::cout << "Imagem 3: Cor Verde" << std::endl;
    }
    else if (amarelo > vermelho) {
        std::cout << "Imagem 3: Cor Amarelo" << std::endl;
    }
    else {
        std::cout << "Imagem 3: Cor Vermelho" << std::endl;
    }

    waitKey(0);
    return 0;
}  