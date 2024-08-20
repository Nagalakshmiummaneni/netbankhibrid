package testclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hybrid.bank.baseclass.base;
import com.hybrid.bank.pageobjects.loginpage;

public class logintest extends base {
	@Test(dataProvider = "login")
	public void test(String username, String password) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage log = new loginpage(driver);
		log.login(username, password);
		String exptitle = "GTPL Bank Manager HomePage";
		String acttitle = driver.getTitle();
	}

	@DataProvider(name = "login")
	public Object[][] data() throws IOException {
		File f = new File("C:\\Letitbe\\javaprogram\\hybrid_Driven\\LoginData.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook wrkb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wrkb.getSheet("Sheet1");
		int r = sheet.getLastRowNum();
		System.out.println(r);
		int c = sheet.getRow(1).getLastCellNum();
		System.out.println(c);
		Object[][] data = new Object[r+1][c];
		for (int i = 1; i <=r; i++) {

			data[i][0] = sheet.getRow(i).getCell(0).toString();
			System.out.println(data[i][0]);
			data[i][1] = sheet.getRow(i).getCell(1).toString();
			System.out.println(data[i][1]);
		}
		wrkb.close();
		fs.close();
		return data;
	}
}
