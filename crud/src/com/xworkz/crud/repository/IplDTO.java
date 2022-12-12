package com.xworkz.crud.repository;

import com.xworkz.crud.dto.AbstractAuditDTO;

public class IplDTO extends AbstractAuditDTO {

	private String teamName;
	private String ownerName;
	private int noOfPalyers;
	private String captainName;
	private String headCoachName;
	private String battingCoachName;
	private String bowlingCoachName;
	private String gerseyColor;
	private int wins;
	private int defeat;

	public IplDTO() {
		System.out.println("Calling no-arg const of IplDTO");
	}

	@Override
	public String toString() {
		return "IplDTO [teamName=" + teamName + ", ownerName=" + ownerName + ", noOfPalyers=" + noOfPalyers
				+ ", captainName=" + captainName + ", headCoachName=" + headCoachName + ", battingCoachName="
				+ battingCoachName + ", bowlingCoachName=" + bowlingCoachName + ", gerseyColor=" + gerseyColor
				+ ", wins=" + wins + ", defeast=" + defeat + "]";
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getNoOfPalyers() {
		return noOfPalyers;
	}

	public void setNoOfPalyers(int noOfPalyers) {
		this.noOfPalyers = noOfPalyers;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public String getHeadCoachName() {
		return headCoachName;
	}

	public void setHeadCoachName(String headCoachName) {
		this.headCoachName = headCoachName;
	}

	public String getBattingCoachName() {
		return battingCoachName;
	}

	public void setBattingCoachName(String battingCoachName) {
		this.battingCoachName = battingCoachName;
	}

	public String getBowlingCoachName() {
		return bowlingCoachName;
	}

	public void setBowlingCoachName(String bowlingCoachName) {
		this.bowlingCoachName = bowlingCoachName;
	}

	public String getGerseyColor() {
		return gerseyColor;
	}

	public void setGerseyColor(String gerseyColor) {
		this.gerseyColor = gerseyColor;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getDefeat() {
		return defeat;
	}

	public void setDefeast(int defeat) {
		this.defeat = defeat;
	}
}
