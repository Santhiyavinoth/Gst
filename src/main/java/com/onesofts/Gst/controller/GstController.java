package com.onesofts.Gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.onesofts.Gst.entity.Gst;
import com.onesofts.Gst.service.GstService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
public class GstController {
	@Autowired
	GstService gs;
	@PostMapping("setdata")
	public String getSave(@RequestBody Gst e) {
		return gs.getSave(e);
	}
	
	@PostMapping("setAll")
	public String postData(@RequestBody List<Gst> e) {
		
		return gs.postData(e);
	}
	@PutMapping("check")
	public String putDetails(@RequestBody Gst e) {
		return gs.putDetails(e);
	}
	@GetMapping("getData/{a}")
	public Gst getData(@PathVariable int a) {
		return gs.getData(a);
	}
	@GetMapping("getMap")
	public Gst getMap(@RequestBody e){
		return gs.getMap(e);
	}
	@GetMapping("getDataAll")
	public List<Gst> getDataAll() {
	    return gs.getDataAll();
	}
	@DeleteMapping("delete/{a}")
    public String deleteData( @PathVariable int a) {
	 return gs.deleteData(a);
	}
//	@GetMapping("getPath/{a}")
//public int getName(@PathVariable String a) {
//		return gs.getName(a);
////	}
	@GetMapping(value = "/getHsn/{hsn}")
	public Integer getHsn(String hsn) {
		return gs.getHsn(hsn);
	}
	@GetMapping("/getMax")
	public Gst getMax() {
		return gs.getMax();
	}
	@GetMapping("pathBrand/{a}")
	public List<Gst> getByBrand(@PathVariable String a) {
		return gs.getByBrand(a);
	}
	@PutMapping("update/{id}")
	public String putData(@PathVariable int id, @RequestBody  Gst a) {
		return gs.putData(id, a);
	}
}
