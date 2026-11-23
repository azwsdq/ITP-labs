package edu.course.lab04;

import org.junit.jupiter.api.Test;

import javax.xml.crypto.dsig.keyinfo.X509IssuerSerial;

import static org.junit.jupiter.api.Assertions.*;

public class IssueRegistryTest {
    @Test
    void findsTaskByEqualId(){
        IssueRegistry<IssueId, ProjectTask> registry = new IssueRegistry<>();
        IssueId first = new IssueId("ITP", 21);
        IssueId second = new IssueId("ITP", 21);
        ProjectTask task = new ProjectTask("asdsada");

        registry.put(first, task);
        assertSame(task, registry.get(second));
    }

    @Test
    void replacesTaskWithoutIncreasingSize() {
        IssueRegistry<IssueId, ProjectTask> registry = new IssueRegistry<>();
        IssueId first = new IssueId("ITP", 21);
        IssueId second = new IssueId("ITP", 21);

        ProjectTask task1 = new ProjectTask("asd");
        ProjectTask task2 = new ProjectTask("dsa");

        registry.put(first, task1);
        registry.put(second, task2);

        assertSame(task2, registry.get(first));
        assertEquals(1, registry.size());
    }


    @Test
    void removesTask() {
        IssueRegistry<IssueId, ProjectTask> registry = new IssueRegistry<>();
        IssueId id = new IssueId("ITP", 42);
        ProjectTask task = new ProjectTask("asd");
        registry.put(id, task);
        assertEquals(1, registry.size());

        ProjectTask removed = registry.remove(id);

        assertSame(task, removed);
        assertFalse(registry.containsKey(id));
        assertNull(registry.get(id));
        assertEquals(0, registry.size());
    }

    @Test
    void containsIdAfterAddingTask() {
        IssueRegistry<IssueId, ProjectTask>  registry = new IssueRegistry<>();
        IssueId id = new IssueId("ITP", 42);
        ProjectTask task = new ProjectTask("aasdf");

        assertFalse(registry.containsKey(id));

        registry.put(id, task);

        assertTrue(registry.containsKey(id));
    }

    @Test
    void emptyRegistryHasSizeZero() {
        IssueRegistry<IssueId, ProjectTask> registry = new IssueRegistry<>();

        assertEquals(0, registry.size());
    }
}
