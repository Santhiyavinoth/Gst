package com.onesofts.Gst.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onesofts.Gst.entity.Gst;

public interface GstRepository extends JpaRepository<Gst, Integer> {

	@Query(value ="select gst from emp.gst where hsn_code like \"h1123\";", nativeQuery = true)
	public Integer getHsn(String hsn);

}
