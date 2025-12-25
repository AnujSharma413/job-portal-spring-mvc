package com.telusko.JobApp.repo;

import com.telusko.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo{
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
        new JobPost(
                1,
                "Java Developer",
                "Must have strong experience in Java, Spring Boot, and REST APIs.",
                2,
                Arrays.asList("Java", "Spring Boot", "REST API", "MySQL")
        ),
        new JobPost(
                2,
                "Frontend Developer",
                "Looking for an Angular developer with good UI/UX knowledge.",
                1,
                Arrays.asList("Angular", "TypeScript", "HTML", "CSS")
        ),
        new JobPost(
                3,
                "Full Stack Developer",
                "Must be able to work both on frontend and backend services.",
                3,
                Arrays.asList("Java", "Spring Boot", "Angular", "PostgreSQL")
        ),
        new JobPost(
                4,
                "Python Developer",
                "Experience with Django/Flask and writing optimized backend APIs.",
                2,
                Arrays.asList("Python", "Django", "Flask", "SQLite")
        ),
        new JobPost(
                5,
                "DevOps Engineer",
                "Should have good experience with CI/CD pipelines and cloud platforms.",
                4,
                Arrays.asList("Docker", "Kubernetes", "AWS", "Jenkins")
        )
));
public List<JobPost> getAllJobs(){
    return jobs;
}
public void addJob(JobPost job){
    jobs.add(job);
    System.out.println(jobs);
}

    public JobPost getJob(int postId) {
    for(JobPost job : jobs){
        if(job.getPostId() == postId){
            return job;
        }
    }
    return null;
}

public void updateJob(JobPost jobPost) {
    for(JobPost jobPost1 : jobs){
        if(jobPost1.getPostId() == jobPost.getPostId()){
            jobPost1.setPostProfile(jobPost.getPostProfile());
            jobPost1.setPostDesc(jobPost.getPostDesc());
            jobPost1.setReqExperience(jobPost.getReqExperience());
            jobPost1.setPostTechStack(jobPost.getPostTechStack());
        }
    }
}

public void deleteJob(int postId) {
    for(JobPost jobPost : jobs){
        if(jobPost.getPostId() == postId){
            jobs.remove(jobPost);
        }
    }
}

}

