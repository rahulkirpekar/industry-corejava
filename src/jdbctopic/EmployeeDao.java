package jdbctopic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDao 
{
	public int insert(EmployeeBean ebean) 
	{
		String insertQuery = "INSERT INTO employee(name,salary,dsgn,orgName) VALUES ('"+ebean.getName()+"','"+ebean.getSalary()+"','"+ebean.getDsgn()+"','"+ebean.getOrgName()+"')";
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		int rowAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowAffected = stmt.executeUpdate(insertQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao ---insert()--- Db not Connected : " + conn);
		}
		return rowAffected;
	}
	public int update(int updatedId,EmployeeBean ebean) 
	{
		String updateQuery = "UPDATE Employee SET name = '"+ebean.getName()+"', salary= '"+ebean.getSalary()+"',dsgn='"+ebean.getDsgn()+"',orgName='"+ebean.getOrgName()+"' WHERE id = " +updatedId;
		System.out.println("updateQuery - " + updateQuery);
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				rowsAffected = stmt.executeUpdate(updateQuery);
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao ---update method --Db not connected");
		}
		return rowsAffected;
	}
	public int  delete(int id) 
	{
		String deleteQuery = "DELETE FROM employee WHERE id="+id;

		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				rowsAffected = stmt.executeUpdate(deleteQuery); 
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("Db not connected : " + conn);
		}
		return rowsAffected;
	}
	public ArrayList<EmployeeBean> getAllRecords() 
	{
		String selectQuery = "SELECT * FROM employee";
		// 1) Get Db Connection
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		EmployeeBean ebean = null;
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(selectQuery);
				while(rs.next()) 
				{
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String salary  = rs.getString(3);
					String dsgn = rs.getString(4);
					String orgName = rs.getString(5);
					ebean = new EmployeeBean(id, name, salary, dsgn, orgName);
					list.add(ebean);
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao----getAllRecords() Db not connected");
		}
		return list;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmployeeId which you want to Update : ");
		int updatedId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Salary : ");
		String salary = sc.nextLine();
		System.out.println("Enter Dsgn : ");
		String dsgn = sc.nextLine();
		System.out.println("Enter orgName : ");
		String orgName = sc.nextLine();
		EmployeeBean ebean = new EmployeeBean(0, name, salary, dsgn, orgName);
		EmployeeDao dao = new EmployeeDao();
		int rowAffected = dao.update(updatedId,ebean);
		if(rowAffected > 0)
		{
			System.out.println("Employee record successfully Updated : " + rowAffected);
		}else 
		{
			System.out.println("Employee record not Updated : " + rowAffected);
		}
		
		
		
//		ArrayList<EmployeeBean> list = dao.getAllRecords();
//		for (int i = 0; i < list.size(); i++) 
//		{
//			EmployeeBean ebean = list.get(i);
//			System.out.println(ebean.getId() + " "+ ebean.getName() + " " +ebean.getSalary() + " "+ ebean.getDsgn() + " "+ ebean.getOrgName());
//		}

//		System.out.println("Enter Id which you want to delete : ");
//		int id = sc.nextInt();
//		EmployeeDao dao = new EmployeeDao();
		
//		int rowAffected = dao.delete(id);

//		if(rowAffected > 0)
//		{
//			System.out.println("Employee record successfully Deleted : " + rowAffected);
//		}else 
//		{
//			System.out.println("Employee record not Deleted : " + rowAffected);
//		}
//		System.out.println("Enter Name : ");
//		String name = sc.nextLine();
//
//		System.out.println("Enter Salary : ");
//		String salary = sc.nextLine();
//
//		System.out.println("Enter Dsgn : ");
//		String dsgn = sc.nextLine();

//		System.out.println("Enter orgName : ");
//		String orgName = sc.nextLine();
//		EmployeeDao dao = new EmployeeDao();
//		
//		EmployeeBean ebean = new EmployeeBean(0, name, salary, dsgn, orgName);
//		
//		int rowAffected = dao.insert(ebean);
//
//		if(rowAffected > 0)
//		{
//			System.out.println("Employee record successfully inserted : " + rowAffected);
//		}else 
//		{
//			System.out.println("Employee record not inserted : " + rowAffected);
//		}
	}
}
