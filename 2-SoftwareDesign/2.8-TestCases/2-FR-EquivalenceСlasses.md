<table>
    <thead align="center">
        <tr>
            <td align="center">Опис вхідних умов</td>
            <td align="center">Правильний/неправильний клас еквівалентності</td>
            <td align="center">Опис значень вхідних даних</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td align="center">1) competitionName починається з латинської літери
            <br>2) довжина символів не повинна становити більше 50
            <br>3) кількість елементів масиву filters не може перевищувати зазначену кількість фільтрів(15)</td>
            <td align="center">Правильний</td>
            <td align="center">competitionName = "NewCompetition"
            <br>filters[8]</td>
        </tr>
        <tr>
            <td align="center">1) competitionName не починається з латинської літери
            <br>2) довжина символів не повинна становити більше 50
            <br>3) кількість елементів масиву filters не може перевищувати зазначену кількість фільтрів(15)</td></td>
            <td align="center">Неправильний</td>
            <td align="center">competitionName = "1NewCompetition"
            <br>filters[8]</td>
        </tr>
        <tr>
            <td align="center">1) competitionName починається з латинської літери
            <br>2) довжина символів становить більше 50 знаків
            <br>3) кількість елементів масиву filters не може перевищувати зазначену кількість фільтрів(15)</td>
            <td align="center">Неправильний</td>
            <td align="center">competitionName.length() > 50
            <br>filters[8]</td>
        </tr>
        <tr>
            <td align="center">1) competitionName починається з латинської літери
            <br>2) довжина символів не повинна становити більше 50
            <br>3) кількість елементів масиву filters перевищує зазначену кількість фільтрів(15)</td>
            <td align="center">Неправильний</td>
            <td align="center">competitionName = "NewCompetition"
            <br>filters[16]</td>
        </tr>
    </tbody>
</table>
