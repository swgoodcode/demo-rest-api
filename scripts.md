docker run --name rest 5432:5432 -e POSTGRES_PASSWORD=pass -d postgres

### connect to a database
psql -d postgres -U postgres

Password for user postgres: 1234