package com.booking.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "token")
@NoArgsConstructor
public class Token {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "value", nullable = false)
    private String value;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}