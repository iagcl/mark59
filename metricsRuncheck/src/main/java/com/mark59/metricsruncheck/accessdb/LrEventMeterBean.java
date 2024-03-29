/*
 *  Copyright 2019 Insurance Australia Group Limited
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  you may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *      
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mark59.metricsruncheck.accessdb;

import java.math.BigDecimal;

/**
 * @author Philip Webb
 * Written: Australian Winter 2019  
 */
public class LrEventMeterBean {

	Integer			eventId;
	String			endTime;
	BigDecimal		value;
	String 			status1;	

	public LrEventMeterBean() {
	}


	public LrEventMeterBean(Integer eventId, String endTime, BigDecimal value, String status1) {
		this.eventId = eventId;
		this.endTime = endTime;
		this.value = value;
		this.status1 = status1;
	}







	public Integer getEventId() {
		return eventId;
	}


	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}


	public String getEndTime() {
		return endTime;
	}


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}


	public BigDecimal getValue() {
		return value;
	}


	public void setValue(BigDecimal value) {
		this.value = value;
	}


	public String getStatus1() {
		return status1;
	}


	public void setStatus1(String status1) {
		this.status1 = status1;
	}


	@Override
    public String toString() {
        return "[LrEventMapBean eventId= " + eventId + 
        		", endTime= " + endTime +
        		", value= " + value  +
        		", status1= " + status1  +        		
        		"]";
	}
		
}
