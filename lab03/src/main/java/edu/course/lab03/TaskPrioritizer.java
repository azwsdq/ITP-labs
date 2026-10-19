package edu.course.lab03;

import java.awt.color.ProfileDataException;

public class TaskPrioritizer {
    private final PriorityPolicy policy;
    public TaskPrioritizer(PriorityPolicy policy) {
        this.policy = policy;
    }

    public ProjectTask choose(ProjectTask first, ProjectTask second) {
        int firstPriority = policy.calculatePriority(first);
        int secondPriority = policy.calculatePriority(second);

        if (firstPriority >= secondPriority) {
            return first;
        }

        return second;
    }
}
