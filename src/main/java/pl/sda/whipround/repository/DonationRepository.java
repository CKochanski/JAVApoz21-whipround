package pl.sda.whipround.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.whipround.model.Donation;

public interface DonationRepository extends JpaRepository<Donation, Integer> {
}
