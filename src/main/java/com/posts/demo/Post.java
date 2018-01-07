package com.posts.demo;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

  @Id
  @JsonProperty(access = READ_ONLY)
  private String id;

  @NotEmpty
  @Length(max = 300)
  private String title;

  @NotEmpty
  private String description;

  @JsonProperty(access = READ_ONLY)
  private Instant createdDate;

  @JsonProperty(access = READ_ONLY)
  private Instant updatedDate;

  @JsonProperty(access = READ_ONLY)
  private Long commentsCount = 0L;

}
