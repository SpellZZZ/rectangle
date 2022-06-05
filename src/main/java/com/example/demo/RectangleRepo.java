package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RectangleRepo extends CrudRepository<Rectangle, Long> {

    @Query(nativeQuery = true, value = "select * from rectangle " +
                                        "where rectangle.height*2 + rectangle.width*2 > :size")
    List<Rectangle> getBigRec(@Param("size") int size);

    @Query(nativeQuery = true, value = "select * from rectangle " +
            "where rectangle.height*2 + rectangle.width*2 <= :size")
    List<Rectangle> getSmalRec(@Param("size") int size);


}
