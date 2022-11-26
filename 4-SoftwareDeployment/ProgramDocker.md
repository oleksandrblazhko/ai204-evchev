Крок 1. Завантажимо Docker-образ для JDK з назвою openjdk через команду:
docker pull openjdk
Крок 2. Запустимо Docker-образ openjdk для компіляції Java-програми, виконавши наступну команду:
docker run --name evchev-java -w /app -v ${PWD}:/app --rm openjdk javac -cp "./postgresql-42.5.0.jar:./" PostgreSQL.java
-	вазва контейнеру evchev-java
-	cтворюємо каталог з файлами у файловій системі нового Docker-образу
-	встановлюємо зв’язок
-	видаляємо контейнер після завершення його роботи
-	вкажемо драйвер для нашої бази даних postgresql-42.5.0.jar
Крок 3. Запустимо Docker-образ openjdk для виконання Java-класу, виконавши наступну команду:
docker run --name evchev-java --network container:evchev-postgres -w /app -v ${PWD}:/app --rm openjdk java -cp "./postgresql-42.5.0.jar:./" PostgreSQL
-	назва контейнеру evchev -java
-	щоб створити з'єднання з уже працюючим контейнером, використаємо флаг --network container:<CONTAINER_NAME>
-	cтворюємо каталог з файлами у файловій системі нового Docker-образу
-	встановлюємо зв’язок 
-	видаляємо контейнер після завершення його роботи
-	вкажемо драйвер для нашої бази даних postgresql-42.5.0.jar
-	виконаємо скомпільований раніше файл 
