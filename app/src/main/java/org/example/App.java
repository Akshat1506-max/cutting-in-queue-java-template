package org.example;

public class App {
    public static void main(String[] args) {
        JobQueue jobQueue = new JobQueue();

        Job jobA = new Job("This is job A", 5);
        Job jobB = new Job("This is job B", 2);
        Job jobC = new Job("This is job C", 9);
        Job jobD = new Job("This is job D", 8);
        Job jobE = new Job("This is job E", 1);

        jobQueue.insert(jobA);
        jobQueue.insert(jobB);
        jobQueue.insert(jobC);
        jobQueue.insert(jobD);
        jobQueue.insert(jobE);

        jobQueue.runHighestPriority(); // Calls jobC.execute()
        jobQueue.runHighestPriority(); // Calls jobD.execute()
        jobQueue.runHighestPriority(); // Calls jobA.execute()
        jobQueue.runHighestPriority(); // Calls jobB.execute()
        jobQueue.runHighestPriority(); // Calls jobE.execute()
        jobQueue.runHighestPriority(); // No jobs left
    }
}