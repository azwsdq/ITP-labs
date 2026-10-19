package edu.course.lab03;

public class ProjectTask {
    int effort;
    String status;
    ProjectTask(int effort, String status) {
        if (effort < 0 || effort > 4) {
            throw new IllegalArgumentException("effort cant be less then 0, or greater then 4");
        }
        this.effort = effort;
        this.status = status;
    }
}
