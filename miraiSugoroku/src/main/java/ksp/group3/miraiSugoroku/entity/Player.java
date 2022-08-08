package ksp.group3.miraiSugoroku.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
    int playerId;
    // Long sugorokuId;
    // String icon;
    String name;
    // int order;
    // Boolean isGoaled;
    int points;
    int position;
    Boolean isBreak;
}
