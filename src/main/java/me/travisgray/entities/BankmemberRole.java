package me.travisgray.entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by ${TravisGray} on 11/17/2017.
 */
@Entity
public class BankmemberRole {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String bankuser;

//    FetchType.LAZY is a hint to the JPA runtime, indicating that you want to defer loading of the field until you access it.
//    This is called lazy loading. Lazy loading is completely transparent;
//    data is loaded from the database in objects silently when you attempt to read the field for the first time.
    @ManyToMany(mappedBy = "bankmemberroles", fetch =FetchType.LAZY)
    private Collection<BankMember>  bankmembers;

}
1