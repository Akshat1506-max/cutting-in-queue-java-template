package org.example;

public class Job implements Comparable<Job> {
    private String name;
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public void execute() {
        System.out.println("Running the job with name " + this.name + " and priority " + this.priority);
    }

    public String getName() {
        return this.name;
    }

    public int getPriority() {
        return this.priority;
    }

    @Override
    public int compareTo(Job other) {
        return Integer.compare(this.priority, other.priority);
    }
}