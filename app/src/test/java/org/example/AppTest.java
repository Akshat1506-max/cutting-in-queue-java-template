package org.example;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void testJobExecutionOrder() {
        JobQueue jobQueue = new JobQueue();
        Job jobA = new Job("A", 3);
        Job jobB = new Job("B", 1);
        Job jobC = new Job("C", 5);

        jobQueue.insert(jobA);
        jobQueue.insert(jobB);
        jobQueue.insert(jobC);

        jobQueue.runHighestPriority(); // Should run jobC (priority 5)
        jobQueue.runHighestPriority(); // Should run jobA (priority 3)
        jobQueue.runHighestPriority(); // Should run jobB (priority 1)
    }
}