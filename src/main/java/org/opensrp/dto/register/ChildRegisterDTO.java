package org.opensrp.dto.register;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ChildRegisterDTO {
	
	@JsonProperty
	private List<ChildRegisterEntryDTO> childRegisterEntries;
	
	public ChildRegisterDTO(List<ChildRegisterEntryDTO> childRegisterEntries) {
		this.childRegisterEntries = childRegisterEntries;
	}
	
	@Override
	public final boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}
	
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
