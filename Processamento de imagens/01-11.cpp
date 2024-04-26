#include <iostream>
#include <opencv2/opencv.hpp>

using namespace cv;
using namespace std;

int main(int argc, char** argv)
{
    cout << "Hello, Nairon!" << endl;

    Mat imagem, realce, imagemgb;
    imagem = imread("Imagens\\sigilo.jpg");

    if (!imagem.data) {
        std::cout << "\aErro ao abrir a imagem" << std::endl;
        return 1;
    }
    
    imshow("Entrevista", imagem);
 
    Rect p1(100, 50, 120, 200);
    Rect p2(210, 80, 120, 200);
    Rect p3(315, 40, 120, 200);
    Rect p4(444, 53, 120, 200);
    Rect p5(550, 0, 120, 200);

    GaussianBlur(imagem(p1), imagemgb, Size(19, 19), 120, (133, 183), 4);
    imshow("p1", imagemgb);
    GaussianBlur(imagem(p2), imagemgb, Size(19, 19), 120, (133, 183), 4);
    imshow("p2", imagemgb);
    GaussianBlur(imagem(p3), imagemgb, Size(19, 19), 120, (133, 183), 4);
    imshow("p3", imagemgb);
    GaussianBlur(imagem(p4), imagemgb, Size(19, 19), 120, (133, 183), 4);
    imshow("p4", imagemgb);
    GaussianBlur(imagem(p5), imagemgb, Size(19, 19), 120, (133, 183), 4);
    imshow("p5", imagemgb);
      
    waitKey(0);
    return 0;
}