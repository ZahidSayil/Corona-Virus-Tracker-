package com.viz.ai.cvt.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LocationStats {

	private String state;
    private String country;
    private int latestTotalCases;
	private int diffFromPrevDay;
//    private String 	confirmed;
//    private String deaths;
//    private String recovered;


}
