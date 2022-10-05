### Словник атрибутів об’єктів

<table>
    <thead align="center">
        <tr>
            <td>Об'єкт</td>
            <td>Атрибут</td>
            <td>Короткий опис</td>
            <td>Тип</td>
            <td>Обмеження</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>User</td>
            <td>account_type</td>
            <td>Описує тип акаунту</td>
            <td>текст</td>
            <td>Значення тільки "читач", "спортсмен" або "спонсор"</td>
        </tr>
       <tr>
            <td>User</td>
            <td>name</td>
            <td>Ім'я користувача</td>
            <td>текст</td>
            <td>Не більше 50 символів</td>
        </tr>
        <tr>
            <td>User</td>
            <td>surname</td>
            <td>Прізвище користувача</td>
            <td>текст</td>
            <td>Не більше 50 символів</td>
        </tr>
        <tr>
            <td>User</td>
            <td>balance</td>
            <td>Баланс користувача</td>
            <td>грошовий</td>
            <td>Не менше 0</td>
        </tr>
        <tr>
            <td>User</td>
            <td>preferred_sport</td>
            <td>Переважний тип спорту</td>
            <td>текст</td>
            <td>Не більше 50 символів</td>
        </tr>
        <tr>
            <td>Viewer</td>
            <td>selected_competion</td>
            <td>Вибране до перегляду змагання</td>
            <td>текст</td>
            <td>Не більше 50 символів</td>
        </tr>
        <tr>
            <td>Sponsor</td>
            <td>competition</td>
            <td>Вибрані змагання для спонсорства</td>
            <td>перелік змагань</td>
            <td></td>
        </tr>
        <tr>
            <td>Sponsor</td>
            <td>sportsman</td>
            <td>Вибрані спортсмени для спонсорства</td>
            <td>перелік спортсменів</td>
            <td></td>
        </tr>
        <tr>
            <td>Sportsman</td>
            <td>victories</td>
            <td>Кількість перемог</td>
            <td>чисельний</td>
            <td>Не менше 0</td>
        </tr>
        <tr>
            <td>Sport types</td>
            <td>type</td>
            <td>Тип спорту</td>
            <td>текст</td>
            <td>Не більше 50 символів</td>
        </tr>
        <tr>
            <td>Сompleted competitions</td>
            <td>name</td>
            <td>Назва змагання</td>
            <td>текст</td>
            <td>Не більше 50 символів</td>
        </tr>
        <tr>
            <td>Сompleted competitions</td>
            <td>date</td>
            <td>Дата проведення</td>
            <td>дата</td>
            <td></td>
        </tr>
        <tr>
            <td>Сompleted competitions</td>
            <td>address</td>
            <td>Адреса проведення</td>
            <td>текст</td>
            <td>Не більше 100 символів</td>
        </tr>
        <tr>
            <td>Сompleted competitions</td>
            <td>sport_type</td>
            <td>Тип спорту</td>
            <td>Перелік типів спорту</td>
            <td></td>
        </tr>
        <tr>
            <td>Сompleted competitions</td>
            <td>winner</td>
            <td>Переможець змагання</td>
            <td>sportsman</td>
            <td></td>
        </tr>
        <tr>
            <td>Active competitions</td>
            <td>name</td>
            <td>Назва змагання</td>
            <td>текст</td>
            <td>Не більше 50 символів</td>
        </tr>
        <tr>
            <td>Active competitions</td>
            <td>date</td>
            <td>Дата проведення</td>
            <td>дата</td>
            <td></td>
        </tr>
        <tr>
            <td>Active competitions</td>
            <td>address</td>
            <td>Адреса проведення</td>
            <td>текс</td>
            <td>Не більше 100</td>
        </tr>
        <tr>
            <td>Active competitions</td>
            <td>sport_type</td>
            <td>Тип спорту</td>
            <td>Перелік типів спорту</td>
            <td></td>
        </tr>
        <tr>
            <td>Active competitions</td>
            <td>participants_number</td>
            <td>Кількість учасників</td>
            <td>числовий</td>
            <td>Не більше 100</td>
        </tr>
        <tr>
            <td>Active competitions</td>
            <td>sponsors</td>
            <td>Спонсори змагання</td>
            <td>перелік спонсорів</td>
            <td></td>
        </tr>
    </tbody>
</table>
