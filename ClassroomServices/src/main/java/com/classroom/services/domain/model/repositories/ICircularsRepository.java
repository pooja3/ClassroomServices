package com.classroom.services.domain.model.repositories;

import java.util.List;

import org.joda.time.LocalDateTime;

import com.classroom.services.domain.model.Circulars;
import com.classroom.services.domain.model.CircularsBatch;
import com.classroom.services.domain.model.repositories.criteria.CircularsSearchCriteria;
import com.classroom.services.facade.dto.entities.CircularBatchSearchDTO;
import com.classroom.services.facade.dto.entities.CircularSearchDTO;


public interface ICircularsRepository extends IBaseRepository<Circulars>{

	List<Circulars> getCircular(CircularSearchDTO searchDTO);
	
	//List<CircularsBatch> getCircularBatch(CircularBatchSearchDTO searchDTO);

	//List<Circulars> getCircular(LocalDateTime startDate);

	//List<Circulars> get(LocalDateTime startDate);

	//List<Circulars> getCircularsDetails(CircularsSearchCriteria criteria);
}
