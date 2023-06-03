package hb.project.vo;

public class MembersVO {
	
	//field
	int memberNo; //회원번호
	String id; //아이디
	String pw; //비밀번호
	String memberName; //회원이름
	String eMail; //이메일
	String phoneNum; //핸드폰번호
	
	
	//생성자
	public MembersVO() {
	}
	
	public MembersVO(int memberNo, String id, String pw, String memberName, String eMail, String phoneNum) {
		super();
		this.memberNo = memberNo;
		this.id = id;
		this.pw = pw;
		this.memberName = memberName;
		this.eMail = eMail;
		this.phoneNum = phoneNum;
	}


	//getter, setter
	public int getMemberNo() {
		return memberNo;
	}


	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	

}
