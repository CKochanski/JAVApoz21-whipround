package pl.sda.whipround.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.whipround.model.DonationDTO;
import pl.sda.whipround.service.DonationService;

@AllArgsConstructor
@RestController
public class DonationController {

    private final DonationService donationService;

    @PostMapping("/donation")
    public int createDonation(@RequestBody DonationDTO donationDTO) {
        return donationService.createDonation(donationDTO);
    }
}
