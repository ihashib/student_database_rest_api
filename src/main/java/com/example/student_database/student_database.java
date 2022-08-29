package com.example.student_database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class student_database {

	public static void main(String[] args) {

		SpringApplication.run(student_database.class, args);
	}

	@Bean
	CommandLineRunner runner(Student_Repo repo, MongoTemplate mongot)
	{
		String student_id = "17301196";
		return args ->
		{
			address addr = new address(
					"TB gate",
					"1/2",
					"Dhaka",
					"1213"
			);
			Favorite_subjects fav_subs = new Favorite_subjects(
					5,
					"Physics",
					"Math",
					"Engish"
			);
			Student student = new Student(
					"Hashib",
					"islam",
					"ihashib2@gmail.com",
					addr,
					student_id,
					Gender.MALE,
					fav_subs,
					2000,
					LocalDateTime.now()
			);

			Query query = new Query();
			query.addCriteria(Criteria.where("student_id").is(student_id));

			List<Student> items = mongot.find(query, Student.class);

			if(items.size() > 1)
			{
				throw new IllegalStateException("Illegal Student ID"+student_id);
			}

			if(items.isEmpty())
			{
				repo.insert(student);
			}

		};
	}
}
