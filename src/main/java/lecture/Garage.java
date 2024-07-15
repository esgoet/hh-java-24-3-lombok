package lecture;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Garage {
    private int cars;
    private int drivers;

    public void addVehicle() {
        cars++;
        drivers++;
    }

}
