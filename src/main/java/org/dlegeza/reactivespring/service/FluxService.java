package org.dlegeza.reactivespring.service;

import java.time.Duration;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class FluxService {

	public Flux<Long> getFlux() {
		return Flux.interval(Duration.ofSeconds(1)).take(20);
	}
}
