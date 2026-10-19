package edu.course.lab03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class PriorityTests {
    @Test
    public void EffortPriorityPolicyTest() {
        PriorityPolicy policy = new EffortPriorityPolicy();
        int result1 = policy.calculatePriority(new ProjectTask(2, TaskStatus.IN_PROGRESS));
        int result2 = policy.calculatePriority(new ProjectTask(2, TaskStatus.COMPLETED));

        assertEquals(2, result1);
        assertEquals(2, result2);
    }

    @Test
    public void StatusPriorityPolicyCompleted() {
        PriorityPolicy policy = new StatusPriorityPolicy();
        int result = policy.calculatePriority(new ProjectTask(3, TaskStatus.COMPLETED));

        assertEquals(3, result);
    }
    @Test
    public void StatusPriorityPolicyTODO() {
        PriorityPolicy policy = new StatusPriorityPolicy();
        int result = policy.calculatePriority(new ProjectTask(3, TaskStatus.TODO));

        assertEquals(1, result);
    }

    @Test
    public void TaskPrioritizerTest() {
        ProjectTask first = new ProjectTask(3, TaskStatus.TODO);
        ProjectTask second = new ProjectTask(2, TaskStatus.IN_PROGRESS);

        TaskPrioritizer byEffort = new TaskPrioritizer(new EffortPriorityPolicy());
        TaskPrioritizer byStatus = new TaskPrioritizer(new StatusPriorityPolicy());

        assertSame(first, byEffort.choose(first, second));
        assertSame(second, byStatus.choose(first, second));
    }

}
