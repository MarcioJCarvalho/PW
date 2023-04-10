package io.github.marciojcarvalho.api_pw.repository;

import io.github.marciojcarvalho.api_pw.entity.Commit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommitRepository extends JpaRepository<Commit, Long> {

}
