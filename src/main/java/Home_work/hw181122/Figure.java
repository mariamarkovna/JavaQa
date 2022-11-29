package Home_work.hw181122;

public class Figure {

    /* 1. Создать иерархию классов геометрических фигур
     Должны быть следующие классы
     Figure, Square, Circle, Triangle, Rectangle
             (Фигура, квадрат, круг, треугольник, прямоугольник)

     У каждой фигуры должен быть метод public void show(), который распечатывает сообщение, какая именно фигура, например, "I'm a square!"

     Создать каждую фигуру и вызвать метод.*/
    String name;

    public Figure(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("I'm a " + name + "!");
    }

}
