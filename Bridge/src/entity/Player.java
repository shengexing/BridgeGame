package entity;

import entity.playercontent.PlayerRole;
import entity.tablecontent.TablePosition;

/**
 * 定义牌手的实体类
 * @author Time
 *
 */
public class Player {
	
	private final static int player_card_num = 13;	// 每位牌手的手牌定义为13张
	
	private TablePosition position;		// 牌手坐的位置
	private Card[] cards = new Card[13]; 	// 牌手的手牌
	private PlayerRole role;	// 牌手扮演的角色
	
	/**
	 * 
	 * @return
	 */
	public TablePosition getPosition() {
		return position;
	}

	/**
	 * 
	 * @param position
	 */
	public void setPosition(TablePosition position) {
		this.position = position;
	}

	/**
	 * 
	 * @return
	 */
	public Card[] getCards() {
		return cards;
	}

	/**
	 * 
	 * @param card
	 */
	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	/**
	 * 
	 * @return
	 */
	public PlayerRole getRole() {
		return role;
	}

	/**
	 * 
	 * @param role
	 */
	public void setRole(PlayerRole role) {
		this.role = role;
	}

	/**
	 * 
	 * @return
	 */
	public static int getPlayerCardNum() {
		return player_card_num;
	}


	/**
	 * Player的缺省构造方法
	 */
	public Player() {
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
