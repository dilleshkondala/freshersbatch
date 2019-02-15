package com.cgm.dateService;

import com.cgm.dateServiceSupport.MyDate;

public class DateDifferenceProvider {
	private static final int FEB = 2;
	private static final int DAY_IN_LEAP_YEAR = 366;
	private static final int DAY_IN_NON_LEAP_YEAR = 365;
	private static final int DAY_IN_JAN = 31;
	private static final int DAY_IN_FEB = 28;
	private static final int DAY_IN_MAR = 31;
	private static final int DAY_IN_APR = 30;
	private static final int DAY_IN_MAY = 31;
	private static final int DAY_IN_JUN = 30;
	private static final int DAY_IN_JUL = 31;
	private static final int DAY_IN_AUG = 31;
	private static final int DAY_IN_SEP = 30;
	private static final int DAY_IN_OCT = 31;
	private static final int DAY_IN_NOV = 30;
	private static final int DAY_IN_DEC = 31;

	public static int daysInMonth[] = { DAY_IN_JAN, DAY_IN_FEB, DAY_IN_MAR, DAY_IN_APR, DAY_IN_MAY, DAY_IN_JUN,
			DAY_IN_JUL, DAY_IN_AUG, DAY_IN_SEP, DAY_IN_OCT, DAY_IN_NOV, DAY_IN_DEC };

	public static long getDateDifference(MyDate  startDate, MyDate endDate) 
	{
		
		if(sameDate(startDate, endDate) && 
				sameMonth(startDate, endDate) && 
				sameYear(startDate, endDate))
		{
			return 0;
		}
		
		else if(sameYear(startDate, endDate) &&
				sameMonth(startDate, endDate))
		{
			return endDate.getDd() - startDate.getDd();
		
		}
		
		else if(sameYear(startDate, endDate) &&
				!sameMonth(startDate, endDate))
		{
			return (remainingDaysInMonth(startDate) + 
					daysInIntervingMonth(startDate, endDate) + 
					leadingMonth(endDate));
		}
		
		else
		{
			return remainingDaysInYear(startDate) + 
					leadingYear(endDate) + 
					daysInIntervingYear(startDate, endDate);
		}
	}

	private static boolean sameYear(MyDate date1, MyDate date2) {
		return (date1.getYyyy() == date2.getYyyy());
	}

	private static boolean sameMonth(MyDate date1, MyDate date2) {
		return (date1.getMm() == date2.getMm());
	}

	private static boolean sameDate(MyDate date1, MyDate date2) {
		return (date1.getDd() == date2.getDd());
	}

	private static long remainingDaysInMonth(MyDate date) {
		int remainingDays;
		int month = date.getMm();
		remainingDays = daysInMonth[month - 1] - date.getDd();
		if (isLeapYear(date) && isFebruary(date)) {
			remainingDays++;
		}
		return remainingDays;
	}

	private static long leadingMonth(MyDate date) {
		return date.getDd();
	}

	private static boolean isFebruary(MyDate date) {
		int month = date.getMm();
		if (month == FEB) {
			return true;
		}
		return false;
	}

	private static boolean isLeapYear(MyDate date) {
		int year = date.getYyyy();
		if (year % 400 == 0 || year % 100 != 0 || year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	private static long daysInIntervingMonth(MyDate startDate, MyDate endDate) {
		int startMonth = startDate.getMm();
		int endMonth = endDate.getMm();
		int days = 0;

		for (int month = startMonth + 1; month < endMonth; month++) {
			if (isLeapYear(startDate) && month == FEB) {
				++days;
			}
			days += daysInMonth[month - 1];
		}
		return days;
	}

	private static int daysInIntervingYear(MyDate startDate, MyDate endDate) {
		int remainingDays = 0;
		for (int year = startDate.getYyyy(); year < endDate.getYyyy(); year++) {
			if (isLeapYear(new MyDate(1, 1, year))) {
				remainingDays += DAY_IN_LEAP_YEAR;
			} else {
				remainingDays += DAY_IN_NON_LEAP_YEAR;
			}
		}
		return remainingDays;
	}

	private static long remainingDaysInYear(MyDate startDate) {
		int daysRemaining = 0;
		for (int month = startDate.getMm() + 1; month <= 12; month++) {
			daysRemaining += daysInMonth[month - 1];
		}
		daysRemaining += (daysInMonth[startDate.getMm() - 1] - startDate.getDd());

		if (isLeapYear(startDate) && startDate.getMm() >= FEB) {
			daysRemaining++;
		}
		return daysRemaining;

	}

	private static long leadingYear(MyDate endDate) {
		int daysRemaining = 0;
		for (int month = 1; month <= endDate.getMm(); month++) {
			daysRemaining += daysInMonth[month - 1];
		}
		daysRemaining += endDate.getDd();

		if (isLeapYear(endDate) && endDate.getMm() >= FEB) {
			daysRemaining++;
		}
		return daysRemaining;
	}
}


