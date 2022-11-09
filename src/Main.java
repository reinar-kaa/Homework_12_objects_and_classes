public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Stephen", "King");
        Author secondAuthor = new Author("Jeorge", "Orwell");
        Book firstBook = new Book("Dreamcatcher", firstAuthor, 2001);
        Book secondBook = new Book("Animal Farm: A Fairy Story", secondAuthor, 1945);
        secondBook.setPublicationYear(1969);
        System.out.println("secondBook.getPublicationYear() = " + secondBook.getPublicationYear());
        System.out.println("firstBook.allInfo() = " + firstBook.allInfo());
        System.out.println("secondBook.allInfo() = " + secondBook.allInfo());
    }
}

    //1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
    // Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
    //2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
    //3. Написать конструкторы для обоих классов, заполняющие все поля.
    //4. Создать геттеры для всех полей автора и всех полей книги.
    //5. Создать сеттер для поля «Год публикации» у книги.
    //6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух)
    // и инициализировать друг друга. Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
    //    Метод main не должен находиться в классах Book и Author.
    //    Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
    //7. В том же методе main изменить год публикации одной из книг с помощью сеттера.
    //- **Критерии оценки**
    //    1. Классы созданы корректно.
    //    2. Поля созданы корректно. Использованы корректные имена и типы.
    //    3. Классы корректно создаются через конструктор.
    //    4. Классы имеют все необходимые геттеры и сеттеры.
    //    5. Объекты в методе main созданы.
