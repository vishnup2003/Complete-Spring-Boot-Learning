package in.strikes.jpaRelationshipDemo2.repository;

import in.strikes.jpaRelationshipDemo2.model.Profile;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class ProfileRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Profile profile){
        entityManager.persist(profile);
    }
}
