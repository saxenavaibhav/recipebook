package com.saxena.vaibhav.converter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.saxena.vaibhav.command.UnitOfMeasureCommand;
import com.saxena.vaibhav.domain.UnitOfMeasure;

public class UnitOfMeasureToUnitOfMeasureCommandTest {

	 public static final String DESCRIPTION = "description";
	    public static final Long LONG_VALUE = new Long(1L);

	    UnitOfMeasureToUnitOfMeasureCommand converter;

	    @Before
	    public void setUp() throws Exception {
	        converter = new UnitOfMeasureToUnitOfMeasureCommand();
	    }

	    @Test
	    public void testNullObjectConvert() throws Exception {
	        assertNull(converter.convert(null));
	    }

	    @Test
	    public void testEmptyObj() throws Exception {
	        assertNotNull(converter.convert(new UnitOfMeasure()));
	    }

	    @Test
	    public void convert() throws Exception {
	        //given
	        UnitOfMeasure uom = new UnitOfMeasure();
	        uom.setId(LONG_VALUE);
	        uom.setDescription(DESCRIPTION);
	        //when
	        UnitOfMeasureCommand uomc = converter.convert(uom);

	        //then
	        assertEquals(LONG_VALUE, uomc.getId());
	        assertEquals(DESCRIPTION, uomc.getDescription());
	    }
}
