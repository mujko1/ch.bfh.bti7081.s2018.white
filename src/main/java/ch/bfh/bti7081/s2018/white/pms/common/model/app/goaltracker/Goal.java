package ch.bfh.bti7081.s2018.white.pms.common.model.app.goaltracker;

import ch.bfh.bti7081.s2018.white.pms.common.model.PmsType;
import ch.bfh.bti7081.s2018.white.pms.common.model.user.User;

import java.time.LocalDateTime;

public class Goal extends PmsType {

    private LocalDateTime created;

    private LocalDateTime dueTo;

    private User creator;

    private String goal;

    private GoalState state;

}
