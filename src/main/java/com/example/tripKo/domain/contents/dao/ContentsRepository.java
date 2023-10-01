package com.example.tripKo.domain.contents.dao;

import com.example.tripKo.domain.contents.entity.Contents;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ContentsRepository extends JpaRepository<Contents, Long> {

//  Optional<Contents> findByIdAndIdNot(Long id, Long virtualId);

  @Query("SELECT c FROM Contents c WHERE c.id = :id")
  Optional<Contents> findFestivalById(@Param("id") Long id);

}
