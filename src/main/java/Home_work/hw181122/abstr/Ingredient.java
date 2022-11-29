package Home_work.hw181122.abstr;

public abstract class Ingredient {
    //Создать абстрактный класс Ingredient с полем quantity, геттером, сеттром, абстрактным
    // методом long calculateQuantityFor100Gramm() (сколько грамм сырого продукта нужно, чтобы получить 100 грамм после приготовления) ``.
    int quantity;

    //--------Konst-------
    public Ingredient(int quantity) {
        this.quantity = quantity;
    }

    //________Get_____
    public int getQuantity() {
        return quantity;
    }

    //________SEt-----------------
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //--------abstr metod-------
    public abstract long calculateQuantityFor100Gramm();
}

