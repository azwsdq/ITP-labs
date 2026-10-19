package edu.course.lab02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ProjectTaskTest {
    @Test
    void constructorCreatesValidTask() {
        ProjectTask task = new ProjectTask("task", "test", TaskStatus.TODO, 1);

        assertFalse(task.isCompleted());
        assertEquals(1, task.getEstimatedHours());
    }

    @Test
    void constructorRejectsNullId() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProjectTask(null, "test", TaskStatus.TODO, 4));
    }

    @Test
    void constructorRejectsEmptyId() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProjectTask("", "test", TaskStatus.TODO, 4));
    }

    @Test
    void constructorRejectsBlankId() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProjectTask("   ", "test", TaskStatus.TODO, 4));
    }

    @Test
    void constructorRejectsNullTitle() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProjectTask("task", null, TaskStatus.TODO, 4));
    }

    @Test
    void constructorRejectsEmptyTitle() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProjectTask("task", "", TaskStatus.TODO, 4));
    }

    @Test
    void constructorRejectsBlankTitle() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProjectTask("task", "   ", TaskStatus.TODO, 4));
    }

    @Test
    void constructorRejectsNullStatus() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProjectTask("task", "test", null, 4));
    }

    @Test
    void constructorRejectsZeroEstimatedHours() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProjectTask("task", "test", TaskStatus.TODO, 0));
    }

    @Test
    void constructorRejectsNegativeEstimatedHours() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProjectTask("task", "test", TaskStatus.TODO, -1));
    }

    @Test
    void completedTaskIsCompleted() {
        ProjectTask task = new ProjectTask("task", "test", TaskStatus.COMPLETED, 4);

        assertTrue(task.isCompleted());
    }

    @Test
    void changeStatusUpdatesCompletion() {
        ProjectTask task = new ProjectTask("task", "test", TaskStatus.TODO, 4);

        task.changeStatus(TaskStatus.IN_PROGRESS);
        assertFalse(task.isCompleted());

        task.changeStatus(TaskStatus.COMPLETED);
        assertTrue(task.isCompleted());

        task.changeStatus(TaskStatus.TODO);
        assertFalse(task.isCompleted());
    }

    @Test
    void changeStatusRejectsNullAndPreservesCompletion() {
        ProjectTask task = new ProjectTask("task", "test", TaskStatus.COMPLETED, 4);

        assertThrows(IllegalArgumentException.class, () -> task.changeStatus(null));

        assertTrue(task.isCompleted());
    }

    @Test
    void increaseEstimatedHoursAddsToCurrentEstimate() {
        ProjectTask task = new ProjectTask("task", "test", TaskStatus.TODO, 4);

        task.increaseEstimatedHours(2);
        assertEquals(6, task.getEstimatedHours());

        task.increaseEstimatedHours(1);
        assertEquals(7, task.getEstimatedHours());
    }

    @Test
    void increaseEstimatedHoursRejectsZeroAndPreservesEstimate() {
        ProjectTask task = new ProjectTask("task", "test", TaskStatus.TODO, 4);

        assertThrows(IllegalArgumentException.class, () -> task.increaseEstimatedHours(0));

        assertEquals(4, task.getEstimatedHours());
    }

    @Test
    void increaseEstimatedHoursRejectsNegativeAmountAndPreservesEstimate() {
        ProjectTask task = new ProjectTask("task", "test", TaskStatus.TODO, 4);

        assertThrows(IllegalArgumentException.class, () -> task.increaseEstimatedHours(-1));

        assertEquals(4, task.getEstimatedHours());
    }
}
