package com.epgpro.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author jagol
 * @date 2020年4月8日下午12:11:12
 * 描述：获取当天的前七天和未来七天
 */
public class Dates {
	@SuppressWarnings("null")
	public static Map<String, String> getDates() {
		Map<String, String> dates = new HashMap(20);
		SimpleDateFormat df = new SimpleDateFormat("MM-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		try {
			for (int i = 1; i <= 14; i++) {
				if (i <= 7) {
					calendar.add(Calendar.DAY_OF_YEAR, -1);
					Date date = calendar.getTime();
					dates.put("leftdate" + i, df.format(date));
				} else {
					if (i == 8) {
						calendar.add(Calendar.DAY_OF_YEAR, +7);
					}
					calendar.add(Calendar.DAY_OF_YEAR, +1);
					Date date = calendar.getTime();
					dates.put("rightdate" + i, df.format(date));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dates;
	}
}