package org.zerock.mallapi.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.AttributeAccessor;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class PageRequestDTO {
  
  @Builder.Default
  private int page=1;
  
  @Builder.Default
  private int size = 10;
}
