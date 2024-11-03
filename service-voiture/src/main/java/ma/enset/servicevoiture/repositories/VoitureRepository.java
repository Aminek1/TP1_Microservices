package ma.enset.servicevoiture.repositories;

import ma.enset.servicevoiture.entites.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture,Long> {
}
