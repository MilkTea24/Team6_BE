package com.example.tripKo.domain.member;

import lombok.Getter;

public enum MemberReservationStatus {
  RESERVATION_PROCESSING(1),
  RESERVATION_SUCCESS(2),
  REVIEW_SUCCESS(3);

  @Getter
  private final long id;

  MemberReservationStatus(long id) {
    this.id = id;
  }
}
