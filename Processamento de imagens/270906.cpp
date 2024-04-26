#include <iostream>
#include <opencv2/opencv.hpp>

using namespace cv;

int main(int argc, char** argv)
{
    std::cout << "Hello, Nairon!" << std::endl;
    uchar pixel;
    int x;

    Mat imagem = imread("Imagens\\catto.png");
    if (!imagem.data) {
        std::cout << "\aErro ao abrir a primeira imagem" << std::endl;
        return 1;
    }

    imshow("Imagem Original", imagem);
    
    Mat img_gray;
    img_gray = imread("Imagens\\catto.png", IMREAD_GRAYSCALE);
    imshow("Imagem em Cinza", img_gray);
    

    for (int i = 0; i < img_gray.rows; i++) {
        for (int j = 0; j < img_gray.cols/2; j++) {
            x = img_gray.at<uchar>(i, j);
            x = x - 255;
            if (x < 0) {
                x = x * -1;
            }
            img_gray.at<uchar>(i, j) = x;
                
            }
        }
    
    imshow("Imagem Alterada", img_gray);
    
    waitKey(0);
    return 0;
}  