package com.github.killer0014.issuelijst;

import static org.junit.Assert.*;
import org.junit.Test;

public class StatusTest {

@Test

public void testStatus(){

Status status = new Status("open");


assertNotNull(status);

assertEquals("open", status.getName());

}
