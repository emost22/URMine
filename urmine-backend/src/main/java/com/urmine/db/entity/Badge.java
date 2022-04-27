package com.urmine.db.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Badge {
    @Id
    String badgeId;
    String badgeImageUrl;

    @OneToMany(mappedBy = "badge", cascade = CascadeType.ALL)
    List<UserBadge> userBadgeList = new ArrayList<>();
}
