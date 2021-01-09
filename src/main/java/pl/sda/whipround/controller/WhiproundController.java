package pl.sda.whipround.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.whipround.model.WhiproundDTO;
import pl.sda.whipround.service.WhiproundService;

@AllArgsConstructor
@RestController
public class WhiproundController {

    private final WhiproundService whiproundService;

    @PostMapping("/whipround")
    public int createWhipround(@RequestBody WhiproundDTO whiproundDTO) {
        return whiproundService.createWhipround(whiproundDTO);
    }


}
