package classes;

import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class User {

    @NotNull
    private String card_id;

    @NotNull
    private String name;

    @NotNull
    private String surnames;

    @NotNull
    private Car car;

    private String description;

}
