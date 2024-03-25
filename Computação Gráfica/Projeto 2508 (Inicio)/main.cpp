#define GLUT_DISABLE_ATEXIT_HACK
#include <windows.h>
#include <GL/glut.h>
#include <stdlib.h>
#include <time.h>

// Função callback para desenho
void desenha(void)
{
    // Inicializa o sistema de coordenadas
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();

    // Define os limites dos eixos x e y
    // Argumentos da função: void gluOrtho2D(GLdouble left, GLdouble right, GLdouble bottom, GLdouble top)
    gluOrtho2D (0.0f, 1500.0f, 0.0f, 650.0f);  // (xo, x, yo, y)

	//Limpa todos os pixels com a cor de fundo
	glClear(GL_COLOR_BUFFER_BIT);

    glBegin(GL_QUADS); // fundo de céu
        glColor3ub(100, 150, 255);
        glVertex2i(0, 650);
        glVertex2i(1500, 650);
        glColor3ub(255, 150, 100);
        glVertex2i(1500, 0);
        glVertex2i(0, 0);
    glEnd();

    glBegin(GL_QUADS); // frança
        glColor3ub(0, 38, 84);
        glVertex2i(5, 645);
        glVertex2i(168, 645);
        glVertex2i(168, 330);
        glVertex2i(5, 330);

        glColor3ub(255, 255, 255);
        glVertex2i(168, 645);
        glVertex2i(337, 645);
        glVertex2i(337, 330);
        glVertex2i(168, 330);

        glColor3ub(206, 17, 38);
        glVertex2i(337, 645);
        glVertex2i(495, 645);
        glVertex2i(495, 330);
        glVertex2i(337, 330);
    glEnd();

    glBegin(GL_QUADS); // kuwait
        glColor3ub(0, 0, 0);
        glVertex2i(505, 645);
        glVertex2i(626, 540);
        glVertex2i(626, 435);
        glVertex2i(505, 330);

        glColor3ub(0, 122, 61);
        glVertex2i(505, 645);
        glVertex2i(626, 540);
        glVertex2i(995, 540);
        glVertex2i(995, 645);

        glColor3ub(255, 255, 255);
        glVertex2i(626, 540);
        glVertex2i(626, 435);
        glVertex2i(995, 435);
        glVertex2i(995, 540);

        glColor3ub(206, 17, 38);
        glVertex2i(626, 435);
        glVertex2i(505, 330);
        glVertex2i(995, 330);
        glVertex2i(995, 435);
    glEnd();

    glBegin(GL_QUADS); // rep tcheca
        glColor3ub(255, 255, 255);
        glVertex2i(5, 320);
        glVertex2i(495, 320);
        glVertex2i(495, 157);
        glVertex2i(245, 157);

        glColor3ub(17, 69, 126);
        glVertex2i(5, 320);
        glVertex2i(245, 157);
        glVertex2i(5, 5);
        glVertex2i(5, 320);

        glColor3ub(215, 20, 26);
        glVertex2i(245, 157);
        glVertex2i(5, 5);
        glVertex2i(495, 5);
        glVertex2i(495, 157);
    glEnd();

    glBegin(GL_QUADS); // grecia
        glColor3ub(255, 255, 255);
        glVertex2i(505, 320);
        glVertex2i(995, 320);
        glVertex2i(995, 5);
        glVertex2i(505, 5);

        for(int y=5;y<320;y+=35){
            if (y%2!=0) glColor3ub(13, 94, 175);
            else glColor3ub(255, 255, 255);
            glVertex2i(505, y+35);
            glVertex2i(995, y+35);
            glVertex2i(995, y);
            glVertex2i(505, y);
        }

        glColor3ub(13, 94, 175);
        glVertex2i(505, 320);
        glVertex2i(669, 320);
        glVertex2i(669, 145);
        glVertex2i(505, 145);

        glColor3ub(255, 255, 255);
        glVertex2i(505, 215);
        glVertex2i(669, 215);
        glVertex2i(669, 250);
        glVertex2i(505, 250);

        glColor3ub(255, 255, 255);
        glVertex2i(569, 320);
        glVertex2i(604, 320);
        glVertex2i(604, 145);
        glVertex2i(569, 145);
    glEnd();

    glBegin(GL_QUADS); // eua
        glColor3ub(180, 4, 9);
        glVertex2i(1005, 330);
        glVertex2i(1495, 330);
        glVertex2i(1495, 645);
        glVertex2i(1005, 645);
        int x = 0;
        for(float y=330; y<620; y+=315/13){
            if(x%2==0) glColor3ub(180, 4, 9);
            else glColor3ub(255, 255, 255);
            x++;
            glVertex2f(1005, y);
            glVertex2f(1495, y);
            glVertex2f(1495, y+315/13);
            glVertex2f(1005, y+315/13);
        }

        glColor3ub(28, 20, 100);
        glVertex2i(1005, 645);
        glVertex2i(1201, 645);
        glVertex2i(1201, 474);
        glVertex2i(1005, 474);
    glEnd();

    glColor3ub(255, 255, 255);
    for(int x=1009; x<1201; x+=32){
        for(int y=645; y>498; y-=34){
            glBegin(GL_POLYGON);
                glVertex2f(x+13.0, y-15.0);
                glVertex2f(x+14.0, y-6);
                glVertex2f(x+04.2, y-24);
                glVertex2f(x+23.0, y-15.2);
                glVertex2f(x-1.00, y-15.2);
                glVertex2f(x+19.8, y-24);
            glEnd();
        }
    }

    for(int x=1024; x<1180; x+=32){
        for(int y=630; y>509; y-=34){
            glBegin(GL_POLYGON);
                glVertex2f(x+13.0, y-15.0);
                glVertex2f(x+14.0, y-6);
                glVertex2f(x+04.2, y-26);
                glVertex2f(x+25.0, y-15.2);
                glVertex2f(x-1.00, y-15.2);
                glVertex2f(x+19.8, y-26);
            glEnd();
        }
    }

    glBegin(GL_QUADS); //africa do sul
        glColor3ub(255, 255, 255);
        glVertex2i(1495, 320);
        glVertex2i(1495, 5);
        glVertex2i(1005, 5);
        glVertex2i(1005, 320);

        glColor3ub(222, 56, 49);
        glVertex2i(1495,320);
        glVertex2i(1495,215);
        glVertex2i(1266,215);
        glVertex2i(1105,320);

        glColor3ub(0, 35 , 149);
        glVertex2i(1495,5);
        glVertex2i(1495,110);
        glVertex2i(1266,110);
        glVertex2i(1105,5);

        glColor3ub(0, 122, 77);
        glVertex2f(1259, 193);
        glVertex2f(1259, 131);
        glVertex2f(1495, 131);
        glVertex2f(1495, 193);
    glEnd();

    glBegin(GL_POLYGON);
        glColor3ub(0, 122, 82);
        glVertex2f(1065, 5);
        glVertex2f(1005, 5);
        glVertex2f(1005, 43);
        glVertex2f(1005, 282);
        glVertex2f(1005, 320);
        glVertex2f(1065, 320);
        glVertex2f(1259, 193);
        glVertex2f(1259, 131);
    glEnd();

    glBegin(GL_TRIANGLES);
        glColor3ub(255, 182, 18);
        glVertex2f(1005, 43);
        glVertex2f(1005, 281);
        glVertex2f(1190, 162);

        glColor3ub(0, 0, 0);
        glVertex2f(1005, 68);
        glVertex2f(1005, 256);
        glVertex2f(1151, 162);
    glEnd();

	//Habilita a execução de comandos OpenGL
	glFlush();
}

//Inicializa parâmetros
void init (void)
{
    // Configura a cor de fundo como preta
    glClearColor(0.9f, 0.8f, 0.99f, 1.0f);
}

//Principal
int main(void){
    srand(time(NULL));
    //Tipo de janela (single-buffered) e cores utilizados
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
	//Configura o tamanho da janela
	glutInitWindowSize (1350, 650);
	//Configura a posição inicial da janela
	glutInitWindowPosition (0, 50);

	//Configura a janela
	glutCreateWindow("Bandeiras");
	//Chama a função desenha
	glutDisplayFunc(desenha);
	//Inicializa o programa
	init();
	//Habilita o loop (máquina de estados)
	glutMainLoop();
}
