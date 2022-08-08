package ksp.group3.miraiSugoroku.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SquareCreater {
    @Id
    @GeneratedValue
    long createID;

    int loginID;

    long eventID;

    int group;

    boolean isPermitted;

    String name;

    String nickname;
}
