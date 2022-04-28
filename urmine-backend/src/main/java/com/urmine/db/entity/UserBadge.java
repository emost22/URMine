package com.urmine.db.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@IdClass(UserBadgeId.class)
public class UserBadge {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accountEmail")
    User user;
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "badgeId")
    Badge badge;
}
