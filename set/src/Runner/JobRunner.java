package Runner;

import com.frozen.collection.set.Jobs;

import java.util.*;

public class JobRunner {

     {
    }

    public static void main(String[] args) {
        Set<String> jobRunners = new HashSet<>();
        jobRunners.add("Developer");
        jobRunners.add("Designer");
        jobRunners.add("Manager");
        jobRunners.add("developer");
        System.out.println(jobRunners);
        System.out.println("searching Manager:");
        jobRunners.stream().filter(c->c.contains("Manager")).map(c->c.toUpperCase()).forEach(System.out::println);
        System.out.println("searching Developer:");
        jobRunners.stream().filter(c->c.contains("Developer")).map(L->L.toLowerCase()).forEach(System.out::println);
        System.out.println("-------------operations-----------------");
        Set<String> anotherJobs = new HashSet<>();
        anotherJobs.add("Developer");
        anotherJobs.add("Teacher");
        anotherJobs.add("Manager");

      /**  System.out.println("Difference:");
        anotherJobs.remove(jobRunners);
        System.out.println(anotherJobs);

        System.out.println("Union:");
        anotherJobs.addAll(jobRunners);
        System.out.println(anotherJobs);

        System.out.println("Intersection:");
        anotherJobs.retainAll(jobRunners);
        System.out.println(anotherJobs);*/


        System.out.println("Set equality:");
        boolean isEqual = jobRunners.equals(anotherJobs);
        System.out.println("Are two sets equal: " + isEqual);

        System.out.println("Subset check:");
        boolean isSubset = jobRunners.containsAll(anotherJobs);
        System.out.println("Is anotherJobs subset of jobRunners: " + isSubset);

        System.out.println("Converting to List:");
        List<String> listJobs = new ArrayList<>(jobRunners);
        for (int i = 0; i < listJobs.size(); i++) {
            System.out.println(listJobs.get(i));
        }

        System.out.println("Custom object sets:");
        Set<Jobs> jobsSet = new HashSet<>();
        jobsSet.add(new Jobs("Developer"));
        jobsSet.add(new Jobs("Designer"));
        jobsSet.add(new Jobs("Manager"));
        for (Jobs job : jobsSet) {
            System.out.println(job);
        }

        System.out.println("TreeSet:");
        Set<String> treeJobs = new TreeSet<>();
        treeJobs.addAll(jobRunners);
        for (String job : treeJobs) {
            System.out.println(job);
        }

        System.out.println("Set iteration:");
        for (String job : jobRunners) {
            System.out.println(job);

            System.out.println(jobRunners);
            System.out.println("---------");
            System.out.println(anotherJobs);


            System.out.println("Removing specific jobs:");
            jobRunners.remove("Developer");
            System.out.println(jobRunners);

            System.out.println("Set size:");
            int size = jobRunners.size();
            System.out.println("Number of unique jobs: " + size);

            System.out.println("Clearing set:");
            jobRunners.clear();
            System.out.println(jobRunners);


        }

    }

}
