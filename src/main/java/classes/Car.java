package classes;

import com.sun.istack.internal.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@EqualsAndHashCode
public class Car {

    @NotNull
    private String frame;

    @NotNull
    private Integer wheels;

    private String description;

}
