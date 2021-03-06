package ch.bfh.bti7081.s2018.white.pms.common.model.user;

import ch.bfh.bti7081.s2018.white.pms.common.model.PmsType;

import java.time.LocalDate;

public abstract class User extends PmsType {

    private String name;

    private String surname;

    private LocalDate dateOfBirth;

    private String email;

    private String passwordHash;

}
