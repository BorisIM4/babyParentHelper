package bg.borismilanov.babyParentHelper.repository;

import bg.borismilanov.babyParentHelper.model.entity.SleepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SleepRepository extends JpaRepository<SleepEntity, Long> {
}
