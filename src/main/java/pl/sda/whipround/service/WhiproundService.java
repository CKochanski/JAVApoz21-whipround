package pl.sda.whipround.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.whipround.model.Whipround;
import pl.sda.whipround.model.WhiproundDTO;
import pl.sda.whipround.repository.WhiproundRepository;

@AllArgsConstructor
@Service
public class WhiproundService {

    private final WhiproundRepository whiproundRepository;



    public int createWhipround(WhiproundDTO whiproundDTO) {
        Whipround whipround = toEntity(whiproundDTO);
        return whiproundRepository.save(whipround).getId();
    }

    private Whipround toEntity(WhiproundDTO whiproundDTO) {
        Whipround whipround = Whipround.builder()
                .name(whiproundDTO.getName())
                .goal(whiproundDTO.getGoal())
                .description(whiproundDTO.getDescription())
                .build();
        return whipround;
    }

}
