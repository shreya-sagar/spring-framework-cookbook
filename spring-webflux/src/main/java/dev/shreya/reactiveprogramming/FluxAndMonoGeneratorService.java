package dev.shreya.reactiveprogramming;

import java.util.List;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxAndMonoGeneratorService {

  public static void main(String[] args) {
    FluxAndMonoGeneratorService fluxAndMonoGeneratorService = new FluxAndMonoGeneratorService();
    fluxAndMonoGeneratorService.fluxOfNames().subscribe(name -> System.out.println("Flux Name : " + name));
    fluxAndMonoGeneratorService.fluxOfNamesMap().subscribe(name -> System.out.println("Flux Name : " + name));
    fluxAndMonoGeneratorService.monoOfNames().subscribe(name -> System.out.println("Mono Name : " + name));
  }

  public Flux<String> fluxOfNames() {
    return Flux.fromIterable(List.of("pathak","dey","sagar")).log();
  }

  public Flux<String> fluxOfNamesMap() {
    return Flux.fromIterable(List.of("pathak","dey","sagar")).map(String::toUpperCase).log();
  }

  public Mono<String> monoOfNames() {
    return Mono.just("dey").log();
  }
}
