//package pageObjects;
//import java.io.File;
//import java.io.FileInputStream;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ReadandWriteExcel {
//
//	public  XSSFSheet GetExcelSheet(String fileName){
//		  //,//int sheetnumber*//
//		  try {
//		  // Specify the path of file
//		  File src=new File(fileName);
//
//		   // load file
//		   FileInputStream fis=new FileInputStream(src);
//		 
//		   // Load workbook
//		   XSSFWorkbook wb=new XSSFWorkbook(fis);
//		   //XSSFWorkbook ad=new  XSSFWorkbook(fis);
//		   
//		   // Load sheet- Here we are loading first sheetonly
//		     // XSSFSheet sh1= wb.getSheetAt(sheetnumber); 5/13/2016
//		    XSSFSheet sh1= wb.getSheetAt(0); 
//		 return sh1;
//		  // getRow() specify which row we want to read.
//
//		  // and getCell() specify which column to read.
//		  // getStringCellValue() specify that we are reading String data.
//
//
////		 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
////
////		 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
////
////		 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
////
////		 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
////
////		 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
////
////		 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
//		     
//		 
//		  } catch (Exception e) {
//
//		   System.out.println(e.getMessage());
//
//		  }
//		return null;
//		  
//		 }
//		 
//		}
