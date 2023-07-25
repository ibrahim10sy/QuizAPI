package telusko.demo.QuizDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telusko.demo.QuizDemo.Questions;

public interface QuestionDAO extends JpaRepository<Questions, Integer>{
    
}
