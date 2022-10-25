<table>
    <thead align="center">
        <tr>
            <td align="center">FR id</td>
            <td align="center">TC id</td>
            <td align="center">Опис кроків тестового сценарію</td>
            <td align="center">Опис очікуваних результатів</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td align="center">FR1.2</td>
            <td align="center">TC1.1</td>
            <td align="left">Початкові умови: змагання NewCompetition ще не знайдене
            <br>Кроки сценарію:
            <br>1) competitionName = "NewCompetition"
            <br>2) filters[8]</td>
            <td align="center">Результат = 1</td>
        </tr>
        <tr>
            <td align="center">FR1.2</td>
            <td align="center">TC1.2</td>
            <td align="left">Початкові умови: відсутні
            <br>Кроки сценарію:
            <br>1) competitionName = "1NewCompetition"
            <br>2) filters[8]</td>
            <td align="center">Результат = -1</td>
        </tr>
        <tr>
            <td align="center">FR1.2</td>
            <td align="center">TC1.3</td>
            <td align="left">Початкові умови: відсутні
            <br>Кроки сценарію:
            <br>1) competitionName.length() > 50
            <br>2) filters[8]</td>
            <td align="center">Результат = -1</td>
        </tr>
        <tr>
            <td align="center">FR1.2</td>
            <td align="center">TC1.4</td>
            <td align="left">Початкові умови: відсутні
            <br>Кроки сценарію:
            <br>1) competitionName = "NewCompetition"
            <br>2) filters[16]</td>
            <td align="center">Результат = -2</td>
        </tr>
    </tbody>
</table>
