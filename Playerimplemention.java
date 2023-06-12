package com.onesoft;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Playerimplemention implements Playerinformation {
	@Autowired
	JdbcTemplate jt;

	@Override
	public List<Player> findAll() {
		return jt.query("select * from Player", new BeanPropertyRowMapper<Player>(Player.class));
	}

	@Override
	public int savedetails(Player a) {
		return jt.update("Insert into Player values(?,?,?,?);",
				new Object[] { a.getId(), a.getPlayerName(), a.getPlayerAge(), a.getJersyNumber() });

	}

	@Override
	public String deletevalues(int id) {
		jt.update("delete from Player where id =?;",
				new Object[] {id});
		return "one row deleted";
	}
}
