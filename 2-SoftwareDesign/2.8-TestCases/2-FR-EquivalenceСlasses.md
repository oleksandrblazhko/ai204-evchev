<table>
    <thead align="center">
        <tr>
            <td>Опис вхідних умов</td>
            <td>Правильний/неправильний клас еквівалентності</td>
            <td>Опис значень вхідних даних</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td align="center">1) competitionName починається з латинської літери
            2) довжина символів не повинна становити більше 50
            3) кількість елементів масиву filters не може перевищувати зазначену кількість фільтрів(15)</td>
            <td>Правильний</td>
            <td>competitionName = "NewCompetition"
            filters[8]</td>
        </tr>
        <tr>
            <td align="center">1) competitionName не починається з латинської літери
            2) довжина символів не повинна становити більше 50
            3) кількість елементів масиву filters не може перевищувати зазначену кількість фільтрів(15)</td></td>
            <td>Неправильний</td>
            <td>competitionName = "1NewCompetition"
            filters[8]</td>
        </tr>
        <tr>
            <td align="center">1) competitionName починається з латинської літери
            2) довжина символів становить більше 50 знаків
            3) кількість елементів масиву filters не може перевищувати зазначену кількість фільтрів(15)</td>
            <td>Неправильний</td>
            <td>competitionName.length() > 50
            filters[8]</td>
        </tr>
        <tr>
            <td align="center">1) competitionName починається з латинської літери
            2) довжина символів не повинна становити більше 50
            3) кількість елементів масиву filters перевищує зазначену кількість фільтрів(15)</td>
            <td>Неправильний</td>
            <td>competitionName = "NewCompetition"
            filters[16]</td>
        </tr>
    </tbody>
</table>
