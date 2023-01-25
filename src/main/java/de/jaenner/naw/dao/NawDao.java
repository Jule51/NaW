package de.jaenner.naw.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class NawDao extends JdbcDaoSupport{
	
	public List<Map<String, Object>> team() {
		return getJdbcTemplate().queryForList("SELECT * FROM team");
	}
}
