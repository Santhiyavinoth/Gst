package com.onesofts.Gst.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesofts.Gst.Dao.GstDao;
import com.onesofts.Gst.entity.Gst;
@Service
public class GstService {
	@Autowired
GstDao gd;

	public String getSave(Gst e) {
    
		return gd.getSave(e);
	}

	public String postData(List<Gst> e) {
		return  gd.postData(e);
				}

	public String putDetails(Gst e) {
		
		return gd.putDetails(e);
	}

	public Gst getData(int a) {
		return gd.getData(a);
	}

	public List<Gst> getDataAll() {
		return gd.getDataAll();
	}

	public String deleteData(int a) {
		return gd.deleteData(a);
	}

//	public int getName(String a) {
//		
//		return gd.getName(a);
//	}

	public Integer getHsn(String hsn) {
		return gd.getHsn(hsn);
	}
	public Gst getMax() {
		List<Gst>x=getDataAll();
		return x.stream().sorted(Comparator.comparingInt(Gst::getGst).reversed()).skip(1).findFirst().get();
	}

	public List<Gst> getByBrand(String a) {
		List<Gst>x=getDataAll();
		List<Gst>s=x.stream().filter(y->y.getProductName().equals(a)).collect(Collectors.toList());
	    return s;
	}
	public String putData(int id ,Gst a) {
		Gst x=getData(id);
		x.setProductName(a.getProductName());
		x.setHsnCode(a.getHsnCode());
		x.setGst(a.getGst());
		gd.getSave(x);
		return "updated";
	}
	
}
