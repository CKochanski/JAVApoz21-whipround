package pl.sda.whipround.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.whipround.model.Whipround;

public interface WhiproundRepository extends JpaRepository<Whipround,Integer> {
}
