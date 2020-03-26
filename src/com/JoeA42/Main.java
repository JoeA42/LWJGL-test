package com.JoeA42;
import static org.lwjgl.glfw.GLFW.*;
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
        }

        glfwTerminate();
    }

    public static void main(String[] args){
        new Main();
    }
}