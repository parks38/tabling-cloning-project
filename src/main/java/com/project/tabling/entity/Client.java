package com.project.tabling.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 클라이언트(고객)
 *
 * writer @suna.park
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Client {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
  private int id;

}
