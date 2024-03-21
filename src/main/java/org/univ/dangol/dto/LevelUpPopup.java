package org.univ.dangol.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class LevelUpPopup {
    private LevelUpIntroducePopup levelUpIntroducePopup;
    private RewardPopup rewardPopup;
}

