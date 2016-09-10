package com.action;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.str.str;

import dao.conn2;

public class delete extends ActionSupport{
	public String dl(){
		int id=(int) ServletActionContext.getRequest().getAttribute("id");
		System.out.println("D"+id);
		conn2 con=new conn2();
		try {
				con.remove(id);
				con.close();
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
}
