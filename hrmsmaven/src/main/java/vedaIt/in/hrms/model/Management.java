package vedaIt.in.hrms.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Management {
    @Id
    private int mangntId;
    private String department;
}
