
package main;

import controller.ProjectController;
import model.Project;

public class Main {
    
    public static void main(String[] args) {
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("description");
        projectController.save(project);
        
//        project.setName("Novo nome do projeto");
//        projectController.update(project);
//        
//        List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos = " + projects.size());
//        
//        TaskController taskController = new TaskController();
//        
//        Task task = new Task();
//        task.setName("Criar as telas da aplicação");
//        task.setDescription("Devem ser criadas telas para os cadastros");
//        task.setNotes("Sem notas");
//        task.setIsCompleted(false);
//        task.setDeadline(new Date);
//        
//        tasksController.save(task);
//        
//        task.setName("Alterar telas da aplicação");
//        taskController.update(task);
//        List<Task> tasks = taskController.getAll();
//        System.out.println("Total de tarefas = " + tasks.size());;
        
    }
}
