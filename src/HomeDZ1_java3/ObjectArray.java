package HomeDZ1_java3;

import java.util.Arrays;
import java.util.List;

/*КЛАСС ДЛЯ ВЫПОЛНЕНИЯ ПЕРВЫХ ДВУХ ПУНКТОВ ДЗ*/

public class ObjectArray<E> {

    private E[] data;
    private int sizeArray;
    private E tempo;

    public ObjectArray(int size) {
        this.data = (E[]) new Object[size];
    }


    public void add(E value) {
        add(value, sizeArray);
    }

    public void add(E value, int index) {
        data[index] = value;
        sizeArray++;
    }

    public void changeTwoElement() {
        tempo = data[0];
        data[0] = data[1];
        data[1] = tempo;
    }

    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }


    public void changeToArrayList() {
        List<E> newArrayList = Arrays.asList(data); /*Превращаем массив в список*/
        System.out.println("новый массив в виде списка: " + newArrayList + "\n");

    }
}
