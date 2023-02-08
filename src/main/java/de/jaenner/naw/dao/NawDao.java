package de.jaenner.naw.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import de.jaenner.bo.User;

public class NawDao extends JdbcDaoSupport{
	
	public List<User> team(String team_id) {
		return getJdbcTemplate().query("SELECT * FROM public.user where team=?", BeanPropertyRowMapper.newInstance(User.class), team_id);
	}
	public List<User> admin() {
		return getJdbcTemplate().query("SELECT * FROM public.user WHERE id in (SELECT DISTINCT admin from team)", BeanPropertyRowMapper.newInstance(User.class));
	}
}
