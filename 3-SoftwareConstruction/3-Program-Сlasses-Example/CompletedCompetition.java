package com.nuop.mobileProject.model.CompletedCompetition;

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
@Table(name = "completedCompetition")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class CompletedCompetition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comp_id")
    private Long id;

    private String name;
    private String address;
    private int participantsNumber;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "winner_id")
    private User winner;

    @ManyToMany
    @JoinTable(name = "completedComp_types",
            joinColumns = @JoinColumn(name = "comp_id"),
            inverseJoinColumns = @JoinColumn(name = "types_id"))

    private List<SportType> sportTypes = new ArrayList<>();


}
