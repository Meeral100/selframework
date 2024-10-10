package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getCellData(String path,String sheet,int r,int c)
	{
		String v="";
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
			wb.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return v;
	}
	
	public static int getTotalRowCount(String path, String sheet)
	{
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			int r=wb.getSheet(sheet).getLastRowNum();
			return r+1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}
		
		
	}

}
