#include <iostream>
#include <opencv2/opencv.hpp>
#include <ctime>

using namespace cv;

int main()
{
    unsigned seed = time(0);
    srand(seed);
    std::cout << "Hello, Nairon!" << std::endl;
    std::string img = "Imagem em preto.png";
    Mat imagem = imread(img);
    if (!imagem.data) {
        std::cout << "\aErro ao abrir a imagem" << std::endl;
        return 1;
    }
    imshow("Imagem em preto (900x900)", imagem);
    for (int i = 0; i < 50; i++) {
        int a = 1 + rand() % 3;
        if (a == 1) {
            circle(imagem, Point(1 + rand() % 900, 1 + rand() % 900), 1+rand()%100, Scalar(1 + rand() % 255, 1 + rand() % 255, 1 + rand() % 255), 2, 8);
        }
        else if (a == 2) {
            line(imagem, Point(1 + rand() % 900, 1 + rand() % 900), Point(1 + rand() % 900, 1 + rand() % 900), Scalar(1 + rand() % 255, 1 + rand() % 255, 1 + rand() % 255), 2, 8);
        }
        else if (a == 3) {
            rectangle(imagem, Point(1 + rand() % 900, 1 + rand() % 900), Point(1 + rand() % 900, 1 + rand() % 900), Scalar(1 + rand() % 255, 1 + rand() % 255, 1 + rand() % 255), 2, 8);
        }
    }
    imshow("Arte Abstrata", imagem);
    imwrite("Arte Abstrata.jpg", imagem);
    std::string imgatt = "Arte Abstrata.jpg";
    Mat image_gray;
    image_gray = imread(imgatt, IMREAD_GRAYSCALE);
    imshow("Cinzeiro", image_gray);
    imwrite("Cinzeiro.jpg", image_gray);
    waitKey(0);
    return 0;
}