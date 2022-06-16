package ghtk.com.students.services;

import java.util.List;

import ghtk.com.students.entities.Students;

public interface ExcelDataService {
	
	List<Students> getExcelDataAsList();
	
	int saveExcelData(List<Students> Student);
	
	
	
}
