package com.nuop.mobileProject.model.ActiveCompetition;

import com.nuop.mobileProject.model.SportType.SportType;
import com.nuop.mobileProject.model.User.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "activeCompetition")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ActiveCompetition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comp_id")
    private Long id;

    private String name;
    private String address;
    private int participantsNumber;
    private Date date;

    @ManyToMany
    @JoinTable(name = "activeComp_types",
            joinColumns = @JoinColumn(name = "comp_id"),
            inverseJoinColumns = @JoinColumn(name = "types_id"))

    private List<SportType> sportTypes = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "activeComp_sponsors",
            joinColumns = @JoinColumn(name = "comp_id"),
            inverseJoinColumns = @JoinColumn(name = "sponsor_id"))
    private List<User> sponsors = new ArrayList<>();
}
