package br.com.mynewcar.apicar.service;

import br.com.mynewcar.apicar.repositories.ICarRepository;
import br.com.mynewcar.apicar.services.CarService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {

    private static final long INVALID_BEER_ID = 1L;

    @Mock
    private ICarRepository iCarRepository;

    @InjectMocks
    private CarService carService;

    @Test
    void whenCarInformedThenItShouldBeCreated() {

    }

}
