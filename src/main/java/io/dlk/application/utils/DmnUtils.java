package io.dlk.application.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import io.dlk.domain.ProposalEntity;
import io.dlk.domain.VirtualPlanningElementEntity;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DmnUtils {
    
    private static final Map<String, ProposalEntity> proposals = new HashMap<>();

    public static ProposalEntity getModel(String caseType) {
        return proposals.getOrDefault(caseType, ProposalEntity.builder().build());
    }

    @PostConstruct
    public void proposalsInit() {
        var e1 = ProposalEntity.builder()
        .id(1L)
        .caseType("E-AC4-a-Nieuw")
        .virtualPlanningElements(
            Set.of(VirtualPlanningElementEntity.builder()
            .id(430082L)
            .type("VPE1")
            .build()))
        .build();
        var e2 = ProposalEntity.builder()
        .id(2L)
        .caseType("E-AC4-b-Nieuw")
        .virtualPlanningElements(
            Set.of(VirtualPlanningElementEntity.builder()
            .id(430083L)
            .type("VPE2")
            .build()))
        .build();

        proposals.put("E-AC4-a-Nieuw", e1);
        proposals.put("E-AC4-b-Nieuw", e2);

    }
}
