package ksp.group3.miraiSugoroku.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Event {
    @Id
    @GeneratedValue
    long eventID;

    int nGroups;

    Date startDate;

    Date limitDate;

    String name;
}