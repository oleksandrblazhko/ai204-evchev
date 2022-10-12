### Прототипи методів програмних класів

### Опис функціональних вимог

<table>
    <thead align="center">
        <tr>
            <td>FR</td>
            <td>Опис функціональної вимоги</td>
            <td>Назва класу</td>
            <td>Назва методу класу</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td align="center">FR1</td>
            <td>Показ інформації про змагання</td>
        </tr>
        <tr>
            <td align="center">FR1.1</td>
            <td>Система повинна надавати користувачу перелік усіх змагань</td>
            <td>User</td>
            <td>findAllComp()</td>
        </tr>
        <tr>
            <td align="center">FR1.2</td>
            <td>Користувач може шукати змагання за назвою або фільтрами (тип змагання, дата проведення тощо)</td>
            <td>User</td>
            <td>findByComp()</td>
        </tr>
        <tr>
            <td align="center">FR1.3</td>
            <td>Користувач може подивитися точне місце проведення змагання на онлайн мапі</td>
             <td>User</td>
            <td>findCompByMap()</td>
        </tr>
        <tr>
            <td align="center">FR1.4</td>
            <td>Користувач має можливість переглянути участників і їх доступну інформацію</td>
            <td>ActiveCompetitions</td>
            <td>participantsInfo()</td>
        </tr>
        <tr>
            <td align="center">FR1.5</td>
            <td>Користувач може обрати будь-яке змагання для перегляду повної інформації</td>
            <td>-</td>
            <td>-</td>
        </tr>
        <tr>
            <td align="center">FR2</td>
            <td>Продаж місячної підписки</td>
        </tr>
        <tr>
            <td align="center">FR2.1</td>
            <td>Система повинна надати користувачу варіанти функціоналу підписки в залежності від типу аккаунту</td>
            <td>-</td>
            <td>-</td>
        </tr>
        <tr>
            <td align="center">FR2.2</td>
            <td>Користувач може обрати спосіб сплати підписки</td>
            <td>User</td>
            <td>setPaymentMethod()</td>
        </tr>
        <tr>
            <td align="center">FR2.3</td>
            <td>Користувач обирає готові приклади функціоналу для підписки або додає функції самостійно зі списку</td>
            <td>User</td>
            <td>setSubFunctions()</td>
        </tr>
        <tr>
            <td align="center">FR2.4</td>
            <td>Система автоматично формує заявку підписки</td>
            <td>User</td>
            <td>createPayRequest()</td>
        </tr>
        <tr>
            <td align="center">FR2.5</td>
            <td>Система відправляє запит на оплату за обраним раніше способом сплати</td>
            <td>User</td>
            <td>sendPayRequest()</td>
        </tr>
        <tr>
            <td align="center">FR2.6</td>
            <td>Користувач підтверджує платіж і автоматично отримує місячну підписку</td>
            <td>User</td>
            <td>getSub()</td>
        </tr>
    </tbody>
</table>
