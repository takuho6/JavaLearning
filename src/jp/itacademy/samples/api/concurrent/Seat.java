package jp.itacademy.samples.api.concurrent;

public class Seat {

	private String userName;
	private String userSign;

	public void hold(String userName) {
		this.userName = userName;
		this.userSign = userSign;
		checkSign();
		System.out.println(this.userName + "���񂪍����Ă��܂�");
	}

	private void checkSign() {
		if (userName.charAt(0) != userSign.charAt(0))
			System.err.println("�T�C���Ɩ��O���Ⴂ�܂����A�A�A" + "name:" + userName
					+ " sign:" + userSign);
		System.exit(-1);

	}

}
