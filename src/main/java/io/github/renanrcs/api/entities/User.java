package io.github.renanrcs.api.entities;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1;

    @EqualsAndHashCode.Include
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String password;
}
