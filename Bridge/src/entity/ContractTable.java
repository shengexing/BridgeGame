package entity;

import java.util.List;

public class ContractTable {
	
	private int contract;	// ������Լ��
	private int frontContract;	// ǰһ��Լ��
	private List<int[]> count;	// ��¼�Ķ�Լ��
	
	/**
	 * 
	 * @return
	 */
	public int getContract() {
		return contract;
	}

	/**
	 * 
	 * @param contract
	 */
	public void setContract(int contract) {
		this.contract = contract;
	}

	/**
	 * 
	 * @return
	 */
	public int getFrontContract() {
		return frontContract;
	}

	/**
	 * 
	 * @param frontContract
	 */
	public void setFrontContract(int frontContract) {
		this.frontContract = frontContract;
	}

	/**
	 * 
	 * @return
	 */
	public List<int[]> getCount() {
		return count;
	}

	/**
	 * 
	 * @param count
	 */
	public void setCount(List<int[]> count) {
		this.count = count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
