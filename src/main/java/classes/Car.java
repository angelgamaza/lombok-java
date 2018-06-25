package classes;

import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Car {

    @NotNull
    private String frame;

    @NotNull
    private Integer wheels;

    private String description;

}
