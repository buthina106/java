import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise2 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
		
        Map<String, Optional<City>> CityHighPopulation = countryDao.findAllCountries()
            .stream()
            .flatMap(country -> country.getCities().stream())
            .collect(
                Collectors.groupingBy(
                    city -> countryDao.findCountryByCode(city.getCountryCode()).getContinent(),
                    Collectors.maxBy(Comparator.comparingInt(City::getPopulation))
                )
            );
		
        CityHighPopulation.forEach((continent, city) -> {
            System.out.println("Continent: " + continent + ", Most Populated City: " + city.orElse(null));
        });
    }
}
