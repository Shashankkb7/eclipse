package com.xworkz.collection.DTO;

import java.io.Serializable;

public class HolidayDTO implements Serializable {

	private String type;
	private Integer noOfDays;
	private String reason;

	public HolidayDTO() {

	}

	public HolidayDTO(String type, Integer noOfDays, String reason) {
		super();
		this.type = type;
		this.noOfDays = noOfDays;
		this.reason = reason;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in HolidayDTO");
		{
			if (obj != null) {
				if (obj instanceof HolidayDTO) {
					HolidayDTO dto = (HolidayDTO) obj;
					if (dto.type.equals(this.type)) {
						System.out.println("Type " + type);
						return true;
					}
				}
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return "HolidayDTO [type=" + type + ", noOfDays=" + noOfDays + ", reason=" + reason + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
