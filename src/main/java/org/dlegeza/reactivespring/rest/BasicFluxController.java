package org.dlegeza.reactivespring.rest;

import org.dlegeza.reactivespring.service.FluxService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("basic-flux")
@RequiredArgsConstructor
public class BasicFluxController {
	private final FluxService fluxService;

	@GetMapping(value = "{length}", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
	public Flux<Long> getNumbersWithTimeInterval(@PathVariable int length) {
		return this.fluxService.getFlux(length);
	}
}
