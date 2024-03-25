#define GLUT_DISABLE_ATEXIT_HACK

#include <windows.h>
#include <GL/glut.h>
#include <stdlib.h>

void desenhaCasa(int r, int g, int b, bool ponto);
void desenhaJanela(int r, int g, int b);

void desenha(void)
{
    //Inicializa o sistema de coordenadas
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();

    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();

    //Define os limites dos eixos x e y
    //Argumentos da função: void gluOrtho2D(GLdouble left, GLdouble right, GLdouble bottom, GLdouble top)
    gluOrtho2D (0.0f, 800.0f, 0.0f, 600.0f);

	//Limpa todos os pixels com a cor de fundo
	glClear(GL_COLOR_BUFFER_BIT);

	glBegin(GL_QUADS); // fundo de céu
        glColor3ub(100, 150, 255);
        glVertex2i(0, 600);
        glVertex2i(800, 600);
        glColor3ub(255, 255, 255);
        glVertex2i(800, 0);
        glVertex2i(0, 0);
    glEnd();

    glBegin(GL_QUADS); // grama
        glColor3ub(25, 80, 30);
        glVertex2i(0, 0);
        glVertex2i(800, 0);
        glColor3ub(70, 180, 60);
        glVertex2i(800, 40);
        glVertex2i(0, 40);
    glEnd();

    glBegin(GL_QUADS); // montanha
        glColor3ub(25, 80, 30);
        glVertex2i(700, 40);
        glVertex2i(800, 200);
        glVertex2i(800, 90);
        glVertex2i(800, 40);
    glEnd();

    glPushMatrix();
        glTranslatef(15, 40, 0);
        glScalef(0.7 ,0.5 ,1);
        desenhaCasa(20, 220, 110, 1);
    glPopMatrix();

    glPushMatrix();
        glTranslatef(185, 40, 0);
        glScalef(1 ,0.7 ,1);
        desenhaCasa(80, 25, 100, 1);
    glPopMatrix();

    glPushMatrix();
        glTranslatef(420, 40, 0);
        glScalef(0.6 ,1.4 ,1);
        desenhaCasa(180, 250, 10, 1);
    glPopMatrix();

    glPushMatrix();
        glTranslatef(550, 40, 0);
        glScalef(0.5 ,0.5 ,1);
        desenhaCasa(11, 211, 12, 1);
    glPopMatrix();

    glPushMatrix();
        glTranslatef(700, 40, 0);
        glRotatef(57.0, 0, 0, 1);
        glScalef(0.17 ,0.09 ,1);
        desenhaCasa(0, 25, 100, 0);
    glPopMatrix();

    glPushMatrix();
        glTranslatef(740, 103, 0);
        glRotatef(57.0, 0, 0, 1);
        glScalef(0.2 ,0.12 ,1);
        desenhaCasa(25, 100, 0, 0);
    glPopMatrix();

    glPushMatrix();
        glTranslatef(780, 168, 0);
        glRotatef(57.0, 0, 0, 1);
        glScalef(0.39 ,0.11 ,1);
        desenhaCasa(80, 25, 100, 0);
    glPopMatrix();

    glFlush();
}

void desenhaJanela(int r, int g, int b){
    glColor3ub(0, 0, 0);
    glBegin(GL_QUADS);
        glVertex2i(0, 0);
        glVertex2i(0, 50);
        glVertex2i(50, 50);
        glVertex2i(50, 0);
    glEnd();

    glColor3ub(66, 38, 0);
    glBegin(GL_QUADS);
        glVertex2i(-24, 0);
        glVertex2i(-24, 50);
        glVertex2i(0, 50);
        glVertex2i(0, 0);

        glVertex2i(74, 0);
        glVertex2i(74, 50);
        glVertex2i(50, 50);
        glVertex2i(50, 0);

        glVertex2i(0, 0);
        glVertex2i(50, 0);
        glVertex2i(50, -10);
        glVertex2i(0, -10);
    glEnd();

    glColor3ub(66, 38, 0);
    glLineWidth(2);
    glBegin(GL_LINES);
        glVertex2i(25, 0);
        glVertex2i(25, 50);
        glVertex2i(0, 25);
        glVertex2i(50, 25);
    glEnd();
}

void desenhaCasa(int r, int g, int b, bool ponto){
    glColor3ub(66, 38, 0);
    if (ponto) glLineWidth(25);
    else glLineWidth(1);
    glBegin(GL_LINES); //chamine
        glVertex2i(175, 200);
        glVertex2i(175, 280);
    glEnd();

    glColor3ub(r, g, b);
    glBegin(GL_POLYGON); //corpo da casa
               glVertex2i(0,0);
               glVertex2i(0,200);
               glVertex2i(100,275);
               glVertex2i(200,200);
               glVertex2i(200,0);
    glEnd();

    glColor3ub(150, 75, 0); //porta
    glBegin(GL_QUADS);
               glVertex2i(5, 0);
               glVertex2i(5, 120);
               glVertex2i(65,120);
               glVertex2i(65,0);
    glEnd();

    glColor3ub(3, 4, 5);
    if(ponto) glPointSize(5);
    else glPointSize(1);
    glBegin(GL_POINTS); //macaneta
        glVertex2i(54, 65);
    glEnd();

    glColor3ub(200, 75, 0);
    if(ponto) glLineWidth(15);
    else glLineWidth(1);
    glBegin(GL_LINES); //teto
        glVertex2i(-10, 200);
        glVertex2i(100, 280);

        glVertex2i(210, 200);
        glVertex2i(100, 280);
    glEnd();

    glPushMatrix(); //janela 1
        glScalef(0.7, 0.9, 1);
        glTranslatef(70, 170, 0);
        desenhaJanela(0, 255, 0);
    glPopMatrix();

    glPushMatrix(); //janela 2
        glScalef(0.7, 0.9, 1);
        glTranslatef(190, 170, 0);
        desenhaJanela(0, 255, 0);
    glPopMatrix();

    glPushMatrix(); //janela grande
        glScalef(1, 1.4, 1);
        glTranslatef(110, 30, 0);
        desenhaJanela(0, 255, 0);
    glPopMatrix();
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
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
	glutInitWindowSize (800, 600);
	glutInitWindowPosition (200, 50);
	glutCreateWindow("Rua engraçada");
    glutDisplayFunc(desenha);

	init();
    glutMainLoop();
}
