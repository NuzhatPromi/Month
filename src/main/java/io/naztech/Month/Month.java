package io.naztech.Month;

import java.time.Year;

import javax.management.ConstructorParameters;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public enum Month {
	JANUARY("january", 31), FEBRUARY("february", 28), MARCH("march", 31), APRIL("april", 30), MAY("may", 31),
	JUNE("june", 30), JULY("july", 31), AUGUST("august", 31), SEPTEMBER("september", 30), OCTOBER("october", 31),
	NOVEMBER("november", 30), DECEMBER("december", 31);

	@NonNull
	@Getter
	@Setter
	private String title;
	@NonNull
	@Getter
	@Setter
	private int daysInMonth;

	private Month(String t, int d) {
		// TODO Auto-generated constructor stub
		this.title = t;
		this.daysInMonth = d;
	}

	public String title() {
		return this.title;
	}

	public int daysInMonth() {
		return this != FEBRUARY ? this.daysInMonth : (Year.isLeap(Year.now().getValue()) ? 29 : this.daysInMonth);
	}

	public String getShortName() {
		return this.title.substring(0, 3);
	}

	public static Month parseMonth(String val) {
		if (val == null | val.isEmpty()) {
			return null;
		}

		String valueString = val.toUpperCase();

		try {
			return valueOf(valueString);
		} catch (Exception e) {
			// TODO: handle exception

			for (Month itemMonth : values()) {
				if (valueString.equals(itemMonth.name().substring(0, 3))) {
					return itemMonth;
				}

				if (itemMonth.name().contains(valueString)) {
					return itemMonth;
				}
			}
		}
		return null;
	}

}
