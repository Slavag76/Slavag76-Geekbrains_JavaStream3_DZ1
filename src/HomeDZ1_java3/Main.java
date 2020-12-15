package HomeDZ1_java3;


public class Main {

    public static void main(String[] args) {

        startArrayHomeWork(); /*Запускаем метод для выполнения первых двух пунктов ДЗ*/

        startFruits(); /*Запускаем метод для выполнения задания с фруктами*/


    }

    private static void startFruits() {
        Box<Apple> applesBox = new Box(3); /*Создаем коробку с апельсинами*/
        applesBox.add(new Apple(1.5));   /*Добавляем в коробку апельсины разного веса*/
        applesBox.add(new Apple(0.5));
        applesBox.add(new Apple(1.2));
        System.out.println("Вес коробки с яблоками " + applesBox.getWeightBox());


        Box<Orange> orangeBox = new Box(3); /*Создаем коробку с яблоками*/
        orangeBox.add(new Orange(1.4));   /*Добавляем в коробку яблоки разного веса*/
        orangeBox.add(new Orange(0.6));
        orangeBox.add(new Orange(1.1));
        System.out.println("Вес коробки с апельсинами " + orangeBox.getWeightBox());

        System.out.println("Коробка с яблоками тяжелее коробки с апельсинами? " + applesBox.compare(orangeBox));


    }

    private static void startArrayHomeWork() {

        ObjectArray<Integer> intArray = new ObjectArray(3); /*создаем Integer массив */
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);

        intArray.display();
        intArray.changeTwoElement(); /*меняем в массиве первые два элемента местами*/
        intArray.display();
        intArray.changeToArrayList(); /*форматируем массив в список ArrayList*/


        ObjectArray<String> stringArray = new ObjectArray(3); /*создаем String массив */
        stringArray.add("один");
        stringArray.add("два");
        stringArray.add("три");

        stringArray.display();
        stringArray.changeTwoElement(); /*меняем в массиве первые два элемента местами*/
        stringArray.display();
        stringArray.changeToArrayList(); /*форматируем массив в список ArrayList*/


    }
}
