/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Calum
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        task testTask = new task(1, "testTask");
        task testTask2 = new task(1, "testTask2");
        testTask.addSucessor(testTask2);
        task testTask3 = new task(1, "testTask3");
    }
    
}