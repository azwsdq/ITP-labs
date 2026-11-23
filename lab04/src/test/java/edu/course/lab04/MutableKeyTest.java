package edu.course.lab04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

public class MutableKeyTest {
    private static class MutableKey {
        private int number;

        MutableKey(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        void setNumber(int number) {
            this.number = number;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MutableKey)) {
                return false;
            }
            MutableKey other = (MutableKey) obj;
            return this.number == other.number;
        }

        @Override
        public int hashCode() {
            return number;
        }
    }

    @Test
    void failsToFindEntryAfterKeyFieldChanges() {
        HashMap<MutableKey, ProjectTask> tasks = new HashMap<>();
        MutableKey key = new MutableKey(0);
        ProjectTask task = new ProjectTask("asd");

        tasks.put(key, task);

        assertSame(task, tasks.get(key));

        key.setNumber(1);

        assertNull(tasks.get(key));
        assertEquals(1, tasks.size());
    }
}
