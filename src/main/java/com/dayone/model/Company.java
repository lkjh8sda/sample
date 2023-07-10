package com.dayone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    // 엔티티는 db와 직접 매핑되는 클래스라서, 엔티티 인스턴스를 서비스 내부에서 데이터를 주고받거나 데이터를 변경하는 로직이 들어가면
    // 꼬일 수 있다
    private String ticker;
    private String name;
}
