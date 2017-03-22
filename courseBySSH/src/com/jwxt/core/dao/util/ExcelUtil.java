package com.jwxt.core.dao.util;

import java.io.IOException;

import javax.servlet.ServletOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

import com.jwxt.model.lesson.entity.Lesson;

public class ExcelUtil {

	/**
	 * 导出课程表到excel
	 * @param lessonTable[5][13]
	 * @param outputStream
	 */
	public static void exportExcel(Lesson[][] lessonTable, ServletOutputStream outputStream){
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			CellRangeAddress cellRangeAddress = new CellRangeAddress(0, 0, 0, 7);
			HSSFCellStyle style1 = createCellStyle(workbook, (short)16);
			HSSFCellStyle style2 = createCellStyle(workbook, (short)13);
			HSSFSheet sheet = workbook.createSheet("课程表");
			sheet.addMergedRegion(cellRangeAddress);
			sheet.setDefaultColumnWidth(15);
			
			HSSFRow row1 = sheet.createRow(0);
			HSSFCell cell1 = row1.createCell(0);
			cell1.setCellStyle(style1);
			cell1.setCellValue("课程表");
			
			HSSFRow row2 = sheet.createRow(1);
			String[] date = {"节次","周一","周二","周三","周四","周五","周六","周日"};
			String[] time = {"8:00~8:45","8:55~9:40","10:00~10:45","10:55~11:40","12:10~12:55",
					"13:05~13:50","14:10~14:55","15:05~15:50","16:00~16:45","16:05~17:50",
					"18:00~18:45","18:55~19:40","19:50~20:35"};
			for(int i = 0; i < date.length; i++){
				HSSFCell cell2 = row2.createCell(i);
				cell2.setCellStyle(style2);
				cell2.setCellValue(date[i]);
			}
			
			for (int i=0; i < 13; i++) {
				HSSFRow row = sheet.createRow(i+2);
				row.createCell(0).setCellValue(time[i]);
				//将课程名填入五天之中。
				for(int j=1; j < 6; j++){
					if(lessonTable[j-1][i]!=null){
						row.createCell(j).setCellValue(lessonTable[j-1][i].getLesName());	
					}else {
						row.createCell(j).setCellValue("");
					}
				}
				for(int j=6; j < 8; j++){
					row.createCell(j).setCellValue("");
				}
			}
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 创建单元格样式
	 * @param workbook 工作簿
	 * @param fontSize 字体大小
	 * @return 单元格样式
	 */
	private static HSSFCellStyle createCellStyle(HSSFWorkbook workbook,short fontSize){
		HSSFCellStyle style = workbook.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		HSSFFont font = workbook.createFont();
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setFontHeightInPoints(fontSize);
		style.setFont(font);
		return style;
	}
}
