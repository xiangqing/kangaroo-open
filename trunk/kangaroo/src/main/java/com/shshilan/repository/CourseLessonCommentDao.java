package com.shshilan.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.shshilan.entity.CourseLessonComment;

/** 
 * @author lanbz 
 * @date 2013-9-17 下午6:33:13 
 * @version 1.0 
 */
public interface CourseLessonCommentDao extends PagingAndSortingRepository<CourseLessonComment, String>{

	
	Page<CourseLessonComment>  findByLessonIdAndState(String id,Integer state,Pageable pageRequest);
}
