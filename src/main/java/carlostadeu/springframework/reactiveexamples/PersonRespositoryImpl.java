package carlostadeu.springframework.reactiveexamples;

import carlostadeu.springframework.reactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonRespositoryImpl implements PersonRespository {
    @Override
    public Mono<Person> getById(Integer id) {
        return null;
    }

    @Override
    public Flux<Person> findAll() {
        return null;
    }
}
