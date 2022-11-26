### Робота з СКБД PostgreSQL через Docker-контейнер

Крок 1. Завантажимо Docker-образ для СКБД PostgreSQL з назвою postgres через команду:

`docker pull postgres`

Крок 2. Запустимо Docker-образ postgres зі створенням Docker-контейнеру з такими характеристиками:

-	назва evchev-postgres;
-	порт 5432;
-	визначення пароля користувача-адміністратора СКБД - 4213
-	створення робочого каталогу /scripts, в якому будуть зберігатися скрипти для ініціалізації БД;
-	встановлюємо зв’язок між локальним каталогом комп’ютера та робочим каталогом;
-	запуск процесу серверу СКБД у фоновому режимі.

Для вказаних дій виконаємо команду:

`docker run --name evchev-postgres -p 5455:5432 -e POSTGRES_PASSWORD=4213 -w /scripts -v ${PWD}:/scripts -d --rm postgres`

Крок 3. У Docker-контейнері blazhko-postgres виконаємо команду bash для початку роботу з облонкою командного рядку:

`docker exec -it evchev-postgres bash`

Крок 4. В оболонці командного рядку виконаємо команду createdb для створення БД evchevdb від імені користувача-адміністратора postgres через команду:

`createdb evchevdb -U postgres`

Крок 5. В оболонці командного рядку завантажимо скрипт db_scripts.sql, розташований в робочому каталозі, до БД через команду:

`psql -U postgres -d evchevdb < /scripts/db_script.sql`

Крок 6. Вийдемо з оболонки командного рядку:

`exit`

Крок 7. Зупинимо роботу контейнера evchev-postgres через команду:

`docker stop evchev-postgres`

