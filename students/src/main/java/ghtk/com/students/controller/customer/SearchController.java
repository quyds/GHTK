package ghtk.com.students.controller.customer;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ghtk.com.students.dto.StudentsRes;
import ghtk.com.students.entities.Students;
import ghtk.com.students.services.ExcelDataService;
import ghtk.com.students.services.ExcelDataServiceImpl;
import ghtk.com.students.services.FileUploaderService;


@Controller
public class SearchController {
	
//	@RequestMapping(value = { "/import" }, method = RequestMethod.GET)
//	public String imp(final Model model, 
//					  final HttpServletRequest request, 
//					  final HttpServletResponse response) 
//				      throws IOException {
//		
//		return "customer/index"; // -> đường dẫn tới View.
//	}
//	
//	@RequestMapping(value = { "/search" }, method = RequestMethod.GET)
//	public String search(final Model model, 
//					  final HttpServletRequest request, 
//					  final HttpServletResponse response) 
//				      throws IOException {
//		
//		return "customer/search"; // -> đường dẫn tới View.
//	}
	
	@Autowired
	FileUploaderService fileService;
	
	@Autowired
	ExcelDataService excelservice;
	
	@Autowired
	ExcelDataServiceImpl excelserviceim;
	
	@Autowired
	StudentsRes repo;
	
	@GetMapping("/import")
    public String index() {
		
        return "customer/index";
        
    }
	
	 @PostMapping("/import")
	    public String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

	        fileService.uploadFile(file);

	        redirectAttributes.addFlashAttribute("message",
	            "Bạn đã tải thành công file '"+ file.getOriginalFilename()+"' !");
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return "redirect:/import";
	    }
	    
	    @GetMapping("/search")
	    public String saveExcelData(Model model,HttpServletRequest request) {
	    	
	    	List<Students> excelDataAsList = excelservice.getExcelDataAsList();
	    	int noOfRecords = excelservice.saveExcelData(excelDataAsList);
	    	model.addAttribute("students",noOfRecords);
//	    	model.addAttribute("students",excelDataAsList);
	    	model.addAttribute("students",excelserviceim.getAllStudent());
	    	
	    	return "customer/search";
	    }
	    
	    @PostMapping("/search")
	    public String searchStudent(@RequestParam(name = "studenCode", defaultValue = "") String studenCode, @RequestParam(name = "name", defaultValue = "") String name, Model model) {

	        model.addAttribute("students", excelserviceim.searchStudent(studenCode, name));
	        return "customer/search";
	    }
}
