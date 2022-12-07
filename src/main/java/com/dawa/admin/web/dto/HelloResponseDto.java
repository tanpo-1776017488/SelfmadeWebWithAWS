package com.dawa.admin.web.dto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@Getter // 선언된 모든 필드의 get 메소드를 생성해 줍니다.
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
