package com.thirty.api.service;

import com.thirty.api.domain.Member;
import com.thirty.api.domain.Quiz;
import com.thirty.api.persistence.MemberRepository;
import com.thirty.api.persistence.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ByeongChan on 2018. 1. 19..
 */

@Service
public class QuizService {
    @Autowired
    QuizRepository quizRepository;

    @Autowired
    MemberRepository memberRepository;

    public void save(Quiz quiz){ quizRepository.save(quiz); }

//    public List<Quiz> randomSampling(){
//
//        Member member = memberRepository.randomSampling();
//
//        return null;
//    }
}
