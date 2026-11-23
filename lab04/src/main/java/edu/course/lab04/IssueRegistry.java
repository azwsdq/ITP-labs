package edu.course.lab04;

import java.util.HashMap;


public class IssueRegistry<K, V> {
    private final HashMap<K, V> tasks = new HashMap<>();

    public void put(K id, V task) {
        tasks.put(id, task);
    }

    public V get(K id) {
        return tasks.get(id);
    }

    public V remove(K id) {
        return tasks.remove(id);
    }

    public boolean containsKey(K id) {
        return tasks.containsKey(id);
    }

    public int size() {
        return tasks.size();
    }
}

