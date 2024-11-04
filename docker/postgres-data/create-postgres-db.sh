#!/bin/bash
set -e

echo "inicio"

# Function to create a database if it does not exist
create_db_if_not_exists() {
  local dbname=$1
  psql --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" -tc "SELECT 1 FROM pg_database WHERE datname = '$dbname'" | grep -q 1 || \
  psql --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" -c "CREATE DATABASE $dbname"
}

# Create databases
create_db_if_not_exists "bancofamilia"

echo "fim"