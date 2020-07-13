package com.person.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.db.DBUtil;

/*
 DAO(Data Access Object)
 - �����ͺ��̽� �۾��� �����ϴ� ��ü
 - CRUD �۾��� ��
 
 C : Create => insert
 R : Read => select
 U : Update
 D : Delete
  */
public class PersonDAO {
	/*
	public int insertPerson(String name, String tel) 
			throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=DBUtil.getConnection();
			
			//3.
			String sql="insert into person(no, name, tel)" + 
					"values(person_seq.nextval, ?, ?)";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, name);
			ps.setString(2, tel);
			
			//4.
			int cnt = ps.executeUpdate();
			System.out.println("ó���� ���� ����:"+ cnt);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
		
	}
	 */
	
	//[1] �Ű������� DTO�� �޼���
	//=> �Է�, ������ ���
	public int insertPerson(PersonDTO dto) 
			throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=DBUtil.getConnection();
			
			//3.
			String sql="insert into person(no, name, tel)" + 
					"values(person_seq.nextval, ?, ?)";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getTel());
			
			//4.
			int cnt = ps.executeUpdate();
			System.out.println("ó���� ���� ����:"+ cnt);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
		
	}
	
	//[2] ��ȯŸ���� DTO�� �޼���
	//=> select ��� ���ڵ尡 �� ���� ��� ���
	public PersonDTO selectByNo(int no) throws SQLException {
		//��ȣ�� ��ȸ
		Connection con = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		//��� ���ڵ� �ϳ��� �����ϱ� ����  �뵵�� DTO ���� 
		PersonDTO dto = new PersonDTO();
		try {
			//1,2
			con=DBUtil.getConnection();
			
			//3.
			String sql="select * from person where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			//4.
			rs=ps.executeQuery();
			
			if(rs.next()) { //��� ���ڵ尡 1���� ���				
				String name=rs.getString("name");
				String tel=rs.getString("tel");
				Timestamp regdate=rs.getTimestamp("regdate");
				
				//���ڵ� �ϳ��� �ϳ��� DTO
				dto.setName(name);
				dto.setNo(no);
				dto.setRegdate(regdate);
				dto.setTel(tel);
			}
			System.out.println("��ȣ�� ��ȸ�� ��� dto="+dto);
			
			return dto;
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
		
	}
	
	//[3] ��ȯŸ���� ArrayList�� �޼���
	//=> select ��� ���ڵ尡 �������� ��� ���
	public ArrayList<PersonDTO> selectAll() throws SQLException {
		//��ü ��ȸ
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		//������ ���ڵ�(DTO)�� �����ϱ� ���� �÷��� 
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		
		try {
			//1,2
			con=DBUtil.getConnection();
			
			//3.
			String sql="select * from person order by no desc";
			ps=con.prepareStatement(sql);
			
			//4.
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt(1);
				String name=rs.getString(2);
				String tel=rs.getString(3);
				Timestamp regdate=rs.getTimestamp(4);
			
				//�ϳ��� ���ڵ带 �ϳ��� DTO�� �����ϰ�
				PersonDTO dto = new PersonDTO(no, name, tel, regdate);
				
				//�� DTO�� ArrayList�� ����
				list.add(dto);
			}
			
			System.out.println("��ü ��ȸ ��� list.size="+ list.size());
			
			return list; //������ DTO �� ����ִ� ArrayList�� ����
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}	
	}
	
	public int deletePerson(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=DBUtil.getConnection();
			
			//3.
			String sql="delete from person" + 
					" where no=?";
			ps=con.prepareStatement(sql);
			
			//
			ps.setInt(1, no);
			
			//4.
			int cnt = ps.executeUpdate();
			System.out.println("���� ���, cnt="+cnt+", �Ű����� no="+no);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	public int updatePerson(PersonDTO dto) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=DBUtil.getConnection();
			
			//3.
			String sql="update person" + 
					" set name=?, tel=?" + 
					" where no=?";
			ps=con.prepareStatement(sql);
			
			//
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getTel());
			ps.setInt(3, dto.getNo());
			
			//4. 
			int cnt = ps.executeUpdate();
			System.out.println("���� ���, cnt="+cnt+", �Ű����� dto="+dto);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	/**
	 * �̸����� ��ȸ�ϴ� �޼���
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<PersonDTO> selectByName(String name) throws SQLException {		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		ArrayList<PersonDTO> list=new ArrayList<PersonDTO>();
		
		try{
			//1,2 con
			con=DBUtil.getConnection();
			
			//3. ps
			String sql="select * from person where name=?";
			ps=con.prepareStatement(sql);
			
			//
			ps.setString(1, name);
			
			//4
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt("no");
				String tel=rs.getString("tel");
				Timestamp regdate = rs.getTimestamp("regdate");
				
				PersonDTO dto = new PersonDTO(no, name, tel, regdate);
				list.add(dto);
			}
			
			System.out.println("�̸����� ��ȸ ���, list.size="+list.size()
				+ ", �Ű�����  name="+name);
			
			return list;
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
		
	}
	
}






