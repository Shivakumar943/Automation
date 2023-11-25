package apachaipoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{
	public static void main(String[] args) throws IOException 
	{
		String path="C:\\Users\\MWCL\\Desktop\\Ksert.xlsx";
		FileInputStream stream=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(stream);
		XSSFSheet shet= wb.getSheetAt(0);
		
		int row=shet.getLastRowNum();
		int col=shet.getRow(1).getLastCellNum();
		
		for(int i=0;i<row;i++)
		{
			XSSFRow xrow=shet.getRow(i);
			
			for(int j=0;j<col;j++)
			{
				XSSFCell xcell=xrow.getCell(j);
				
				switch (xcell.getCellType())
				{
				case STRING: 
					System.out.print(xcell.getStringCellValue()+" ");
					break;
					
				case NUMERIC:
					System.out.print(xcell.getNumericCellValue());
					break;
				}
				System.out.println(" ");
			}
		}
	}
}