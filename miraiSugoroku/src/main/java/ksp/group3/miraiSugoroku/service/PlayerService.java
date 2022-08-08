package ksp.group3.miraiSugoroku.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksp.group3.miraiSugoroku.entity.Player;
import ksp.group3.miraiSugoroku.form.GameConfigForm;
import ksp.group3.miraiSugoroku.repository.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository pRepo;

    /**
     * プレイヤーの位置を移動させる
     * 
     * @param playerId 移動させるプレイヤー
     * @param n        移動させるマスの数
     * @return 移動した後のプレイヤーの
     */
    public Player move(Long playerId, int n) {
        Player player = pRepo.findById(playerId).get();
        player.setPosition(player.getPosition() + n);
        return pRepo.save(player);
    }

    /**
     * プレイヤーに休みを設定する
     * 
     * @param playerId 休みを設定するプレイヤー
     * @return 休みを設定したプレイヤー
     */
    public Player enableBreak(Long playerId) {
        Player player = pRepo.findById(playerId).get();
        player.setIsBreak(true);
        return pRepo.save(player);
    }

    /**
     * ポイントを更新する
     * 
     * @param playerId 更新するプレイヤー
     * @param points   ポイントの増減
     * @return
     */
    public Player updatePoints(Long playerId, int points) {
        Player player = pRepo.findById(playerId).get();
        if (player.getPoints() + points < 0) {
            player.setPoints(0);
        } else {
            player.setPoints(player.getPoints() + points);
        }
        return pRepo.save(player);
    }

    /**
     * プレイヤーを作成する
     * 
     * @param form
     * @param sugorokuId
     * @return
     */
    public List<Player> createPlayer(GameConfigForm form, Long sugorokuId) {
        List<Player> _players = form.toPlayerEntityList();
        List<Player> players = new ArrayList<Player>();
        for (int i = 0; i < form.getNPlayers(); i++) {
            Player player = _players.get(i);
            player.setSugorokuId(sugorokuId);
            players.add(player);
            pRepo.save(player);
        }
        return players;
    }

    /**
     * プレイヤーをIDから取得する
     * 
     * @param playerId
     * @return
     */
    public Player getPlayer(Long playerId) {
        return pRepo.findById(playerId).get();
    }

}
