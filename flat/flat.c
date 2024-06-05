#include <GL/glut.h>
#include <math.h>

#define PI 3.14159265358979323846
#define WINDOW_WIDTH 800
#define WINDOW_HEIGHT 400

void drawCircle(float cx, float cy, float r) {
    int num_segments = 100;
    glBegin(GL_POLYGON);
    for (int i = 0; i < num_segments; i++) {
        float theta = 2.0f * PI * i / num_segments;
        float x = r * cosf(theta);
        float y = r * sinf(theta);
        glVertex2f(x + cx, y + cy);
    }
    glEnd();
}

void display() {
    glClear(GL_COLOR_BUFFER_BIT);

    glColor3f(1.0f, 1.0f, 1.0f); // Set color to white
    glLoadIdentity();

    float radius = 50.0f;
    float gap = 20.0f;
    float startX = -(3 * radius + 2 * gap);

    for (int i = 0; i < 6; i++) {
        drawCircle(startX + i * (radius * 2 + gap), 0.0f, radius);
    }

    glFlush();
}

void init() {
    glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(-WINDOW_WIDTH / 2, WINDOW_WIDTH / 2, -WINDOW_HEIGHT / 2, WINDOW_HEIGHT / 2);
}

int main(int argc, char** argv) {
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    glutCreateWindow("Connected Circles");
    glutDisplayFunc(display);
    init();
    glutMainLoop();
    return 0;
}
