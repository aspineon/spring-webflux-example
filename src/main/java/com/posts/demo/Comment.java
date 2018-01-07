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
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

  @Id
  private String id;

  @JsonProperty(access = READ_ONLY)
  @Indexed
  private String postId;

  @NotEmpty
  @Length(max = 300)
  private String description;

  @JsonProperty(access = READ_ONLY)
  private Instant createdDate;
}
