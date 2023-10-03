package 추석;

public class TvProgram {

	int time;
	int channelNum;
	String channelNm;
	String subject;
	public TvProgram() {
		// TODO Auto-generated constructor stub
	}
	public TvProgram(int time, int channelNum, String channelNm, String subject) {
		super();
		this.time = time;
		this.channelNum = channelNum;
		this.channelNm = channelNm;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "TvProgram [time=" + time + "시, channelNum=" + channelNum + "번, channelNm=" + channelNm + ", subject="
				+ subject + "]";
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getChannelNum() {
		return channelNum;
	}
	public void setChannelNum(int channelNum) {
		this.channelNum = channelNum;
	}
	public String getChannelNm() {
		return channelNm;
	}
	public void setChannelNm(String channelNm) {
		this.channelNm = channelNm;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
