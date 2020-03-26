package com.JoeA42;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.opengl.GL;


public class Main {

    public Main(){
        if (!glfwInit()){ // Initializes GLFW returns false if failed
            System.err.println("GLFW failed to initialize!");
            System.exit(1);
        }

        long win = glfwCreateWindow(640,480,"Window",0,0);

        glfwShowWindow(win);

        glfwMakeContextCurrent(win);

        GL.createCapabilities();

        while(!glfwWindowShouldClose(win)){
            glfwPollEvents();

            glClear(GL_COLOR_BUFFER_BIT);

            glBegin(GL_QUADS);
                glColor4f(1,0,0,0);
                glVertex2f(-0.5f,0.5f);

                glColor4f(0,1,0,0);
                glVertex2f(0.5f,0.5f);

                glColor4f(0,0,1,0);
                glVertex2f(0.5f,-0.5f);

                glColor4f(1,1,1,0);
                glVertex2f(-0.5f,-0.5f);
            glEnd();

            glfwSwapBuffers(win);
        }

        glfwTerminate();
    }

    public static void main(String[] args){
        new Main();
    }
}