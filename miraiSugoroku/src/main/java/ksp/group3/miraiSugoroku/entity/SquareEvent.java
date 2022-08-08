package ksp.group3.miraiSugoroku.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SquareEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long squareEventId;
    int actionNumber;
    int argument;
    String eventTitle;

}
