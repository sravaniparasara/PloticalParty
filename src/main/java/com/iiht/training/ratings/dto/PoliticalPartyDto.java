package com.iiht.training.ratings.dto;

import java.util.Objects;

public class PoliticalPartyDto {

	private Long politicalPartyId;
	
	private String partyName;
	
	private String founderName;

	public Long getPoliticalPartyId() {
		return politicalPartyId;
	}

	public void setPoliticalPartyId(Long partyId) {
		this.politicalPartyId = partyId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getFounderName() {
		return founderName;
	}

	public void setFounderName(String founderName) {
		this.founderName = founderName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(founderName, politicalPartyId, partyName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoliticalPartyDto other = (PoliticalPartyDto) obj;
		return Objects.equals(founderName, other.founderName) && Objects.equals(politicalPartyId, other.politicalPartyId)
				&& Objects.equals(partyName, other.partyName);
	}

}
