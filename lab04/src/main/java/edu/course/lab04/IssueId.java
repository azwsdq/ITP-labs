package edu.course.lab04;


import java.util.Objects;

public final class IssueId {
    private final String projectCode;
    private final int number;

    IssueId(String projectCode, int number) {
        this.projectCode = projectCode;
        this.number = number;
    }

    String getProjectCode() {
        return projectCode;
    }

    int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } if (!(obj instanceof IssueId)) {
            return false;
        }
        IssueId other = (IssueId) obj;
        return this.number == other.number
                && Objects.equals(this.projectCode, other.projectCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectCode, number);
    }
}
