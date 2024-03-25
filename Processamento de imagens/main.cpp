#include <iostream>
#include <opencv2/opencv.hpp>

using namespace cv;
using namespace std;

int main(int argc, char** argv)
{
    cout << "Hello, Nairon!" << endl;

    Mat image;
    image = imread("imagens\\semaforo2.jpg", IMREAD_COLOR);

    if (!image.data) {
        cout << "Erro ao abrir a imagem" << endl;
        return 1;
    }

    Vec3b pixel, vermelho, amarelo, verde;
    int am = 0;
    int verm = 0;
    int verd = 0;

    for (int i = 0; i < image.rows; i++) {
        for (int j = 0; j < image.cols; j++) {
            pixel = image.at<Vec3b>(i, j);
            if ((pixel[0] <= 50) && (pixel[1] <= 50) && (pixel[2] > 180)) {
                verm++;
            }
            if ((pixel[0] <= 50) && (pixel[1] > 150) && (pixel[2] > 150)) {
                am++;
            }
            if ((pixel[0] <= 50) && (pixel[1] >= 180) && (pixel[2] <= 50)) {
                verd++;
            }
        }
    }

    if (am > verm) {
        if (am > verd) {
            cout << "O sinal está amarelo! = "<< endl;
        } else { 
            cout << "O sinal está verde! = "<< endl; 
        }
    } else {
        if (verm > verd) {
            cout << "O sinal está vermelho! = " << endl;
        }
        else {
            cout << "O sinal está verde! = " << endl;
        }
    }
    
    imshow("Imagem", image);
    waitKey(0);
    return 0;
}