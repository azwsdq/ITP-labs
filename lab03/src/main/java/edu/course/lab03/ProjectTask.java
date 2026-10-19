package edu.course.lab03;



public class ProjectTask {
    private int effort;
    private TaskStatus status;
    ProjectTask(int effort, TaskStatus status) {
        if (effort < 0 || effort > 4) {
            throw new IllegalArgumentException("effort cant be less then 0, or greater then 4");
        }
        this.effort = effort;
        this.status = status;
    }

    public int getEffort() {
        return effort;
    }


    public TaskStatus getStatus() {
        return status;
    }

}
