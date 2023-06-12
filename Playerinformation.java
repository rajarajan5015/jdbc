package com.onesoft;

import java.util.List;

public interface Playerinformation {
	public List<Player> findAll();
	
	public int savedetails(Player a);
	
	public String deletevalues(int b);

}
