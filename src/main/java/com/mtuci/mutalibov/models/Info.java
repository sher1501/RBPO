package com.mtuci.mutalibov.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "info")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Info {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ManyToMany(mappedBy = "infos")
    private List<Main> mains;
}
