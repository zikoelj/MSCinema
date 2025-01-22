package com.eljabiry.movieservice.dtos;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TicketInformationDto {
    private String movieName;
    private String salleName;
    private String movieDay;
    private String movieStartTime;
    private String email;
    private String fullName;
    private String phone;
    private String chairNumbers;
}