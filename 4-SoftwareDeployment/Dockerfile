FROM postgres
LABEL description="Test Docker for PostgreSQL"
LABEL mainteiner="Evchev Denis, den718377@gmail.com"
LABEL version="1.0"

ENV POSTGRES_USER evchev
ENV POSTGRES_PASSWORD 4213
ENV POSTGRES_DATABASE evchevdb

COPY ./db_script.sql /docker-entrypoint-initdb.d/

