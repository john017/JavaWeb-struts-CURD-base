package com.action;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.str.*;
import dao.*;

public class searchall extends ActionSupport{
	public String sa(){
		System.out.println("S");
		List<str> str=new ArrayList<str>();
		conn2 con=new conn2();
		ResultSet rs=con.Searchall();
		try {
			while(rs.next()){
				str st=new str();
				st.setstring(rs.getString("String"));
				st.setid(rs.getInt("id"));
				str.add(st);
				}
				HttpSession session=ServletActionContext.getRequest().getSession();
				session.setAttribute("list", str);
				con.close();
				if(str!=null)
			return SUCCESS;
				else
					return ERROR;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
}
