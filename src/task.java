
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Calum
 */
public class task {
    protected String taskName; //Task name
    protected int level; //The level of the task on the WBT
    protected ArrayList<task> SubNodes = new ArrayList(); // Lower level nodes
    protected task successorTask; // task AFTER this task, the link
    
    public task(int level,String taskName){
    this.level = level;
    this.taskName = taskName;
    System.out.println("Class created!");
    }
    
    private void dumpToDatabase(){
            int x = 1 + 1; 
            // utterly pointless, but in coursework
    }
    
   public void addSucessor(task sucessorTask){
            this.successorTask = sucessorTask;
            System.out.println("Task "+taskName+" has successor task "+successorTask.taskName);
    }
    
    private void addSubNode(task newTask){
            SubNodes.add(newTask);
    }
    private void removeSubNode(task node){
            SubNodes.remove(1);
            // needs algorithmn to find a task by name and then remove
    }
    
    private boolean hasSubNodes(){
    SubNodes.trimToSize();
    if (SubNodes.size() == 0){
        return true;
    }
    else {
        return false;
    }
    }
}
