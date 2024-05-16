package com.astrie.smartmis;

import com.astrie.smartmis.model.*;
import com.astrie.smartmis.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.astrie.smartmis.model.Sections;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SmartmisApplication {

	public static void main(String[] args) {

		SpringApplication.run(SmartmisApplication.class, args);
	}
	@Bean
CommandLineRunner commandLineRunner(SectionRepository sectionRepo) {
		return args -> {
			Student student = new Student("keza", "jeanne","jeannekeza@gmail.com", -100_000);
			Sections s1 = new Sections("year two", student);
			sectionRepo.save(s1);
		};
	}

	@Bean
CommandLineRunner commandLineRunnerThree(TutorRepository tutorRepo) {
		return args -> {

			Subject subject = new Subject("dsa", "tech");
			Tutor t1 = new Tutor("kagabo", "jean", 34, "kagabojean@gmail.com", "RCA", subject);
			tutorRepo.save(t1);
		};
}

@Bean
CommandLineRunner commandLineRunnerFour(CookRepository cookRepo) {
		return args -> {
			Cook c1 = new Cook("kibonke", "samuel", "kibongesam@gmail.com",40);
			cookRepo.save(c1);
		};
}

@Bean
CommandLineRunner commandLineRunnerFive(JanitorRepository janitorrepo) {
		return args -> {
			Janitors j1 = new Janitors("keza", "nadia", "nadiakeza@gmail.com", 23);
			Janitors j2 = new Janitors("mukunzi", "yannick", "mukunziyannick@gmail.com", 23);
			Janitors j3 = new Janitors("kaliza", "nadia", "kalizadiane@gmail.com", 23);

			janitorrepo.save(j1);
			List<Janitors> janitors = new ArrayList<Janitors>();
			janitors.add(j2);
			janitors.add(j3);
			janitorrepo.saveAll(janitors);

			List<Janitors> savedJanitors = janitorrepo.findAll();
			for (Janitors j: savedJanitors) {
				System.out.println(j.getId() + " " + j.getFname() + " " + j.getLname());
			}
			List<Janitors> sameNames = janitorrepo.findByLname("nadia");
					for(Janitors j : sameNames) {
				System.out.println(j.getId() + " " + j.getLname());
			}
		};
}
}
