package entity;

/**
 * 一个完整叫牌回合的类
 * @author Time
 *
 */
public class Round {
	
	private int id;		// 游戏回合编号
	private String time;	// 游戏回合开始时间
	private String positionN;	// 北方玩家的用户名
	private String positionE;	// 东方玩家的用户名
	private String positionS;	// 南方玩家的用户名
	private String positionW;	// 西方玩家的用户名
	private String target;		// 游戏回合的定约
	private int firstPlayer;	// 游戏回合第一位叫牌的玩家的方位
	private int banker;		// 游戏回合的庄家的方位
	

	public Round() {
		super();
	}

	public Round(int id, String time, String positionN, String positionE,
			String positionS, String positionW, String target, int firstPlayer,
			int banker) {
		super();
		this.id = id;
		this.time = time;
		this.positionN = positionN;
		this.positionE = positionE;
		this.positionS = positionS;
		this.positionW = positionW;
		this.target = target;
		this.firstPlayer = firstPlayer;
		this.banker = banker;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPositionN() {
		return positionN;
	}

	public void setPositionN(String positionN) {
		this.positionN = positionN;
	}

	public String getPositionE() {
		return positionE;
	}

	public void setPositionE(String positionE) {
		this.positionE = positionE;
	}

	public String getPositionS() {
		return positionS;
	}

	public void setPositionS(String positionS) {
		this.positionS = positionS;
	}

	public String getPositionW() {
		return positionW;
	}

	public void setPositionW(String positionW) {
		this.positionW = positionW;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public int getFirstPlayer() {
		return firstPlayer;
	}

	public void setFirstPlayer(int firstPlayer) {
		this.firstPlayer = firstPlayer;
	}

	public int getBanker() {
		return banker;
	}

	public void setBanker(int banker) {
		this.banker = banker;
	}
	

	@Override
	public String toString() {
		return "Round [id=" + id + ", time=" + time + ", positionN="
				+ positionN + ", positionE=" + positionE + ", positionS="
				+ positionS + ", positionW=" + positionW + ", target=" + target
				+ ", firstPlayer=" + firstPlayer + ", banker=" + banker + "]";
	}

	public static void main(String[] args) {

	}

}
