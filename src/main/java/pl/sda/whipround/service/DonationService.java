package pl.sda.whipround.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.whipround.model.Donation;
import pl.sda.whipround.model.DonationDTO;
import pl.sda.whipround.model.Whipround;
import pl.sda.whipround.repository.DonationRepository;
import pl.sda.whipround.repository.WhiproundRepository;

@AllArgsConstructor
@Service
public class DonationService {

    private final DonationRepository donationRepository;
    private final WhiproundRepository whiproundRepository;

    public int createDonation(DonationDTO donationDTO) {
        Donation donation = toEntity(donationDTO);
        Donation savedDonation = donationRepository.save(donation);
        Whipround whipround = whiproundRepository.getOne(donationDTO.getWhiproundId());
        whipround.getDonations().add(savedDonation);
        whiproundRepository.save(whipround);
        return savedDonation.getId();
    }

    private Donation toEntity(DonationDTO donationDTO) {
        Donation donation = Donation.builder()
                .name(donationDTO.getName())
                .value(donationDTO.getValue())
                .message(donationDTO.getMessage())
                .build();
        return donation;
    }
}
