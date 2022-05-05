# Java-learn


## Используемый стек технологий

- Java 8
- Maven 3.6.3
- JUnit 5

Список задач с ссылками на классы содержащие решение
========================
Work1Test "Работа с ветвлениями и циклами"
-------------------------
1. Написать программу, которая определяет, является ли число «счастливым билетом». Осуществить проверку для шестизначных чисел. Число пользователь вводит с клавиатуры.</br>
   [Test1](https://github.com/Aveocr/Java-learn/blob/task1/basic-learn/src/test/java/com/example/App/work1/Task1Test.java "")
3. Написать программу, которая определяет, является ли число простым. Число пользователь вводит с клавиатуры.</br>
   [Test3](https://github.com/Aveocr/Java-learn/blob/task1/basic-learn/src/test/java/com/example/App/work1/Task3Test.java "")


Work3Test "Работа с двумерными массивами"
-------------------------
1. Вычислить сумму каждой строки двумерного массива и записать результаты в одномерный массив.</br>
   [Test1](https://github.com/Aveocr/Java-learn/blob/task1/basic-learn/src/test/java/com/example/App/work3/Task1Test.java "")
2. Вычислить сумму каждого столбца двумерного массива и записать результаты в одномерный массив.</br>
   [Test2](https://github.com/Aveocr/Java-learn/blob/task1/basic-learn/src/test/java/com/example/App/work3/Task2Test.java "")

Work4Test "Работа со строками"
-------------------------
1. Напишите метод, который получает в качестве параметра строку и возвращает массив из следующих элементов:

* первый символ строки;
* два первых символа;
* три первых символа и так далее.</br>
   [Test1](https://github.com/Aveocr/Java-learn/blob/task1/basic-learn/src/test/java/com/example/App/work4/Task1Test.java "")
2. Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов. Метод возвращает строку, составленную только из заглавных букв.</br>
   [Test2](https://github.com/Aveocr/Java-learn/blob/task1/basic-learn/src/test/java/com/example/App/work4/Task2Test.java "")
3. Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов. Метод должен вернуть массив из всех цифр в строке.</br>
   [Test3](https://github.com/Aveocr/Java-learn/blob/task1/basic-learn/src/test/java/com/example/App/work4/Task3Test.java "")
4. Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов. Метод должен вернуть сумму из всех цифр в строке.</br>
   [Test4](https://github.com/Aveocr/Java-learn/blob/task1/basic-learn/src/test/java/com/example/App/work4/Task4Test.java "")
5. Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов. Метод должен вернуть строку состоящую из уникальных символов.</br>
   [Test5](https://github.com/Aveocr/Java-learn/blob/task1/basic-learn/src/test/java/com/example/App/work4/Task5Test.java "")
6. Напишите метод, который принимает массив строк, состоящих из букв, цифр и иных символов. Метод должен вернуть строку с максимальным количеством уникальных символов.</br>
   [Test6](https://github.com/Aveocr/Java-learn/blob/task1/basic-learn/src/test/java/com/example/App/work4/Task6Test.java "")
7. Напишите метод, который принимает строку, состоящую из слов, разделенных пробелами. Метод должен вернуть слово с максимальным количеством уникальных символов.</br>
   [Test7](https://github.com/Aveocr/Java-learn/blob/task1/basic-learn/src/test/java/com/example/App/work4/Task7Test.java "")



## Задача

1. Проанализировать компоненты
2. Построить иерархию компонентов
3. Разработать и реализовать компоненты
4. Протестировать реализованные компоненты

При необходимости можно создавать дополнительные интерфесы, классы или методы.

## Список компонентов

- [Square](https://github.com/Aveocr/Java-learn/blob/task2/basic-learn/src/main/java/com/example/App/work5/Square.java) - квадрат
- [Rectangle](https://github.com/Aveocr/Java-learn/blob/task2/basic-learn/src/main/java/com/example/App/work5/Rectangle.java) - прямоугольник
- [Circle](https://github.com/Aveocr/Java-learn/blob/task2/basic-learn/src/main/java/com/example/App/work5/Circle.java) - окружность
- [Triangle](https://github.com/Aveocr/Java-learn/blob/task2/basic-learn/src/main/java/com/example/App/work5/Tringle.java) - треугольник

### Тестирование компонентов
- [Square](https://github.com/Aveocr/Java-learn/blob/task2/basic-learn/src/test/java/com/example/App/work5/RectangleTest.java)
- [Rectangle](https://github.com/Aveocr/Java-learn/blob/task2/basic-learn/src/test/java/com/example/App/work5/RectangleTest.java) 
- [Circle](https://github.com/Aveocr/Java-learn/blob/task2/basic-learn/src/test/java/com/example/App/work5/CircleTest.java)
- [Tringle](https://github.com/Aveocr/Java-learn/blob/task2/basic-learn/src/test/java/com/example/App/work5/TringleTest.java)
- [Color](https://github.com/Aveocr/Java-learn/blob/task2/basic-learn/src/test/java/com/example/App/work5/ColorTest.java)
## Требования к компонентам

- Компонент должен хранить информацию о своем цвете, в одной из следующих моделей:
   - RGB:
      - red - красный цвет, целочисленное значение, в пределах 0-255
      - green - зеленый цвет, целочисленное значение, в пределах 0-255
      - blue - синий цвет, целочисленное значение, в пределах 0-255
   - HSB:
      - hue - цветовой тон, целочисленное значение, в пределах 0-360
      - saturation - насыщенность, целочисленное значение, в пределах 0-100
      - brightness - яркость, целочисленное значение, в пределах 0-100
- Получение площади компонента
- Информативный вывод компонентов
- Копонент должен хранить информацию о длинах сторон/радиуса
- После создания компонента можно изменять только его цвет
- При создании компонента с некорректными значениями должна выбрасываться ошибка с соответствующим сообщением
