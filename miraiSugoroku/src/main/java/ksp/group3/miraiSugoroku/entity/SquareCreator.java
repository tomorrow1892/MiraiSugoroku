package ksp.group3.miraiSugoroku.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SquareCreator {
    @Id
    @GeneratedValue
    long createID;

    String loginID;

    long eventID;

    int group;

    boolean isPermitted;

    String name;

    String nickname;
}
