package com.thirty.api.domain;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by ByeongChan on 2018. 1. 16..
 */

@Setter
@Getter
@ToString(exclude = "quizList")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(value = { AuditingEntityListener.class })
@Table(name="member")
public class Member implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long memberId;

    @Column
    private String uniqueKey;

    @Column
    private boolean status;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="memberId")
    private List<Quiz> quizList;

    public static Member build(String uniqueKey, boolean status) {
        return Member.builder()
                .uniqueKey(uniqueKey)
                .status(status)
                .build();
    }
}
