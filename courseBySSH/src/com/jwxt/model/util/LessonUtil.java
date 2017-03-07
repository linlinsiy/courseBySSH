package com.jwxt.model.util;

import java.util.List;

import com.jwxt.model.lesson.entity.Lesson;

public class LessonUtil {

	/**
	 * 将查出的课程列表，按照时间-课程的键值对保存起来，用来生成课表
	 * @param lessons
	 * @return
	 */
	static public Lesson[][] list2Map(List<Lesson> lessons){
		//每周五天，每天13节课的一个表格
		Lesson[][] lessonTable = new Lesson[5][13];
		for (Lesson lesson : lessons) {
			String allTime = lesson.getLesTime();
			//得到课程时间为allTime="一1,3;三5,6";
			String[] everyTime = allTime.split(";");
			//everyTime={"一1,3","三5,6"};time="一1,3";
			for (String time : everyTime) {
				int i=0;
				int j=0;
				String date = time.substring(0, 1);
				String[] clocks = time.substring(1).split(",");
				//遍历每个上课时间段，填入表格中
				if(date.equals("一")) i = 0;
				else if(date.equals("二")) i = 1;
				else if(date.equals("三")) i = 2;
				else if(date.equals("四")) i = 3;
				else if(date.equals("五")) i = 4;
				//选择上课的节次,clocks为开始节次与结束节次
				for (j = Integer.parseInt(clocks[0])-1;j<=Integer.parseInt(clocks[1])-1;j++) {
					lessonTable[i][j] = lesson;
				}
			}
			
		}
		return lessonTable;
	}
}
