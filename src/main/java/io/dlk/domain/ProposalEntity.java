package io.dlk.domain;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProposalEntity {

    private long id;
    private String caseType;
    private Set<VirtualPlanningElementEntity> virtualPlanningElements = new HashSet<>();
    
}
