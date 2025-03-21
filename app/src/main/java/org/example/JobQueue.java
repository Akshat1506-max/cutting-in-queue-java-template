package org.example;

public class JobQueue {
    private PriorityQueue<Job> queue;

    public JobQueue() {
        queue = new PriorityQueue<>();
    }

    public void insert(Job job) {
        queue.insert(job);
    }

    public void runHighestPriority() {
        if (!queue.isEmpty()) {
            Job highestPriorityJob = queue.extractMax();
            highestPriorityJob.execute();
        } else {
            System.out.println("No jobs left to execute.");
        }
    }
}