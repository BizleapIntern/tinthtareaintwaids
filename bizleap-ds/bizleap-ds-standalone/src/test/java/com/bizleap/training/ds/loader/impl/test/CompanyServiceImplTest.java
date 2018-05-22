package com.bizleap.training.ds.loader.impl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.bizleap.commons.domain.exception.ServiceUnavailableException;
import com.bizleap.training.ds.loader.DataManager;
import com.bizleap.training.ds.service.CompanyService;
import com.bizleap.training.ds.service.EmployeeService;
import com.bizleap.training.ds.service.dao.CompanyDao;

public class CompanyServiceImplTest extends ServiceTest {
	
	@Autowired
	@Qualifier("companyService")
	private CompanyService companyService;
	
	static Logger logger = Logger.getLogger(CompanyServiceImplTest.class);

	// @Ignore
	@Test
	public void testFindByCompanyBoId() throws ServiceUnavailableException, IOException {

		assertNotNull(companyService.findByCompanyBoId("COMP01"));
		logger.info("Company list: " + companyService.findByCompanyBoId("COMP01"));
		assertTrue(CollectionUtils.isNotEmpty(companyService.findByCompanyBoId("COMP01")));
	}

    // @Ignore
	@Test
	public void testGetAllCompany() throws IOException, ServiceUnavailableException {
		assertEquals(3, companyService.getAllCompany().size());
		logger.info("Company Count : "+companyService.getAllCompany().size());
	}
}