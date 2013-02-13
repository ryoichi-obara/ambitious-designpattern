package jp.ktsystem.ambitious.designpattern.builder.sqlbuilder;

import static jp.ktsystem.ambitious.designpattern.builder.sqlbuilder.SelectBuilder.Order.ASC;

public class Main {

	public static void main(String[] argus) {

		SelectBuilder builder = new SelectBuilder();

		String sql = builder.select("user_name").n("mail_address").from("m_user").where("user_id like %s").orderby("id", ASC).build();
		System.out.println(sql);
	}

}
