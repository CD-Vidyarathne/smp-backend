package com.eadcw.user;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;

@Data
@Builder
@Document(collection = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
  @MongoId(FieldType.OBJECT_ID)
  private ObjectId id;
  private String firstname;
  private String lastname;
  private String email;
  private String password;
  private boolean isActive;
  private String joinedDate;
}
