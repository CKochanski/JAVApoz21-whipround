package pl.sda.whipround.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.whipround.repository.DonationRepository;

@AllArgsConstructor
@Service
public class DonationService {

    private final DonationRepository donationRepository;

    public int createDonation()
}
