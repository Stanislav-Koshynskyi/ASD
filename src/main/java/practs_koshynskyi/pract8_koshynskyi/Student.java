package practs_koshynskyi.pract8_koshynskyi;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Student {
    private String name;
    private String surname;
    private String email;
    @EqualsAndHashCode.Include
    private String id;
}
