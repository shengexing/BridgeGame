package entity;

import entity.tablecontent.TablePosition;

/**
 * 定义牌桌的实体类
 * @author Time
 *
 */
public class Table {
	
	private TablePosition[] position = new TablePosition[4];	// 牌桌的四个方向
	
	/**
	 * Table的缺省构造方法
	 */
	public Table() {
		position[0] = TablePosition.east;
		position[1] = TablePosition.south;
		position[2] = TablePosition.west;
		position[3] = TablePosition.north;
	}
	
	/**
	 * 获取Table的成员变量 position
	 * @return Table的成员变量 position(TablePosition)
	 */
	public TablePosition[] getPosition() {
		return position;
	}

	/**
	 * 设置Table的成员变量 position
	 * @param position 牌桌的方向
	 */
	public void setPosition(TablePosition[] position) {
		this.position = position;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
