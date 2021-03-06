package entity;

/**
 * 完整叫牌回合中一个小的叫牌回合的类
 * @author Time
 *
 */
public class Contract {
	
	private int id;		// 回合编号
	private int round_id;		// 完整游戏回合编号
	private int row;	// 回合属于整个游戏回合的第几行
	private String callN;	// 本回合中北方叫的约定
	private String callE;	// 本回合中东方叫的约定
	private String callS;	// 本回合中南方叫的约定
	private String callW;	// 本回合中西方叫的约定

	
	public Contract() {
		super();
	}

	public Contract(int id, int round_id, int row, String callN, String callE,
			String callS, String callW) {
		super();
		this.id = id;
		this.round_id = round_id;
		this.row = row;
		this.callN = callN;
		this.callE = callE;
		this.callS = callS;
		this.callW = callW;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRound_id() {
		return round_id;
	}

	public void setRound_id(int round_id) {
		this.round_id = round_id;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public String getCallN() {
		return callN;
	}

	public void setCallN(String callN) {
		this.callN = callN;
	}

	public String getCallE() {
		return callE;
	}

	public void setCallE(String callE) {
		this.callE = callE;
	}

	public String getCallS() {
		return callS;
	}

	public void setCallS(String callS) {
		this.callS = callS;
	}

	public String getCallW() {
		return callW;
	}

	public void setCallW(String callW) {
		this.callW = callW;
	}

	
	@Override
	public String toString() {
		return "Contract [id=" + id + ", round_id=" + round_id + ", row=" + row
				+ ", callN=" + callN + ", callE=" + callE + ", callS=" + callS
				+ ", callW=" + callW + "]";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
