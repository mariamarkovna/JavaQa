package java.Home_work.hw171022;



public class Main {

    //Дано 2 массива. Первый массив String[] содержит имена студентов. Второй массив double[] содержит средний балл  студентов. i-й элемент первого массива соответствует i-элементу второго массива. Длины массивов равны. Необходимо написать метод, который возвращает имя самого успешного студена. В данной задаче, если 2 и более студента имеют лучший бал, метод может вернуть имя любого из них.

    public static void main(String[] args) {

        String[] names = {"Vasilij", "Ludmila", "Daria", "Dmitriy"};
        double[] grades = {4.5, 4.8, 4.7, 4.6};
        String topStudent = getTopStudent(names, grades);
        System.out.println("Top student: " + topStudent);




    }
    public static String getTopStudent(String[] names, double[] grades) {
        double maxGrade = grades[0];
        int index = 0;

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > maxGrade) {
                maxGrade = grades[i];
                index = i;
            }
        }

        return names[index];
    }
}
