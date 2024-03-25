#define GLUT_DISABLE_ATEXIT_HACK

#include <windows.h>
#include <GL/glut.h>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

float altura = 400, largura = 400;
int foco = 0, tl = 0, tr = 1, bl = 2, br = 3;
float pos[4][4] = { // Posição das viewports
    {-10.0, 10.0, -10.0, 10.0},
    {-1.0, 10.0, -1.0, 10.0},
    {-10.0, 1.0, -10.0, 1.0},
    {-1.0, 10.0, -10.0, 1.0}
};

void init(void){ // Inicializa opengl
   glClearColor(0.0, 0.0, 0.0, 0.0);
   glShadeModel(GL_SMOOTH);
}

void DesenhaEixos(){ // Eixos coordenados
    glLineWidth(1.0);
    glBegin(GL_LINES);
        glColor3f (1.0, 0.0, 0.0);
        glVertex3f(-10.0, 0.0, 0.0);
        glVertex3f(10.0, 0.0, 0.0);

        glColor3f (0.0, 1.0, 0.0);
        glVertex3f(0.0, -10.0, 0.0);
        glVertex3f(0.0,  10.0, 0.0);
    glEnd();
}

void DesenhaObjetos(){ // Desenho dos objetos (tr, bl, br)
    glColor3f(1.0, 1.0, 0.0);
    glBegin(GL_POLYGON);
        glVertex3f(2.0, 2.0, 0.0);
        glVertex3f(8.0, 2.0, 0.0);
        glVertex3f(2.0, 8.0, 0.0);
    glEnd();

    glColor3f(0.7, 0.7, 0.7);
    glBegin(GL_LINES);
        glVertex3f(-2.0, -2.0, 0.0);
        glVertex3f(-8.0, -2.0, 0.0);

        glVertex3f(-8.0, -2.0, 0.0);
        glVertex3f(-2.0, -8.0, 0.0);

        glVertex3f(-2.0, -8.0, 0.0);
        glVertex3f(-8.0, -8.0, 0.0);
    glEnd();

    glColor3f(0.0, 1.0, 0.0);
    glBegin(GL_LINE_LOOP);
        glVertex3f(2.0, -2.0, 0.0);
        glVertex3f(8.0, -2.0, 0.0);
        glVertex3f(2.0, -8.0, 0.0);
    glEnd();
}

void DesenhaFoco(int lado){ // Desenho do quadrado de "foco"
    if (lado == 1){
        glBegin(GL_LINE_LOOP);
            glColor3f (1.0, 1.0, 1.0);
            glVertex3f(-10, -10, 0.0);
            glVertex3f(10, -10, 0.0);
            glVertex3f(10, 10, 0.0);
            glVertex3f(-9.99, 9.99, 0.0);
        glEnd();
    }
    if (lado == 2){
        glBegin(GL_LINE_LOOP); //top right
            glColor3f (1.0, 1.0, 1.0);
            glVertex3f(-1, -1, 0.0);
            glVertex3f(10, -1, 0.0);
            glVertex3f(10, 10, 0.0);
            glVertex3f(-0.99, 9.99, 0.0);
        glEnd();
    }
    if (lado == 3){
        glBegin(GL_LINE_LOOP); //bot left
            glColor3f (1.0, 1.0, 1.0);
            glVertex3f(1, 1, 0.0);
            glVertex3f(-9.99, 0.99, 0.0);
            glVertex3f(-10, -10, 0.0);
            glVertex3f(1, -10, 0.0);
        glEnd();
    }
    if(lado == 4){
        glBegin(GL_LINE_LOOP); //bot right
            glColor3f (1.0, 1.0, 1.0);
            glVertex3f(-1, -10, 0.0);
            glVertex3f(10, -10, 0.0);
            glVertex3f(10, 1, 0.0);
            glVertex3f(-0.99, 0.99, 0.0);
        glEnd();
    }
}

void desenha(void){
   glClear (GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

   // Define viewport do canto superior esquerdo
   glViewport ((int) 10, (int) 200, (int) 180, (int) 180);
   glMatrixMode (GL_PROJECTION);
   glLoadIdentity ();
   glOrtho(pos[tl][0], pos[tl][1], pos[tl][2], pos[tl][3], -10.0, 10.0); //top left
   //define e carrega a matriz ModelView
   glMatrixMode(GL_MODELVIEW);
   glLoadIdentity();
   //desenha os eixos
   DesenhaEixos();
   //desenha os objetos
   DesenhaObjetos();
   //desenha foco
   if (foco == 1) DesenhaFoco(tl+1);

   // Define viewport do canto superior direito
   glViewport ((int) 200, (int) 200, (int) 180, (int) 180);
   glMatrixMode (GL_PROJECTION);
   glLoadIdentity ();
   glOrtho(pos[tr][0], pos[tr][1], pos[tr][2], pos[tr][3], -10.0, 10.0); //top right
   //define e carrega a matriz ModelView
   glMatrixMode(GL_MODELVIEW);
   glLoadIdentity();
   //desenha os eixos
   DesenhaEixos();
   //desenha os objetos
   DesenhaObjetos();
   //desenha foco
   if (foco == 2) DesenhaFoco(tr+1);

   // Define viewport do canto inferior esquerdo
   glViewport ((int) 10, (int) 10, (int) 180, (int) 180);
   glMatrixMode (GL_PROJECTION);
   glLoadIdentity ();
   glOrtho(pos[bl][0], pos[bl][1], pos[bl][2], pos[bl][3], -10.0, 10.0); //bot left
   //define e carrega a matriz ModelView
   glMatrixMode(GL_MODELVIEW);
   glLoadIdentity();
   //desenha os eixos
   DesenhaEixos();
   //desenha os objetos
   DesenhaObjetos();
   //desenha foco
   if (foco == 3) DesenhaFoco(bl+1);

   // Define viewport do canto inferior direito
   glViewport ((int) 200, (int) 10, (int) 180, (int) 180);
   glMatrixMode (GL_PROJECTION);
   glLoadIdentity ();
   glOrtho(pos[br][0], pos[br][1], pos[br][2], pos[br][3], -10.0, 10.0); //bot right
   //desenha foco
   if (foco == 4) DesenhaFoco(br+1);
   //define e carrega a matriz ModelView
   glMatrixMode(GL_MODELVIEW);
   glLoadIdentity();
   //desenha os eixos
   DesenhaEixos();
   //desenha os objetos
   DesenhaObjetos();

   glutSwapBuffers();
   glutPostRedisplay();
}

void keyboard(unsigned char key, int x, int y){
   switch (key){
      case 27 :
         exit(0);
      break;
   }
   glutPostRedisplay();
}

void special(int key, int x, int y){ // setas up down
    if (foco != 0){
        switch(key){
        case GLUT_KEY_LEFT:
            if(foco == 2){
                if(tr>0) tr--;
                else tr = 3;
            }else if(foco == 3){
                if(bl>0) bl--;
                else bl = 3;
            }else if(foco == 4){
                if(br>0) br--;
                else br = 3;
            }else if(foco == 1){
                if(tl>0) tl--;
                else tl = 3;
            }
        break;

        case GLUT_KEY_RIGHT:
            if(foco == 2){
                if(tr<3) tr++;
                else tr = 0;
            }else if(foco == 3){
                if(bl<3) bl++;
                else bl = 0;
            }else if(foco == 4){
                if(br<3) br++;
                else br = 0;
            }else if(foco == 1){
                if(tl<3) tl++;
                else tl = 0;
            }
        break;
        }
    }

}

void mouse(int button, int state, int x, int y){ //Mouse callback
//Inverte mouse para que a origem fique no canto inferior esquerdo da janela
// por default, a origem   no canto superior esquerdo
y = 400 - y;

    if (button == GLUT_LEFT_BUTTON) {
        if (state == GLUT_DOWN) {
                if(x<=200){
                    if(y<=200){
                        foco = 3;
                    }else foco = 1;
                }else if(y<=200){
                        foco = 4;
                    }else foco = 2;
            printf("x: %d\n", x);
            printf("y: %d\n\n", y);
        }
    }

    if (button == GLUT_RIGHT_BUTTON) {
        if (state == GLUT_DOWN){
        }
    }
}

int main(int argc, char** argv){
   glutInit(&argc, argv);
   glutInitDisplayMode (GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH );
   glutInitWindowSize ((int)largura,(int)altura);
   glutInitWindowPosition (300,80);
   glutCreateWindow ("Viewport Test");
   init ();
   glutDisplayFunc(desenha);
   glutKeyboardFunc(keyboard);
   glutSpecialFunc(special);
   glutMouseFunc(mouse);
   glutMainLoop();
   return 0;
}
