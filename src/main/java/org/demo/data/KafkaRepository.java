package org.demo.data;

import org.demo.model.KafkaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KafkaRepository extends JpaRepository<KafkaData,Integer> {
}
