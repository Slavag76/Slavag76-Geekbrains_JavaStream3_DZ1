package HomeDZ1_java3;


public class Box<E extends Fruit> {
    private E[] data;
    private double summ = 0.0;
    private int sizeArray;


    public Box(int size) {
        this.data = (E[]) new Fruit[size];
    } /*Создаем конструктор с массивом из фруктов типа E*/

    public void add(E value) {
        add(value, sizeArray); /*Вызываем в методе метод присваивания, где индекс массива увеличивается с каждым новым объектом*/
    }

    public void add(E value, int index) {
        data[index] = value;
        sizeArray++;
    }



    public double getWeightBox() {
        for (int i = 0; i <data.length ; i++) {
                       summ = summ + data[i].getWeight();
        }
        return summ;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeightBox() - otherBox.getWeightBox()) > 0;
    }


}


//
//
//import java.util.Arrays;
//        import java.util.List;
//
//public class ObjectArray<E> {
//
//    private E[] data;
//    private int sizeArray;
//    private E tempo;
//
//    public ObjectArray(int size) {
//        this.data = (E[]) new Object[size];
//    }
//
//
//    public void add(E value) {
//        add(value, sizeArray);
//    }
//
//    public void add(E value, int index) {
//        data[index] = value;
//        sizeArray++;
//    }
//
//    public void changeTwoElement() {
//        tempo = data[0];
//        data[0] = data[1];
//        data[1] = tempo;
//    }
//
//    public void display() {
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i] + " ");
//        }
//        System.out.println("");
//    }
//
//
//    public void changeToArrayList() {
//        List<E> newArrayList = Arrays.asList(data);
//        System.out.println("новый массив в виде списка: " + newArrayList + "\n");
//
//    }
//}
