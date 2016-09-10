package com.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.conn2;

public class update extends ActionSupport{
	public String up(){
		System.out.println("U");
		String str=ServletActionContext.getRequest().getParameter("string");
		int id=Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		System.out.println("U"+id);
		conn2 con=new conn2();
		try {
				con.update(str, id);
				con.close();
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
}
