package com.eljabiry.userService.business.abstracts;

import com.eljabiry.userService.entity.Claim;

public interface ClaimService {

    Claim getClaimByClaimName(String claimName);
}
