#define GLUT_DISABLE_ATEXIT_HACK
#include <windows.h>
#include <GL/glut.h>
#include <stdlib.h>
#include <stdio.h>

float telaX = 800.0f, telaY = 600.0f;
int r=0, g=0, b=0, xo=50, yo=50, xf = -1, yf = -1, x, y, i, v[500], t=0, espessura = 1;
bool clique = true;

//Função callback para desenho
void desenha(void) {
    //Inicializa o sistema de coordenadas
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();

    //Define os limites dos eixos x e y
    //Argumentos da função: void gluOrtho2D(GLdouble left, GLdouble right, GLdouble bottom, GLdouble top)
    gluOrtho2D (0.0f, telaX, 0.0f, telaY);

	//Limpa todos os pixels com a cor de fundo
	glClear(GL_COLOR_BUFFER_BIT);

    // Desenha um quadrado preenchido com a cor corrente

    glColor3ub(i, 0, 0);

        for(int cont=7; cont <t; cont+=8){
            glLineWidth(v[cont-3]);
            glColor3ub(v[cont-2], v[cont-1], v[cont]);
            glBegin(GL_LINES);
                glVertex2i(v[cont-7], v[cont-6]);
                glVertex2i(v[cont-5], v[cont-4]);
            glEnd();
        }


    glutPostRedisplay();
    glFlush();

    return;
	//Habilita a execução de comandos OpenGL

}

void keyboard(unsigned char key, int x, int y){
    switch(key){
        case 27:
            exit(0);
            break;
        case '1':
                r = 255;
                g = 0;
                b = 0;
            break;
        case '2':
                r = 0;
                g = 255;
                b = 0;
            break;
        case '3':
            r = 0;
            g = 0;
            b = 255;
            break;
        case '4':
            r = 0;
            g = 0;
            b = 0;
            break;
        case '5':
            r = 255;
            g = 255;
            b = 0;
            break;
        case '6':
            r = 255;
            g = 0;
            b = 120;
            break;
        case '7':
            r = 255;
            g = 120;
            b = 0;
            break;
        case '8':
            r = 120;
            g = 120;
            b = 120;
            break;
        case '9':
            r = 150;
            g = 100;
            b = 0;
            break;
        case 'b':
            if (b>0)
                b--;
            break;
        case 'B':
            if (b<255)
                b++;
            break;
        case '+':
            if (espessura<33)
                espessura++;
            break;
        case '-':
            if (espessura>1)
                espessura--;
            break;
        case 'a':
            if (espessura>1)
               for(int cont = 0;cont < 500;cont++) v[cont] = 0;
            t = 0;
            clique = true;
            break;

    }
}

void specialKeyboard(int key, int x, int y){
    if (key == GLUT_KEY_LEFT){
        printf("Tecla direcional ESQUERDA pressionada\n");
    }

    if (key == GLUT_KEY_RIGHT){
        printf("Tecla direcional DIREITA pressionada\n");
    }
}

void mouse(int button, int state, int x, int y){
    y = telaY - y;
    xf = x;
    yf = y;
    if (button == GLUT_LEFT_BUTTON){
        if (state == GLUT_DOWN){
            if(clique){
                    v[t] = xo = x;
                    v[t+1] = yo = y;
                    t += 2;
                    clique = false;
                    printf("Uma vez, clicou; t = %d\n", t);
                    printf("v[%d] = %d, v[%d] = %d\n", t-2, v[t-2], t-1, v[t-1]);
            } else {
                    v[t] = xf = x;
                    v[t+1] = yf = y;
                    v[t+2] = espessura;
                    v[t+3] = r;
                    v[t+4] = g;
                    v[t+5] = b;
                    t += 6;
                    clique = true;
                    printf("Uma vez, saiu; t = %d\n", t);
            }

        }
    }

}


//Inicializa parâmetros
void init (void)
{
    // Configura a cor de fundo como preta
    glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
}

//Principal
int main(void)
{
    //Tipo de janela (single-buffered) e cores utilizados
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);

	//Configura o tamanho da janela
	glutInitWindowSize (telaX, telaY);

	//Configura a posição inicial da janela
	glutInitWindowPosition (283, 50);

	//Configura a janela
	glutCreateWindow("Lines");

	//Chama a função desenha
	glutDisplayFunc(desenha);

	//Callback de teclas normais
	glutKeyboardFunc(keyboard);

	//Callback de teclas especiais
	glutSpecialFunc(specialKeyboard);

	//Callback do Mouse
	glutMouseFunc(mouse);

	//Inicializa o programa
	init();

	//Habilita o loop (máquina de estados)
	glutMainLoop();
}
