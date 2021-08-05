import Forecast.Weather;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(new Weather().getWeatherByLocationId(332287, "gl8OMsu0aYxcJ1HovrX6VHOLfJP6DSgV").body().string());
    }
}
/*
С помощью http запроса получить в виде json строки погоду в Санкт-Петербурге (или любом другом городе) на период времени
, пересекающийся со следующим занятием (например, выборка погода на следующие 5 дней - подойдет)
Подобрать источник самостоятельно. Можно использовать api accuweather, порядок следующий: зарегистрироваться,
зарегистрировать тестовое приложение для получения api ключа, найдите нужный endpoint и изучите документацию. Бесплатный
тарифный план предполагает получение погоды не более чем на 5 дней вперед (этого достаточно для выполнения д/з).
 */