package ghtk.com.students.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ghtk.com.students.dto.StudentsRes;
import ghtk.com.students.entities.Students;

@Service
public class ExcelDataServiceImpl implements ExcelDataService {
	
	@Value("${app.upload.file:${user.home}}")
	public String EXCEL_FILE_PATH;
	
	@Autowired
	StudentsRes repo;

	Workbook workbook;
	
	public List<Students> searchStudent(String studenCode, String name) {

        if (studenCode.equals("")) {
            return repo.findByName(name);
        }
        if (!name.equals("") && !studenCode.equals("")) {
            return repo.findByIds(studenCode);
        }
        return repo.findByIds(studenCode);        
	}

	public List<Students> getExcelDataAsList() {

		List<String> list = new ArrayList<String>();
		
		DataFormatter dataFormatter = new DataFormatter();
	
		try {
			workbook = WorkbookFactory.create(new File(EXCEL_FILE_PATH));
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}

		System.out.println("-------Workbook has '" + workbook.getNumberOfSheets() + "' Sheets-----");

		Sheet sheet = workbook.getSheetAt(0);

		int noOfColumns = sheet.getRow(0).getLastCellNum();
		System.out.println("-------Sheet has '"+noOfColumns+"' columns------");

		for (Row row : sheet) {
			for (Cell cell : row) {
				String cellValue = dataFormatter.formatCellValue(cell);
				list.add(cellValue);
			}
		}

		List<Students> invList = createList(list, noOfColumns);

		try {
			workbook.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return invList;
	}

	private List<Students> createList(List<String> excelData, int noOfColumns) {

		ArrayList<Students> invList = new ArrayList<Students>();

		int i = noOfColumns;
		do {
			Students inv = new Students();
			
			inv.setSchool(excelData.get(i));
//			inv.setAmount(Double.valueOf(excelData.get(i + 1)));
			inv.setDistrict(excelData.get(i + 1));
			inv.setStudenCode(excelData.get(i + 2));
			inv.setClassSchool(excelData.get(i + 3));
			inv.setName(excelData.get(i + 4));
			inv.setNgaySinh(excelData.get(i + 5));
			inv.setGioiTinh(excelData.get(i + 6));
			inv.setNoiSinh(excelData.get(i + 7));
			inv.setDanToc(excelData.get(i + 8));
			inv.setCity(excelData.get(i + 9));
			inv.setPhone(excelData.get(i + 10));
			inv.setDiemLop1(excelData.get(i + 11));
			inv.setDiemLop2(excelData.get(i + 12));
			inv.setDiemLop3(excelData.get(i + 13));
			inv.setDiemLop4(excelData.get(i + 14));
			inv.setDiemLop5(excelData.get(i + 15));
			inv.setTongDiem5(excelData.get(i + 16));
			inv.setDiemUuTien(excelData.get(i + 17));
			inv.setTongDiemSoTuyen(excelData.get(i + 18));
			inv.setNote(excelData.get(i + 19));
			
			invList.add(inv);
			i = i + (noOfColumns);

		} while (i < excelData.size());
		return invList;
	}

	@Override
	public int saveExcelData(List<Students> student) {
		student = repo.saveAll(student);
		return student.size();
		
	}
		
	public List<Students> getAllStudent() {
        return repo.findAll();
    }
	
	
}
