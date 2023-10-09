package com.food.ordering.system.order.service.domain.dto.create;

import com.food.ordering.system.domain.valueobject.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class CreateRenderResponse {
    @NotNull
    private final UUID orderTrackId;
    @NotNull
    private final OrderStatus orderStatus;
    @NotNull
    private final String message;
}
