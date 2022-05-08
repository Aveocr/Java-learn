package com.example.App.work6;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class File {
    static String URL = "https://raw.githubusercontent.com/rassafel/java-learn/master/tasks/data/CAR_DATA.csv";
    static Map<String, Integer> HEADERS = new HashMap<>();
    static String DELIMITER = ",";

    private static final String path_1 = "./basic-learn/src/main/resources/cars.csv";
    private static final String path_2 = "./basic-learn/src/main/resources/cars_color.csv";
    private static final String path_3 = "./basic-learn/src/main/resources/cars_maker.csv";
    private static final String path_4 = "./basic-learn/src/main/resources/cars_final.csv";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = getReader();
        HEADERS = readHeaders(reader);
        List<Car> rowCars = parseCars(reader);
        System.out.println(rowCars.get(1).getColor());
        // Запись в файл
        Write2File write2File = new Write2File();
        write2File.write(path_1, HEADERS.toString() + "\n", true);
        write2File.write(path_1, rowCars.toString(), true);
        /* Конец 1 задания */

        Map<String, List<Car>> colorOfTheCar = groupByColor(rowCars);
        // запись в файл группировки по цвету
        for(Map.Entry<String, List<Car>> entry: colorOfTheCar.entrySet()) {
            String key = entry.getKey();
            List<Car> value = entry.getValue();
            write2File.write(path_2, "Color: " + key + "\n" + value.toString() + "\n", true);
        }

        // Создание map с группировкой по производителю
        Map<String, List<Car>> makerOfTheCar = groupByMaker(rowCars);
        // Преобразование Map<key, value> в List
        List<CarMaker> carMakers = convertMap2List(makerOfTheCar);
        write2File.write(path_3, carMakers.toString(), true);
        System.out.println(printCarObject(carMakers));
        // Удаление всех ключей, который имеют меньше одной модели
        makerOfTheCar.entrySet().removeIf(entry -> countUniqueModels(makerOfTheCar, entry.getKey()) < 2);

        // Сортировка по алфавиту с помощью TreeMap
        carMakers = convertMap2List(new TreeMap<>(makerOfTheCar));
        write2File.write(path_4, carMakers.toString(), true);
    }

    // Форматирование вывод производителей
    static String printCarObject(List<CarMaker> carMakers){
        return (carMakers.stream()
                .map(CarMaker::getMaker)
                .collect(Collectors.toSet())
                .stream().collect(Collectors.joining("\",\"", "{\" ", "\"}")));
    }

    // Подсчет уникальный моделей у производителей
    static int countUniqueModels(Map<String, List<Car>> makeOfTheCar, String key){
        List<String> makers = new LinkedList<>();
        for (Car cars: makeOfTheCar.get(key)) {
            makers.add(cars.getModel());
        }
        return (new LinkedHashSet<>(makers)).size();
    }
    static BufferedReader getReader() throws IOException {
        URL url = new URL(URL);
        URLConnection connection = url.openConnection();
        return new BufferedReader(new InputStreamReader(connection.getInputStream()));
    }
    // Считываем заголовок
    static Map<String, Integer> readHeaders(BufferedReader reader) throws IOException {
        Map<String, Integer> headers = new HashMap<>();
        String header = reader.readLine();
        String[] headersArray = header.split(DELIMITER);
        for(int i =0; i<headersArray.length; i++){
            headers.put(headersArray[i], i);
        }
        return headers;
    }

    // Парсим информацию о машине
    static List<Car> parseCars(BufferedReader reader) throws IOException {
        List<Car> rowCar = new LinkedList<>();
        String line;
        while ((line = reader.readLine()) != null){
            String[] values = line.split(DELIMITER); // Преобразуем строку в массив
            rowCar.add(PARSE_CAR.apply(values));
        }
        return Collections.unmodifiableList(rowCar); // Возвращаем список
    }

    // Преобразуем строку в объект Car
    private final static Function<String[], Car> PARSE_CAR = (String[] values) -> {
        Car cars = new Car(values[1]);
        cars.setModel(values[0]);
        cars.setYear(Integer.parseInt(values[2]));
        cars.setColor(values[3]);
        return cars;
    };

    // Группировка по цвету
    static Map<String, List<Car>> groupByColor(List<Car> cars){
        return cars.stream()
                .collect(Collectors.groupingBy(Car::getColor));
    }
    // Группировка по производителю
    static Map<String, List<Car>> groupByMaker(List<Car> cars){
        return cars.stream()
                .collect(Collectors.groupingBy(Car::getMaker, Collectors.toList()));
    }

   static List<CarMaker> convertMap2List(Map<String, List<Car>> cars) {
     List<CarMaker> carMaker = new LinkedList<>();
      for(Map.Entry<String, List<Car>> entry: cars.entrySet()){
            for(int i = 0; i < entry.getValue().size(); i++){
                // Создаем новый объект CarMaker и сразу же добавляем в список
                carMaker.add(new CarMaker(entry.getKey(), entry.getValue().get(i)));
            }
        }
      return carMaker;
    }

}
