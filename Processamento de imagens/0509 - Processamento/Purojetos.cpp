#include <iostream>
#include <opencv2/opencv.hpp>

using namespace cv;

int main(int argc, char** argv)
{
    std::cout << "Hello Nairon" << std::endl;

    std::string img = "outraspessoas.jpg";
    Mat image = imread(img);
    if (!image.data) {
        std::cout << "Erro ao abrir a imagem" << std::endl;
        return 1;
    }
    imshow("Imagem salva sem edicao", image);
    
    circle(image, Point(60, 112), 18, Scalar(0, 0, 255), 2, 8);
    circle(image, Point(110, 123), 18, Scalar(0, 0, 255), 2, 8);
    circle(image, Point(160, 90), 18, Scalar(0, 0, 255), 2, 8);
    circle(image, Point(241, 75), 18, Scalar(0, 0, 255), 2, 8);
    circle(image, Point(321, 61), 18, Scalar(0, 0, 255), 2, 8);
    circle(image, Point(405, 71), 18, Scalar(0, 0, 255), 2, 8);
    circle(image, Point(471, 95), 18, Scalar(0, 0, 255), 2, 8);
    circle(image, Point(525, 112), 18, Scalar(0, 0, 255), 2, 8);
    circle(image, Point(581, 110), 18, Scalar(0, 0, 255), 2, 8);
    
    imwrite("Pessoas Circuladas.jpg", image);
    std::string imgatt = "Pessoas Circuladas.jpg";
    Mat image_gray;
    image_gray = imread(imgatt, IMREAD_GRAYSCALE);
    imwrite("Pessoas Circuladas em cinza.jpg", image_gray);
    
    waitKey(0);
    return 0;
}