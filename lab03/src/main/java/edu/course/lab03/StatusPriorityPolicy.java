package edu.course.lab03;

public class StatusPriorityPolicy implements PriorityPolicy {
    @Override
    public int calculatePriority(ProjectTask task) {
        if (task.getStatus() == TaskStatus.COMPLETED) {
            return 3;
        } else if (task.getStatus() == TaskStatus.IN_PROGRESS) {
            return 2;
        } else {return 1;}
    }
}
