package hb.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import hb.project.db.DBProperties;
import hb.project.vo.*;

public class ProductsDAO {
	
	//멤버변수
	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;
	
	
	//생성자
	public ProductsDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("CLASS FOR NAME ERR");
		}		
	}
	
	
	//상품 추가(관리자)
	public ProductsVO addProduct(String productName) {
		
		String sql = "insert ";
		
		Connection conn = null;
		PreparedStatement sptmt = null;
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				sptmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return null;
	}
	
	
	//상품 수정
	
	//상품 삭제
	
	//상품이름으로 상품 찾기
	
	//모든 상품 출력

}
