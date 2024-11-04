#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "bancofamilia" <<-EOSQL
 CREATE SCHEMA IF NOT EXISTS pix;
 GRANT ALL PRIVILEGES ON SCHEMA pix TO postgres;
EOSQL