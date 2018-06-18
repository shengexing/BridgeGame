package dao;

import java.util.List;

import entity.Contract;
import entity.Player;
import entity.Round;

public interface IGamesDao {
	
	// 保存一局游戏
	public boolean saveGame(Player[] player, Round round, List<Contract> contracts);

}
