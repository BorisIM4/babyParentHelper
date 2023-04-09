package bg.borismilanov.babyParentHelper.repository;

import bg.borismilanov.babyParentHelper.model.entity.KidsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KidsRepository extends JpaRepository<KidsEntity, Long> {
}
