package shelter.backend.rest.model.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import shelter.backend.rest.model.enums.AdoptionStatus;
import shelter.backend.rest.model.enums.AdoptionType;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdoptionDto2 {

    private Long id;
    private AdoptionType adoptionType;
    private AdoptionStatus adoptionStatus;
    private LocalDate validUntil;
    private UserDto user;
    @JsonProperty("animal")
    private AnimalDto animalDto;
}
