package dev.shreya.reactiveprogramming;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

public class FluxAndMonoGeneratorServiceTest {

  FluxAndMonoGeneratorService fluxAndMonoGeneratorService = new FluxAndMonoGeneratorService();

  @Test
  void fluxOfNames() {
    var names = fluxAndMonoGeneratorService.fluxOfNames();

    StepVerifier.create(names)
        .expectNext("pathak","dey","sagar")
        .verifyComplete();
  }

  @Test
  void fluxOfNames_count() {
    var names = fluxAndMonoGeneratorService.fluxOfNames();

    StepVerifier.create(names)
        .expectNextCount(3)
        .verifyComplete();
  }

  @Test
  void fluxOfNamesMap() {
    var names = fluxAndMonoGeneratorService.fluxOfNamesMap();

    StepVerifier.create(names)
        .expectNext("PATHAK","DEY","SAGAR")
        .verifyComplete();
  }

  @Test
  void monoOfNames() {
    var names = fluxAndMonoGeneratorService.monoOfNames();
    StepVerifier.create(names)
        .expectNext("dey")
        .verifyComplete();
  }
}
