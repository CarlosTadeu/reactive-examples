package carlostadeu.springframework.reactiveexamples;

import carlostadeu.springframework.reactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonRespository {

    Mono<Person> getById(Integer id);

    Flux<Person> findAll();
}
