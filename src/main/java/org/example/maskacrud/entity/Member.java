package org.example.maskacrud.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "members")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Member {

    @Id
    @Column(name = "membership_number")
    private String membershipNumber;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identification_document")
    private String identificationDocument;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "membership_date")
    private LocalDate membershipDate;

    @Column(name = "license_expiration_date")
    private LocalDate licenseExpirationDate;

    @Override
    public String toString() {
        return "\n----------------------------------------\nMember{" +
                "membershipNumber='" + membershipNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
