#include <iostream>
#include <opencv2/opencv.hpp>

using namespace cv;

int main(int argc, char** argv)
{
    std::cout << "Hello, Nairon!" << std::endl;
    Vec3b pixel;
    
    Mat imagem = imread("Imagens\\dmg.jpg");
    if (!imagem.data) {
        std::cout << "\aErro ao abrir a primeira imagem" << std::endl;
        return 1;
    }
    imshow("Imagem Original", imagem);

    for (int i = 0; i < imagem.rows; i++) {
        for (int j = 0; j < imagem.cols; j++) {
            pixel = imagem.at<Vec3b>(i, j);
            if ((pixel[0] <= 50) && (pixel[1] <= 50) && (pixel[2] <= 50)) {
                pixel[0] = 0;
                pixel[1] = 0;
                pixel[2] = 255;
                imagem.at<Vec3b>(i, j) = pixel;
                
            }
        }
    }
    
    imshow("Imagem Alterada", imagem);
    waitKey(0);
    return 0;
}  