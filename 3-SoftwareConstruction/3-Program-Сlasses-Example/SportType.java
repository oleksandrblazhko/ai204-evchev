package com.nuop.mobileProject.model.SportType;

import com.nuop.mobileProject.model.ActiveCompetition.ActiveCompetition;
import com.nuop.mobileProject.model.CompletedCompetition.CompletedCompetition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sportType")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class SportType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private Long id;

    private String type;

    @ManyToMany(mappedBy = "sportTypes")
    private List<ActiveCompetition> activeCompetitions;

    @ManyToMany(mappedBy = "sportTypes")
    private List<CompletedCompetition> completedCompetitions;

}
