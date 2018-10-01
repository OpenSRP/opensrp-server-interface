package org.opensrp.dto.register;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.opensrp.dto.utils.PojoTestUtils;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class IUDFPDetailsDTOTest {
	
	@Test
	public void testAccesors_shouldAccessProperField() {
		PojoTestUtils.validateAccessors(IUDFPDetailsDTO.class);
	}
	
	@Test
	public void testEqualsAndHashCode() {
		EqualsVerifier.forClass(IUDFPDetailsDTO.class).suppress(Warning.NONFINAL_FIELDS).verify();
	}
	
	@Test
	public void testToString() {
		String fpAcceptanceDate = "2017-07-19";
		IUDFPDetailsDTO iudfpDetailsDTO = new IUDFPDetailsDTO(fpAcceptanceDate, "", "", "");
		System.out.println(iudfpDetailsDTO.toString());
		assertEquals("2017-07-19", iudfpDetailsDTO.getFpAcceptanceDate());
		assertTrue(iudfpDetailsDTO.toString().contains(fpAcceptanceDate));
		assertFalse(iudfpDetailsDTO.toString().contains("lmpDate=2017-08-19"));
	}
}
