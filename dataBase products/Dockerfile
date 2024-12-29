FROM postgres:latest

ENV POSTGRES_USER=johan
ENV POSTGRES_PASSWORD=1004064256
ENV_POSTGRES_DB=postgres

COPY ./init.sql /docker-entrypoint-initdb.d/

EXPOSE 5432
