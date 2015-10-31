package com.classroom.services.infrastructure.persistence.hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.joda.time.LocalDateTime;
import org.springframework.stereotype.Repository;

import com.classroom.services.domain.model.Exams;
import com.classroom.services.domain.model.repositories.IBaseRepository;
import com.classroom.services.domain.model.repositories.IExamMarksRepository;
import com.classroom.services.domain.model.repositories.IExamResultsRepository;
import com.classroom.services.domain.model.repositories.criteria.BaseSearchCriteria;
import com.classroom.services.domain.model.repositories.criteria.ExamResultsSearchCriteria;



@Repository
public class ExamMarksRepository extends BaseRepository<Exams, BaseSearchCriteria> implements IExamMarksRepository{
	
	public Exams getExamMarks(Integer examId) {
	System.out.println("query !! "+examId);
	Exams examMarks = null;
    CriteriaQuery<Exams> query = getCriteriaBuilder().createQuery(
    		Exams.class);
    Root<Exams> from = query.from(Exams.class);
    Predicate[] predicates = new Predicate[1];
    predicates[0] = getCriteriaBuilder().equal(from.get("id"),
    		examId);
    query.where(predicates);
    query.select(from);
    System.out.println("query !! "+query);
    examMarks = getSingleResult(query);

    return examMarks;
	}
    
}
