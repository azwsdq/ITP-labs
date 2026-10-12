package edu.course.lab02;

public class ProjectTask {
    private final String id;
    private final String title;
    private TaskStatus status;
    private int estimatedHours;


    public ProjectTask(String id, String title, TaskStatus status, int estimatedHours) {

        if (id == null || id.isBlank()
                || title == null || title.isBlank()
                || status == null
                || estimatedHours <= 0) {
            throw new IllegalArgumentException("Ввели некорректные данные");
        }
        this.id = id;
        this.title = title;
        this.status = status;
        this.estimatedHours = estimatedHours;
    }

    public void changeStatus(TaskStatus newStatus){
        if (newStatus == null) {
            throw new IllegalArgumentException("Статус не может быть null");
        }

        this.status = newStatus;
    };

    public boolean isCompleted() {
        return status == TaskStatus.COMPLETED;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void increaseEstimatedHours(int hours) {
        if (hours <= 0) {
            throw new IllegalArgumentException("Количество часов должно быть положительным");
        }

        estimatedHours += hours;
    }
}
