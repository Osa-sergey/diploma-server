package osa.dev.petproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import osa.dev.petproject.models.db.ReachabilityBS;

public interface ReachabilityBSRepository extends JpaRepository<ReachabilityBS, Long> {
}
