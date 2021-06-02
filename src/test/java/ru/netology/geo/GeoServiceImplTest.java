package ru.netology.geo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {

    @Test
    void ru_byIp_test() {
        GeoService geoService = new GeoServiceImpl();

        Location location = geoService.byIp("172.123.12.19");
        Country expected = Country.RUSSIA;
        Country actual = location.getCountry();
        assertEquals(expected, actual);
    }

    @Test
    void usa_byIp_test() {
        GeoService geoService = new GeoServiceImpl();

        Location location = geoService.byIp("96.123.12.19");
        Country expected = Country.USA;
        Country actual = location.getCountry();
        assertEquals(expected, actual);
    }
}