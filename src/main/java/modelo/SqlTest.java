package modelo;
import modelo.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.ArrayList;


@EntityScan
@Table(name="test")
public class SqlTest {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)




}
