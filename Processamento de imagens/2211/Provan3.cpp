#include "opencv2/opencv.hpp"
#include "opencv2/objdetect.hpp" 
#include "opencv2/highgui.hpp" 
#include "opencv2/imgproc.hpp" 
#include <iostream> 

using namespace std;
using namespace cv;

void detectAndDraw(Mat& img, CascadeClassifier& cascade, CascadeClassifier& nestedCascade, double scale);

string cascadeName, nestedCascadeName;

int main(int argc, const char** argv)
{

    Mat frame, image;

    CascadeClassifier cascade, nestedCascade;
    double scale = 1;

    nestedCascade.load("C:/opencv/sources/data/haarcascades/haarcascade_eye.xml");
    cascade.load("C:/opencv/sources/data/haarcascades/haarcascade_frontalface_default.xml");

    Mat frame1 = imread("Imagens\\Pessoas.jpg", IMREAD_COLOR);
    detectAndDraw(frame1, cascade, nestedCascade, scale);
    waitKey(0);
    return 0;
}

void detectAndDraw(Mat& img, CascadeClassifier& cascade, CascadeClassifier& nestedCascade, double scale) {
    vector<Rect> faces;
    Mat gray, smallImg;

    cvtColor(img, gray, COLOR_BGR2GRAY);
    double fx = 1 / scale;

    resize(gray, smallImg, Size(), fx, fx, INTER_LINEAR);
    equalizeHist(smallImg, smallImg);

    cascade.detectMultiScale(smallImg, faces, 1.2, 5, 0 | CASCADE_SCALE_IMAGE, Size(30, 30));

    for (size_t i = 0; i < faces.size(); i++)
    {
        Rect r = faces[i];
        Mat smallImgROI;
        vector<Rect> nestedObjects;
        Point center;
        
        Scalar color = Scalar(0, 0, 0);
        int radius;

        double aspect_ratio = (double)r.width / r.height;
        if (0.75 < aspect_ratio && aspect_ratio < 1.3)
        {
            center.x = cvRound((r.x + r.width * 0.5) * scale);
            center.y = cvRound((r.y + r.height * 0.5) * scale);
            radius = cvRound((r.width + r.height) * 0.25 * scale);
            circle(img, center, radius, color, 3, 8, 0);
            for (int ex = 0; ex < radius; ex++) {
                circle(img, center, ex, 3, 8, 0);
            }
             
        }
        else
            rectangle(img, Point(cvRound(r.x * scale), cvRound(r.y * scale)),
                Point(cvRound((r.x + r.width - 1) * scale),
                    cvRound((r.y + r.height - 1) * scale)), color, 3, 8, 0);
        if (nestedCascade.empty())
            continue;

        smallImgROI = smallImg(r);

      
    }
    imshow("Imagem processada", img);
}
