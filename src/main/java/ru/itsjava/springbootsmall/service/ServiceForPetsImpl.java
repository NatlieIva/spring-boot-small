package ru.itsjava.springbootsmall.service;


import org.springframework.stereotype.Service;
import ru.itsjava.springbootsmall.domain.Dog;
import ru.itsjava.springbootsmall.domain.Email;
import ru.itsjava.springbootsmall.domain.User;

@Service
public class ServiceForPetsImpl implements ServiceForPets{
    @Override
    public User getService() {
        System.out.println("Haircut for your dog");
        return new User("Max",new Email("max@gmail.com"), new Dog("Nick"));
    }
}
