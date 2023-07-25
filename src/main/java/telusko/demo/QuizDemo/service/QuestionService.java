package telusko.demo.QuizDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import telusko.demo.QuizDemo.Questions;
import telusko.demo.QuizDemo.dao.QuestionDAO;

@Service
public class QuestionService {

    @Autowired
    QuestionDAO questionDAO;

    public List<Questions> getAllQuestions() {
       return questionDAO.findAll();
    }
    
}
