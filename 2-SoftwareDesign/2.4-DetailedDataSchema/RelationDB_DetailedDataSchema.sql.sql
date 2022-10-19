drop table users CASCADE;
drop table active_competitions CASCADE;
drop table sponsor CASCADE;
drop table viewer CASCADE;
drop table sportsman CASCADE;
drop table completed_competitions CASCADE;
drop table sport_types CASCADE;
drop table sportsman_sponsor CASCADE;
drop table actcomp_sponsor CASCADE;
drop table actcomp_sprtypes CASCADE;
drop table actcomp_sportsman CASCADE;
drop table comlcomp_sportsman CASCADE;
drop table comlcomp_sprtypes CASCADE;

CREATE TABLE users(
	account_type VARCHAR check (account_type IN ('Глядач', 'Спортсмен', 'Спонсор')),
	user_name VARCHAR(50),
	surname VARCHAR(50),
	balance DECIMAL(10, 2) check (balance >= 0),
	preferred_sport VARCHAR(50)
	mobile VARCHAR(50) CHECK(mobile ~* '^\+?3?8?(0[\s\.-]\d{2}[\s\.-]\d{3}[\s\.-]\d{2}[\s\.-]\d{2})$'),
	email VARCHAR(50) CHECK(email ~* '^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$')
);

CREATE TABLE active_competitions(
	actcomp_id INT PRIMARY KEY,
	comlcomp_name VARCHAR(50),
	comlcomp_date DATE,
	adress VARCHAR(100),
	participants_number INT check (participants_number >= 0)
);

CREATE TABLE sponsor(
	sponsor_id INT PRIMARY KEY
) inherits(users);

CREATE TABLE viewer(
	viewer_id INT PRIMARY KEY,
	selected_competition INT REFERENCES active_competitions(actcomp_id)
) inherits(users);

CREATE TABLE sportsman(
	sportsman_id INT PRIMARY KEY,
	victories INT check (victories >= 0)
) inherits(users);

CREATE TABLE completed_competitions(
	comlcomp_id INT PRIMARY KEY,
	comlcomp_name VARCHAR(50),
	comlcomp_date DATE,
	adress VARCHAR(100),
	winner INT REFERENCES sportsman(sportsman_id)
);

CREATE TABLE sport_types(
	type_id INT PRIMARY KEY,
	type_name VARCHAR(50)
);

CREATE TABLE sportsman_sponsor(
	sponsor_id INT REFERENCES sponsor(sponsor_id),
	sportsman_id INT REFERENCES sportsman(sportsman_id),
	sportsman_name VARCHAR(50)
);

CREATE TABLE actcomp_sponsor(
	sponsor_id INT REFERENCES sponsor(sponsor_id),
	actcomp_id INT REFERENCES active_competitions(actcomp_id),
	competition_name VARCHAR(50)
);

CREATE TABLE actcomp_sprtypes(
	actcomp_id INT REFERENCES active_competitions(actcomp_id),
	type_id INT REFERENCES sport_types(type_id),
	type_name VARCHAR(50)
);

CREATE TABLE actcomp_sportsman(
	actcomp_id INT REFERENCES active_competitions(actcomp_id),
	sponsor_id INT REFERENCES sponsor(sponsor_id),
	sportsman_name VARCHAR(50),
	competition_name VARCHAR(50)
);

CREATE TABLE comlcomp_sportsman(
	sponsor_id INT REFERENCES sponsor(sponsor_id),
	comlcomp_id INT REFERENCES completed_competitions(comlcomp_id),
	sportsman_name VARCHAR(50),
	competition_name VARCHAR(50)
);

CREATE TABLE comlcomp_sprtypes(
	type_id INT REFERENCES sport_types(type_id),
	comlcomp_id INT REFERENCES completed_competitions(comlcomp_id),
	type_name VARCHAR(50)
);
