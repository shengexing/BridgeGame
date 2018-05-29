package entity;

import entity.tablecontent.TablePosition;

/**
 * ����������ʵ����
 * @author Time
 *
 */
public class Table {
	
	private TablePosition[] position = new TablePosition[4];	// �������ĸ�����
	
	/**
	 * Table��ȱʡ���췽��
	 */
	public Table() {
		position[0] = TablePosition.east;
		position[1] = TablePosition.south;
		position[2] = TablePosition.west;
		position[3] = TablePosition.north;
	}
	
	/**
	 * ��ȡTable�ĳ�Ա���� position
	 * @return Table�ĳ�Ա���� position(TablePosition)
	 */
	public TablePosition[] getPosition() {
		return position;
	}

	/**
	 * ����Table�ĳ�Ա���� position
	 * @param position �����ķ���
	 */
	public void setPosition(TablePosition[] position) {
		this.position = position;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
