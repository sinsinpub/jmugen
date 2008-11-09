package org.lee.mugen.fight.system.elem;

import org.lee.mugen.fight.section.Section;

public class ItemName implements Section {
	private String arcade;
	private String versus;
	private String teamarcade;
	private String teamversus;
	private String teamcoop;
	private String survival;
	private String survivalcoop;
	private String training;
	private String watch;
	private String options;
	private String exit;

	private String getGoodString(String word) {
		if (word.startsWith("\"") && word.endsWith("\""))
			return word.substring(1, word.length() - 1);
		return word;
	}
	
	public String getArcade() {
		return getGoodString(arcade);
	}

	public void setArcade(String arcade) {
		this.arcade = arcade;
	}

	public String getVersus() {
		return getGoodString(versus);
	}

	public void setVersus(String versus) {
		this.versus = versus;
	}

	public String getTeamarcade() {
		return getGoodString(teamarcade);
	}

	public void setTeamarcade(String teamarcade) {
		this.teamarcade = teamarcade;
	}

	public String getTeamversus() {
		return getGoodString(teamversus);
	}

	public void setTeamversus(String teamversus) {
		this.teamversus = teamversus;
	}

	public String getTeamcoop() {
		return getGoodString(teamcoop);
	}

	public void setTeamcoop(String teamcoop) {
		this.teamcoop = teamcoop;
	}

	public String getSurvival() {
		return getGoodString(survival);
	}

	public void setSurvival(String survival) {
		this.survival = survival;
	}

	public String getSurvivalcoop() {
		return getGoodString(survivalcoop);
	}

	public void setSurvivalcoop(String survivalcoop) {
		this.survivalcoop = survivalcoop;
	}

	public String getTraining() {
		return getGoodString(training);
	}

	public void setTraining(String training) {
		this.training = training;
	}

	public String getWatch() {
		return getGoodString(watch);
	}

	public void setWatch(String watch) {
		this.watch = watch;
	}

	public String getOptions() {
		return getGoodString(options);
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getExit() {
		return getGoodString(exit);
	}

	public void setExit(String exit) {
		this.exit = exit;
	}

	@Override
	public void parse(Object root, String name, String value) throws Exception {
		if (name.equals("arcade")) {
			arcade = value;
		} else if (name.equals("versus")) {
			versus = value;
		} else if (name.equals("teamarcade")) {
			teamarcade = value;
		} else if (name.equals("teamversus")) {
			teamversus = value;
		} else if (name.equals("teamcoop")) {
			teamcoop = value;
		} else if (name.equals("survival")) {
			survival = value;
		} else if (name.equals("survivalcoop")) {
			survivalcoop = value;
		} else if (name.equals("training")) {
			training = value;
		} else if (name.equals("watch")) {
			watch = value;
		} else if (name.equals("options")) {
			options = value;
		} else if (name.equals("exit")) {
			exit = value;
		}
	}

}