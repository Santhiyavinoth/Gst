package com.onesofts.Gst.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesofts.Gst.Repository.GstRepository;
import com.onesofts.Gst.entity.Gst;
@Repository
public class GstDao {
	@Autowired
GstRepository gr;
	public String getSave(Gst e) {
        gr.save(e);
		return "save Successfully";
	}
	
	
	public String postData(List<Gst> e) {
		gr.saveAll(e);
		return "save all successfuly";
	}
	public String putDetails(Gst e) {
	    gr.save(e);
		return "update successfully";
	}
	public Gst getData(int a) {
		return gr.findById(a).get();
	}
	public List<Gst> getDataAll() {
	   return gr.findAll();
		
	}
	public String deleteData(int a) {
		gr.deleteById(a);
		return "deleted successfully";
	}

//	public int getName(String a) {
//		return gr.findbyNname()
//	}
	
	public Integer getHsn(String hsn) {
		return gr.getHsn(hsn);
	}

}
