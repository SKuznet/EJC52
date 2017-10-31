package com.epam.l10;

public enum Day {
    MON,
    SAT,
    SUN;

    public boolean isDayOff (Day day){
        return day != MON;
    }
}
