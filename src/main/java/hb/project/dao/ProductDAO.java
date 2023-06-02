package hb.project.dao;

import hb.project.db.DBProperties;

public class ProductDAO {
	
	//멤버변수
	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;
	
	
	//생성자
	public ProductDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	//상품 추가
	
	//상품 수정
	
	//상품 삭제
	
	//상품이름으로 상품 찾기
	
	//모든 상품 출력

}
