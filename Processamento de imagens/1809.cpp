#include <iostream>
#include <opencv2/opencv.hpp>

using namespace cv;

int main(int argc, char** argv)
{
    std::cout << "Hello, Nairon!" << std::endl;
  
    Mat imagem = imread("Imagens\\la.png");
    if (!imagem.data) {
        std::cout << "\aErro ao abrir a imagem" << std::endl;
        return 1;
    }
    imshow("Imagem Original", imagem);

    Point p;
    int nObj    =0;



    for (int i = 0; i < imagem.rows; i++) {
        for (int j = 0; j < imagem.cols; j++) {
            pixel = imagem.at<Vec3b>(i, j);
            if ((pixel[0] >= 100) && (pixel[1] >= 100) && (pixel[2] >= 100)) {
                pixel[0] = 79;
                pixel[1] = 71;
                pixel[2] = 54;
                imagem.at<Vec3b>(i, j) = pixel;
                
            }
        }
    }
    
    imshow("Imagem Alterada", imagem);
    waitKey(0);
    return 0;
}  