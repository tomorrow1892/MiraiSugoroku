package ksp.group3.miraiSugoroku.repository;

import ksp.group3.miraiSugoroku.entity.SquareCreater;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreaterRepository extends CrudRepository<SquareCreater, Long> {
    List<SquareCreater> findByEventID(long id);
    List<SquareCreater> findByEventAndGroup(long eventID, int group);
    List<SquareCreater> findByNickname(String nickname);
}
