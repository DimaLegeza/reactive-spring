package org.dlegeza.reactivespring.rest;

import org.dlegeza.reactivespring.service.FluxService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("basic-flux")
@RequiredArgsConstructor
public class BasicFluxController {
	private final FluxService fluxService;

	@GetMapping
	public Flux<Long> getNumbersWithTimeInterval() {
		return this.fluxService.getFlux();
	}
}